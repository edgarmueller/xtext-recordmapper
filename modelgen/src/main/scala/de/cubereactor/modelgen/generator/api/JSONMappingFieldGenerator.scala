package de.cubereactor.modelgen.generator.api

import de.cubereactor.modelgen.generator.FieldGenerator
import de.cubereactor.modelgen.model.ObjectRefType
import de.cubereactor.modelgen.model.DATETIME
import de.cubereactor.modelgen.model.DOUBLE
import de.cubereactor.modelgen.model.INT
import de.cubereactor.modelgen.model.ListType
import de.cubereactor.modelgen.model.BOOL
import de.cubereactor.modelgen.model.StringType
import de.cubereactor.modelgen.model.BaseType
import de.cubereactor.modelgen.model.STRING
import de.cubereactor.modelgen.model.Field
import de.cubereactor.modelgen.model.DateTimeType
import de.cubereactor.modelgen.dsl.DSL._
import de.cubereactor.modelgen.model.DoubleType
import de.cubereactor.modelgen.model.IntType
import de.cubereactor.modelgen.model.BoolType

class JSONMappingFieldGenerator(parentGenerator: JSONMappingGenerator) extends FieldGenerator(parentGenerator) {

  override def imports(f: Field) = calcImports(f.baseType)

  def calcImports(baseType: BaseType): List[String] = {
    baseType match {
      case DateTimeType()            => List("org.joda.time.DateTime")
      case DateTimeType(annotations) => List("org.joda.time.DateTime")
      case ListType(b)               => calcImports(b)
      case ListType(b, annotations)  => calcImports(b)
      case _                         => List()
    }
  }

  def generate(f: Field) = {
    serializer add s""""${f.name}" -> """ + generateMappingTarget(f.baseType, f)
  }

  def generateMappingTarget(baseType: BaseType, f: Field): String = {
    baseType match {
      case StringType() => "text"
      case s @ StringType(_) if s.annotations.get(validation).exists(_ == email) => "email"
      case s @ StringType(_) if s.annotations.get(validation).exists(_ == nonEmpty) => "nonEmptyText"
      case s @ StringType(_) if s.annotations.exists(t => t._1 == length) => "text(" + calcLength(s.annotations.get(length).get) + ")"
      case StringType() => "text"
      case IntType()    => "number"
      case DoubleType() => "number"
      case BoolType() => "boolean"
      case DateTimeType() => "date" 
      case ObjectRefType(entity) => s"${entity.name.toLowerCase}Mapping"
      case ListType(t) => s"list(${generateMappingTarget(t, f)})"
    }
  }
  
  def calcLength(tuple: String): String = {
    tuple match {
      case "default" => "0,250"
      case _       => {
        val x = tuple.splitAt(tuple.indexOf(","))
        x._1.drop(1) + x._2.substring(0, x._2.indexOf(")"))
      }
    }
  }

}
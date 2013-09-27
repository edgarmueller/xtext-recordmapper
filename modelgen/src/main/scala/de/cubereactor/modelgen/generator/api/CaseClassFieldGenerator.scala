package de.cubereactor.modelgen.generator.api

import de.cubereactor.modelgen.model.BoolType
import de.cubereactor.modelgen.model.ObjectRefType
import de.cubereactor.modelgen.model.DoubleType
import de.cubereactor.modelgen.generator.EntityGenerator
import de.cubereactor.modelgen.model.DateTimeType
import de.cubereactor.modelgen.model.ListType
import de.cubereactor.modelgen.model.StringType
import de.cubereactor.modelgen.model.BaseType
import de.cubereactor.modelgen.model.IntType
import de.cubereactor.modelgen.model.Field
import de.cubereactor.modelgen.generator.FieldGenerator
import de.cubereactor.modelgen.model.EnumType

class CaseClassFieldGenerator(parentGenerator: CaseClassGenerator) extends FieldGenerator(parentGenerator) {

  def generate(f: Field) = {
    serializer add s"${f.name}: ${generateType(f.baseType)}"
  }

  def generateType(baseType: BaseType): String = {
    // case class field generator does not support annotations
    baseType match {
      case StringType()          => "String"
      case IntType()             => "Int"
      case DoubleType()          => "Double"
      case BoolType()            => "Boolean"
      case DateTimeType()        => "DateTime"
      case ObjectRefType(entity) => entity.name
      case ListType(b)           => s"List[${generateType(b)}]"
      case EnumType(e)           => e.name 
      case _ => s"<no field matched>"
    }
  }
  
  override def imports(f: Field) = getImportsBasedOnType(f.baseType)

  def getImportsBasedOnType(baseType: BaseType): List[String] = {
    baseType match {
      case DateTimeType() => List("org.joda.time.DateTime")
      case ListType(t)    => getImportsBasedOnType(t)
      case _              => List()
    }
  }
}
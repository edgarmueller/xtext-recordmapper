package de.cubereactor.modelgen.generator.mongo

import de.cubereactor.modelgen.generator.FieldGenerator
import de.cubereactor.modelgen.model.Field
import de.cubereactor.modelgen.model.ObjectRefType
import de.cubereactor.modelgen.model.DATETIME
import de.cubereactor.modelgen.model.DOUBLE
import de.cubereactor.modelgen.model.INT
import de.cubereactor.modelgen.model.ListType
import de.cubereactor.modelgen.model.BOOL
import de.cubereactor.modelgen.model.STRING
import de.cubereactor.modelgen.model.BaseType
import de.cubereactor.modelgen.model.StringType
import de.cubereactor.modelgen.model.IntType
import de.cubereactor.modelgen.model.BoolType
import de.cubereactor.modelgen.model.DoubleType
import de.cubereactor.modelgen.model.DateTimeType
import de.cubereactor.modelgen.model.EnumType

class BSONRecordFieldGenerator(parentGenerator: BSONRecordGenerator) extends FieldGenerator(parentGenerator) {
  
  override def imports(f: Field): List[String] = {
    f.baseType match {
      case StringType()     => List("net.liftweb.record.field.StringField")
      case IntType()        => List("net.liftweb.record.field.IntField")
      case BoolType()       => List("net.liftweb.record.field.BooleanField")
      case EnumType(value)  => List("net.liftweb.record.field.EnumNameField")
      case ObjectRefType(e) => List("net.liftweb.mongodb.record.field.BsonRecordListField")
      // TODO: handle remaining imports
    } 
  }

  def generate(f: Field) = {
    serializer add s"object ${f.name} extends " + generateTarget(f.baseType)
  }

  def generateTarget(baseType: BaseType) = {
    baseType match {
      case StringType(_) => "StringField(this,250)"
      case StringType() => "StringField(this,250)"
      case IntType() => "IntField(this)"
      case DoubleType() => "DoubleField(this)"
      case BoolType() => "BooleanField(this)"
      case DateTimeType() => "DateTimeField(this)"
      case ObjectRefType(entity) => s"BsonRecordField(this, ${entity.name})"
      // lists not supported
      case _ => ""
    }
  }
}
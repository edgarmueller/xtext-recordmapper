package de.cubereactor.modelgen.model

import scala.collection.mutable.MutableList

trait Identifiable {
  def name: String
}

trait HasChildren[C] {
  def children: List[C]
}

case class Entity(var name: String, fields: MutableList[Field] = new MutableList()) extends Identifiable with HasChildren[Field] {
  def children = fields.toList
}
case class Enum(var name: String, values: MutableList[String] = new MutableList()) extends Identifiable with HasChildren[String] {
  def children = values.toList
}
// TODO: use dedicated structure for annotation, do we need to support more than one annotation?
case class Field(var name: String, baseType: BaseType) extends Identifiable

// deployment model
case class Project(name: String, packages: Traversable[DeploymentPackage])

case class DeploymentPackage(var name: String, var path: String, deployables: MutableList[Deployable]) extends HasChildren[Deployable] {
  def children = deployables.toList
}

sealed trait Deployable
trait EntityRepresentation extends Deployable {
  def entity: Entity
}

case class CompositeEntityRepresentation(entity: Entity, val representations: EntityRepresentation*) extends EntityRepresentation
case class CaseClass(entity: Entity) extends EntityRepresentation
case class MongoRecord(entity: Entity, annotations: Map[String, String] = Map()) extends EntityRepresentation
case class BsonRecord(entity: Entity) extends EntityRepresentation
case class JSONMapping(entity: Entity, annotations: Map[String, String] = Map()) extends EntityRepresentation

class BaseType(val annotations: Map[String, String] = Map())
class RawType(a: Map[String, String]) extends BaseType(a)
class BaseRefType(a: Map[String, String]) extends BaseType(a)

case class BoolType(a: (String, String)*) extends RawType(a.toMap)
case class StringType(a: (String, String)*) extends RawType(a.toMap)
case class IntType(a: (String, String)*) extends RawType(a.toMap)
case class DoubleType(a: (String, String)*) extends RawType(a.toMap)
case class DateTimeType(a: (String, String)*) extends RawType(a.toMap)

case class ListType(baseType: BaseType, a: (String, String)*) extends BaseType(a.toMap)

case class ObjectRefType(entity: Entity, a: (String, String)*) extends BaseRefType(a.toMap)
case class EnumType(enum: Enum, a: (String, String)*) extends BaseRefType(a.toMap)

object STRING extends StringType
object INT extends IntType
object DOUBLE extends DoubleType
object BOOL extends BoolType
object DATETIME extends DateTimeType

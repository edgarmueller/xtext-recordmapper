package de.cubereactor.modelgen.dsl

import scala.collection.mutable.MutableList
import de.cubereactor.modelgen.model._

object DSL {

  trait Builder[B, E] {

    // TODO: self only used for enabling internal builder pattern, alternatives?
    self: B =>
    def +=(x: E) = {
      self.list += x
      self
    }

    def +=(xs: E*) = {
      xs foreach { self.list += _ }
      self
    }

    def +=(xs: Traversable[E]) = {
      xs foreach { self.list += _ }
      self
    }

    def +=(builder: Builder[B, E]) = {
      builder.list foreach { list += _ }
    }

    def list: MutableList[E]
  }

  class EntityBuilder(val entity: Entity) extends Builder[EntityBuilder, Field] {
    def list = entity.fields
  }
  
  class EnumBuilder(val enum: Enum) extends Builder[EnumBuilder, String] {
    def list = enum.values
  }

  implicit def builder2Entity(builder: EntityBuilder) = builder.entity
  implicit def packageBuilderToPackage(builder: DeploymentPackageBuilder) = builder.pckg
  implicit def builder2Enum(builder: EnumBuilder) = builder.enum

  def enum(values: String*) = new EnumBuilder(new Enum("", MutableList() ++ values))
  def entity = new EntityBuilder(new Entity(""))
  def string = Field("", STRING)
  def string(annotations: (String, String)*) = Field("", new StringType(annotations: _*))
  def int = Field("", INT)
  def double = Field("", DOUBLE)
  def datetime = Field("", DATETIME)
  def bool = Field("", BOOL)
  def ref(entity: Entity) = Field("", ObjectRefType(entity))
  def enum(enum: EnumBuilder) = Field("", EnumType(enum))
  def list(f: Field) = Field("", ListType(f.baseType)) // TODO: pass field itself, since annotations are lost here
  def list(e: Entity) = Field("", ListType(ObjectRefType(e)))

  def deployable = new DeploymentPackageBuilder(new DeploymentPackage("", "", MutableList()))

  class DeploymentPackageBuilder(val pckg: DeploymentPackage) extends Builder[DeploymentPackageBuilder, Deployable] {
    def list = pckg.deployables
  }

  implicit class XField(name: String) {
    def is(f: Field) = {
      f.name = name
      f
    }
  }
  
  
  implicit class XEnumBuilder(enumName: String) {
    def is(builder: EnumBuilder): EnumBuilder = {
      builder.enum.name = enumName
      builder
    }
  }

  implicit class XEntityBuilder(name: String) {
    def is(builder: EntityBuilder): EntityBuilder = {
      builder.entity.name = name
      builder
    }
  }

  implicit class XDeployablePackageBuilder(absolutePath: (String, String)) {
    def is(builder: DeploymentPackageBuilder): DeploymentPackageBuilder = {
      builder.pckg.path = absolutePath._1
      builder.pckg.name = absolutePath._2
      builder
    }
  }

  implicit class XEntityDeployable(entity: EntityBuilder) {
    def as(m: mongo.type) = {
      MongoRecord(entity)
    }
    def as(m: mongo) = {
      MongoRecord(entity, m.annotations.toMap)
    }
    def as(a: api.type) = {
      CompositeEntityRepresentation(entity,
        CaseClass(entity),
        JSONMapping(entity))
    }
    def as(a: api) = {
      CompositeEntityRepresentation(entity,
        CaseClass(entity), 
        JSONMapping(entity, a.annotations.toMap))
    }
  }

  implicit def intTuple2String(lengthSpecs: (Int, Int)): String = {
      "(" + lengthSpecs._1 + "," + lengthSpecs._2 + ")"
  }

  // keywords
  object mongo
  object api
  case class mongo(annotations: (String, String)*)
  case class api(annotations: (String, String)*)
  case class json(annotations: (String, String)*)

  val validation = "validation"
  val nonEmpty = "nonEmpty"
  val email = "email"
  val length = "length"
  val default = "default"

}

package de.cubereactor.modelgen.generator.api

import de.cubereactor.modelgen.model._
import de.cubereactor.modelgen.dsl.DSL._
import de.cubereactor.modelgen.generator.EntityGenerator
import de.cubereactor.modelgen.generator.FieldGenerator
import de.cubereactor.modelgen.generator.Serializer

class JSONMappingGenerator(val serializer: Serializer) extends EntityGenerator {

  def generate(e: Entity) = {
    serializer addLn s"val ${e.name.mappingName} = mapping("
    sepLoop(e.fields, ",")
    serializer addLn s")(${e.name}.apply)(null)"
  }

  implicit class XString(name: String) {
    def mappingName = name.toLowerCase + "Mapping"
  }

  def childGenerator = new JSONMappingFieldGenerator(this) 

}
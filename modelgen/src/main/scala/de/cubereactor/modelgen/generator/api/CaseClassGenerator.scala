package de.cubereactor.modelgen.generator.api

import de.cubereactor.modelgen.model._
import de.cubereactor.modelgen.generator.EntityGenerator
import de.cubereactor.modelgen.generator.FieldGenerator
import de.cubereactor.modelgen.generator.Serializer

class CaseClassGenerator(val serializer: Serializer) extends EntityGenerator {

  def generate(e: Entity) = {
    serializer blockComment s"CaseClass: ${e.name}" addLn s"case class ${e.name} ("
    sepLoop(e.fields, ",")
    serializer addLn (s")")
  }

  def childGenerator = new CaseClassFieldGenerator(this)

}

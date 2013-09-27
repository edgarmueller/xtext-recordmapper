package de.cubereactor.modelgen.generator.api

import de.cubereactor.modelgen.generator.Serializer
import de.cubereactor.modelgen.generator.EnumGenerator
import de.cubereactor.modelgen.model.Enum

class ScalaEnumGenerator(val serializer: Serializer) extends EnumGenerator {

  def generate(e: Enum) = {
    serializer addLn s"object ${e.name} extends Enumeration {"
    serializer addLn s"type ${e.name} = Value"
    serializer addLn s"val ${e.values.mkString(", ")} = Value"
    serializer addLn "}"
  }
 
}
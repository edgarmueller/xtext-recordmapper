package de.cubereactor.modelgen.generator.mongo

import de.cubereactor.modelgen.generator.EntityGenerator
import de.cubereactor.modelgen.model.Entity
import de.cubereactor.modelgen.generator.Serializer

class BSONRecordGenerator(val serializer: Serializer) extends EntityGenerator {

  def generate(e: Entity) = {
    serializer comment s"BsonRecord: ${e.name}."
    serializer addLn s"class ${e.name} extends BsonRecord[${e.name}] {"
    serializer addLn s"def meta = ${e.name}"
    serializer.newLine
    this loop e.fields
    serializer.newLine
    serializer addLn s"}"
    serializer addLn s"object ${e.name} extends ${e.name} with BsonMetaRecord[${e.name}] {"
    serializer addLn s"}"
    serializer.newLine
  }
  
  def childGenerator = new BSONRecordFieldGenerator(this)

}
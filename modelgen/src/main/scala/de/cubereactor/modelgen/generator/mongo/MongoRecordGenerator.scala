package de.cubereactor.modelgen.generator.mongo

import de.cubereactor.modelgen.model.Entity
import de.cubereactor.modelgen.generator.Serializer

class MongoRecordGenerator(serializer: Serializer) extends BSONRecordGenerator(serializer) {
  
  override def generate(e: Entity) = {
    serializer comment s"MongoRecord: ${e.name}."
    serializer addLn s"class ${e.name} extends MongoRecord[${e.name}] {"
    serializer addLn s"def meta = ${e.name}"
    serializer.newLine
    this loop e.fields
    serializer.newLine
    serializer addLn s"override def save() = save(WriteConcern.SAFE)"
    serializer.newLine
    serializer addLn s"}"
    serializer addLn s"object ${e.name} extends ${e.name} with MongoMetaRecord[${e.name}] {"
    serializer addLn s"}"
    serializer.newLine
  }
  
}
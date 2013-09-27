import org.specs2.mutable.Specification
import de.cubereactor.modelgen.model._
import de.cubereactor.modelgen.dsl.DSL._
import de.cubereactor.modelgen.generator.GeneratorDriver
import de.cubereactor.modelgen.generator.ImportUtil
import de.cubereactor.modelgen.generator.DeploymentPackageGenerator
import de.cubereactor.modelgen.generator.Serializer
import java.io.File

class GeneratorSpec extends Specification {

  "Generator" should {

    "generate correct reference to other entity mapping as API mapping" in new TestScope {
      val s = GeneratorDriver.generate(project)
      // TODO: spaces in comment
      s.last.replace(sys.props("line.separator"), "") mustEqual """package B

import path.a

/** 
* CaseClass: entityB 
*/
case class entityB (
name: String,
myA: entityA
)
val entitybMapping = mapping(
"name" -> text,
"myA" -> entityaMapping
)(entityB.apply)(null)

""".replace("\n", "")
    }
    
    "generate correct reference to other entity mapping as mongo mapping" in new TestScope {
      val s = GeneratorDriver.generate(mongoProject)
      s.last.replace(sys.props("line.separator"), "") mustEqual """package MongoB

import net.liftweb.record.field.StringField
import net.liftweb.mongodb.record.field.BsonRecordListField
import path.mongo.a

// MongoRecord: entityB.
class entityB extends MongoRecord[entityB] {
def meta = entityB

object name extends StringField(this,250)
object myA extends BsonRecordField(this, entityA)

override def save() = save(WriteConcern.SAFE)

}
object entityB extends entityB with MongoMetaRecord[entityB] {
}
""".replace("\n", "")
    }
    
    "correctly generated nested lists" in new TestScope {
    	val s = GeneratorDriver.generate(mkAPIProject("", "", entityC))
    	println(s)
    }

    "correctly generate files" in new TestScope {
      val s = GeneratorDriver.generate(outputDir, project)
      "Deployable A exists" ! pkgFileExists(deployableA)
      "Deployable B exists" ! pkgFileExists(deployableB)
    }
    
  }
}
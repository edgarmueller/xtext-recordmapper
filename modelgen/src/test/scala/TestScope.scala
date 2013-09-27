
import org.specs2.specification.Scope
import de.cubereactor.modelgen.dsl.DSL._
import de.cubereactor.modelgen.model._
import de.cubereactor.modelgen.generator.DeploymentPackageGenerator
import de.cubereactor.modelgen.generator.Serializer
import de.cubereactor.modelgen.generator.ImportUtil
import java.io.File
import org.specs2.mutable.After

class TestScope extends After {

    // --
    val entityA = "entityA" is entity += List(
      "name" is string)

    val entityB = "entityB" is entity += List(
      "name" is string,
      "myA" is ref(entityA))
      
    val entityC = "entityC" is entity += List(
      "listOfA" is list(entityA),
      "nestedEmailList" is list(list(string(validation -> email))))

    val deployableA = "path.a" -> "A" is deployable += List(entityA as api)
    val deployableB = "path.b" -> "B" is deployable += List(entityB as api)
    val deployableC = "path.c" -> "C" is deployable += List(entityC as api)
    
    val mongoDeployableA = "path.mongo.a" -> "MongoA" is deployable += List(entityA as mongo)
    val mongoDeployableB = "path.mongo.b" -> "MongoB" is deployable += List(entityB as mongo)

    val project = Project("", List(deployableA, deployableB))
    val mongoProject = Project("MongoProject", List(mongoDeployableA, mongoDeployableB))
    val gen = new DeploymentPackageGenerator(new Serializer, ImportUtil.imports(project))
    
    def mkAPIProject(path: String, name: String, xs: EntityBuilder*) = {
      Project("", List(path -> name is deployable += (xs map (_ as api))))
    }
    
    def outputDir = sys.props("user.home")
    
    def after = {
      deleteDeploymentPackage(deployableA.pckg)
      deleteDeploymentPackage(deployableB.pckg)
      deleteDeploymentPackage(deployableC.pckg)
    }
    
    def deleteDeploymentPackage(pkg: DeploymentPackage) {
      val f = new File(outputDir + File.separatorChar + pkg.path)
      if (f.exists) {
        f.delete
      }
    }
    
    def pkgFileExists(pkg: DeploymentPackage): Boolean = {
      val f = new File(outputDir + File.separatorChar + pkg.path)
      f.exists
    }
}
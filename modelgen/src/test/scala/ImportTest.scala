import org.specs2.mutable.Specification
import de.cubereactor.modelgen.model._
import de.cubereactor.modelgen.dsl.DSL._
import de.cubereactor.modelgen.generator.GeneratorDriver
import de.cubereactor.modelgen.generator.ImportUtil
import de.cubereactor.modelgen.generator.DeploymentPackageGenerator
import de.cubereactor.modelgen.generator.Serializer

class ImportTest extends Specification {

  "Imports" should {

    "resolve uniquly by not allowing duplicate imports" in new TestScope {
      val imports = gen.imports(deployableB)
      imports.distinct.size mustEqual imports.size
    }

    "resolve entity A if entity B has a reference to A" in new TestScope{
      val imports = gen.imports(deployableB)
      imports.contains("path.a") must beTrue
    }
    
    "resolve entity A if entity C has a reference to list of A" in new TestScope {
      val imports = gen.imports(deployableC)
      imports.contains("path.a") must beTrue
    }
    
  }
}
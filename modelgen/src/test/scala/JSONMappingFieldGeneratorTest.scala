
import org.specs2.mutable.Specification
import org.specs2.specification.Scope
import de.cubereactor.modelgen.generator.Serializer
import de.cubereactor.modelgen.generator.api.JSONMappingGenerator
import de.cubereactor.modelgen.generator.api.JSONMappingFieldGenerator
import de.cubereactor.modelgen.model.Field
import de.cubereactor.modelgen.model.IntType
import de.cubereactor.modelgen.model.DoubleType
import de.cubereactor.modelgen.model.StringType
import de.cubereactor.modelgen.model.BoolType
import de.cubereactor.modelgen.model.DateTimeType
import de.cubereactor.modelgen.dsl.DSL._
import de.cubereactor.modelgen.model.ObjectRefType

class JSONMappingFieldGeneratorTest extends Specification {

  "JSON mapping field generator" should {

    trait WithSerializer extends Scope {
      val serializer = new Serializer
      val parentGenerator: JSONMappingGenerator = new JSONMappingGenerator(serializer)
      val generator: JSONMappingFieldGenerator = new JSONMappingFieldGenerator(parentGenerator)
    }

    "generate int field" in new WithSerializer {
      generator.generate(Field("foo", IntType()))
      serializer.finish mustEqual "\"foo\" -> number"
    }

    "generate double field" in new WithSerializer {
      generator.generate(Field("foo", DoubleType()))
      serializer.finish mustEqual "\"foo\" -> number"
    }

    "generate string field" in new WithSerializer {
      generator.generate(Field("foo", StringType()))
      serializer.finish mustEqual "\"foo\" -> text"
    }

    "generate string field with given length" in new WithSerializer {
      generator.generate(Field("foo", StringType(de.cubereactor.modelgen.dsl.DSL.length -> default)))
      serializer.finish mustEqual "\"foo\" -> text(0,250)"
    }

    "generate string field with given length" in new WithSerializer {
      generator.generate(Field("foo", StringType(de.cubereactor.modelgen.dsl.DSL.length -> (0, 100))))
      serializer.finish mustEqual "\"foo\" -> text(0,100)"
    }

    "generate string field with email validation rule " in new WithSerializer {
    	generator.generate(Field("foo", StringType(validation -> email)))
    	serializer.finish mustEqual "\"foo\" -> email"
    }
    
    "generate string field with non-empty validation rule " in new WithSerializer {
      generator.generate(Field("foo", StringType(validation -> nonEmpty)))
      serializer.finish mustEqual "\"foo\" -> nonEmptyText"
    }

    "generate boolean field" in new WithSerializer {
      generator.generate(Field("foo", BoolType()))
      serializer.finish mustEqual "\"foo\" -> boolean"
    }

    "generate datetime field" in new WithSerializer {
      val f = Field("foo", DateTimeType())
      generator.generate(f)
      generator.imports(f) must contain("org.joda.time.DateTime")
      serializer.finish mustEqual "\"foo\" -> date"
    }

    "generate object reference field" in new WithSerializer {
      val e = "Bar" is entity += "quux" is string
      val f = Field("foo", ObjectRefType(e))
      generator.generate(f)
      serializer.finish mustEqual "\"foo\" -> barMapping"
    }
  }
}
import org.specs2.mutable.Specification
import de.cubereactor.modelgen.generator.api.CaseClassFieldGenerator
import de.cubereactor.modelgen.generator.EntityGenerator
import de.cubereactor.modelgen.generator.api.CaseClassGenerator
import de.cubereactor.modelgen.generator.Serializer
import de.cubereactor.modelgen.model.IntType
import de.cubereactor.modelgen.model.Field
import de.cubereactor.modelgen.model.StringType
import de.cubereactor.modelgen.model.DateTimeType
import de.cubereactor.modelgen.model.BoolType
import de.cubereactor.modelgen.model.DoubleType
import de.cubereactor.modelgen.model.ListType
import de.cubereactor.modelgen.model.ObjectRefType
import de.cubereactor.modelgen.dsl.DSL._
import org.specs2.specification.Scope

class CaseClassFieldGeneratorTest extends Specification {

  "Case class field generator" should {

    trait WithSerializer extends Scope {
      val serializer = new Serializer
      val parentGenerator: CaseClassGenerator = new CaseClassGenerator(serializer)
      val generator: CaseClassFieldGenerator = new CaseClassFieldGenerator(parentGenerator)
    }

    "generate int field" in new WithSerializer {
      generator.generate(Field("foo", IntType()))
      serializer.finish mustEqual "foo: Int"
    }

    "generate double field" in new WithSerializer {
      generator.generate(Field("foo", DoubleType()))
      serializer.finish mustEqual "foo: Double"
    }

    "generate string field" in new WithSerializer {
      generator.generate(Field("foo", StringType()))
      serializer.finish mustEqual "foo: String"
    }

    "generate boolean field" in new WithSerializer {
      generator.generate(Field("foo", BoolType()))
      serializer.finish mustEqual "foo: Boolean"
    }

    "generate datetime field" in new WithSerializer {
      val f = Field("foo", DateTimeType())
      generator.generate(f)
      generator.imports(f) must contain("org.joda.time.DateTime")
      serializer.finish mustEqual "foo: DateTime"
    }

    "generate object reference field" in new WithSerializer {
      val e = "bar" is entity += "quux" is string
      val f = Field("foo", ObjectRefType(e))
      generator.generate(f)
      serializer.finish mustEqual "foo: bar"
    }
    
    "generate enum value field" in new WithSerializer {
      val weekday = "Weekday" is enum("mon", "tue", "wed")
      val bar = "bar" is entity += "day" is enum(weekday)
      val f = bar.fields(0)
      generator.generate(f)
      serializer.finish mustEqual "day: Weekday"
    }

    "generate list of int field" in new WithSerializer {
      generator generate Field("foo", ListType(IntType()))
      serializer.finish mustEqual "foo: List[Int]"
    }

    "generate list of double field" in new WithSerializer {
      generator generate Field("foo", ListType(DoubleType()))
      serializer.finish mustEqual "foo: List[Double]"
    }

    "generate list of string field" in new WithSerializer {
      generator generate Field("foo", ListType(StringType()))
      serializer.finish mustEqual "foo: List[String]"
    }

    "generate list of boolean field" in new WithSerializer {
      generator generate Field("foo", ListType(BoolType()))
      serializer.finish mustEqual "foo: List[Boolean]"
    }
 
    "generate list of datetime field" in new WithSerializer {
      val f = Field("foo", ListType(DateTimeType()))
      generator.generate(f)
      generator.imports(f) must contain("org.joda.time.DateTime")
      serializer.finish mustEqual "foo: List[DateTime]"
    }

    "generate list of object reference field" in new WithSerializer {
      val e = "bar" is entity += "quux" is string      
      generator generate Field("foo", ListType(ObjectRefType(e)))
      serializer.finish mustEqual "foo: List[bar]"
    }
    
    "generate list of enum values" in new WithSerializer { 
      // TODO
    }
    
     "generate list of list of int reference field" in new WithSerializer {
      generator generate Field("foo", ListType(ListType(IntType())))
      serializer.finish mustEqual "foo: List[List[Int]]"
    }
  }
}
import org.specs2.mutable.Specification
import org.specs2.specification.Scope
import de.cubereactor.modelgen.generator.Serializer
import de.cubereactor.modelgen.generator.EnumGenerator
import de.cubereactor.modelgen.generator.api.ScalaEnumGenerator
import de.cubereactor.modelgen.dsl.DSL._

class EnumGeneratorSpec extends Specification {

  "Enum generator" should {

    trait WithSerializer extends Scope {
      val serializer = new Serializer
      val generator: EnumGenerator = new ScalaEnumGenerator(serializer)
    }

    "be able to generate correct scala enums" in new WithSerializer {
      val weekday = "Weekday" is enum("mon", "tue", "wed")
      val bar = "bar" is entity += enum(weekday)
      generator.generate(weekday)
      serializer.finish.replace(sys.props("line.separator"), "") mustEqual 
      """object Weekday extends Enumeration {
type Weekday = Value
val mon, tue, wed = Value
}
""".replace(sys.props("line.separator"), "")
    }
  }
}
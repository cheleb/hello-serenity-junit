import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith
import junit.framework.TestCase
import munit.FunSuite
import net.serenitybdd.cucumber.CucumberWithSerenity

@RunWith(classOf[CucumberWithSerenity])
@CucumberOptions(
  plugin = Array("pretty", "html:target/cucumber/html"),
  features = Array("classpath:features"),
  tags = "not @Wip",
  glue = Array("classpath:steps")
)
class MUnitRunner
//  extends munit.FunSuite {
//   test("example test that succeeds") {
//     val obtained = 42
//     val expected = 42
//     assertEquals(obtained, expected)
//   }
// }

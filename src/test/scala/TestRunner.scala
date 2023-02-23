import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith
import junit.framework.TestCase
import munit.FunSuite
import net.serenitybdd.cucumber.CucumberWithSerenity

@RunWith(classOf[CucumberWithSerenity])
@CucumberOptions(
  plugin = Array("pretty"),
  features = Array("src/test/resources/features")
)
class TestRunner extends TestCase {
//   test("example test that succeeds") {
//     val obtained = 42
//     val expected = 42
//     assertEquals(obtained, expected)
//   }

}

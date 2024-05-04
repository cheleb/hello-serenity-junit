package sstarter.wikipedia;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import org.assertj.core.api.Assertions.assertThat;
import net.serenitybdd.annotations.Managed
import scala.compiletime.uninitialized;

@ExtendWith(Array(classOf[SerenityJUnit5Extension]))
class WhenSearchingForTerms {

  /** Define the webdriver instance to be used for these tests
    */
  @Managed(driver = "chrome", options = "headless")
  var driver: WebDriver = uninitialized

  /** Navigation actions. This is a UIInteraction class so it will be
    * instantiated automatically by Serenity.
    */
  var navigate: NavigateActions = uninitialized

  /** Actions related to searches. This is a UIInteraction class so it will be
    * instantiated automatically by Serenity.
    */
  var search: SearchActions = uninitialized

  /** A page object representing a Wikipedia article that is currently appearing
    * in the browser. Page Objects are automatically initialised by Serenity.
    */
  var displayedArticle: DisplayedArticle = uninitialized

  @Test
  def searchBySingleKeyword(): Unit = {
    navigate.toTheHomePage();
    search.searchBy("Everest");
    Serenity.reportThat(
      "The first heading should be 'Mount Everest'",
      () =>
        assertThat(displayedArticle.getFirstHeading())
          .isEqualTo("Mount Everest")
    );
  }

}

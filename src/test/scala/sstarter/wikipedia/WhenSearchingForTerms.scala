package sstarter.wikipedia;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.SingleBrowser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import org.assertj.core.api.Assertions.assertThat;

@ExtendWith(Array(classOf[SerenityJUnit5Extension]))
class WhenSearchingForTerms {

  /** Define the webdriver instance to be used for these tests
    */
  @Managed(driver = "chrome", options = "headless")
  var driver: WebDriver = _

  /** Navigation actions. This is a UIInteraction class so it will be
    * instantiated automatically by Serenity.
    */
  var navigate: NavigateActions = _

  /** Actions related to searches. This is a UIInteraction class so it will be
    * instantiated automatically by Serenity.
    */
  var search: SearchActions = _

  /** A page object representing a Wikipedia article that is currently appearing
    * in the browser. Page Objects are automatically initialised by Serenity.
    */
  var displayedArticle: DisplayedArticle = _

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

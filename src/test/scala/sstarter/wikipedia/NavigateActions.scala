package sstarter.wikipedia

import net.serenitybdd.core.steps.UIInteractions
import net.serenitybdd.annotations.Step
//import net.thucydides.core.annotations.Step

/** UIInteractionSteps let us define action classes which regroup related
  * actions. The @Step annotation is used to indicate that this action will
  * appear as a step in the reports.
  */
class NavigateActions extends UIInteractions {
  @Step("Navigate to the home page")
  def toTheHomePage(): Unit = {
    openUrl("http://wikipedia.com/");
  }
}

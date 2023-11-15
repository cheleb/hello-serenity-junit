package sstarter.wikipedia;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

class DisplayedArticle extends PageComponent {

  @FindBy(id = "firstHeading")
  var firstHeading: WebElementFacade = _

  def getFirstHeading(): String = {
    firstHeading.getText();
  }
}

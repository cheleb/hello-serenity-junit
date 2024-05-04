package sstarter.wikipedia;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import scala.compiletime.uninitialized;

class DisplayedArticle extends PageComponent {

  @FindBy(id = "firstHeading")
  var firstHeading: WebElementFacade = uninitialized;

  def getFirstHeading(): String = {
    firstHeading.getText();
  }
}

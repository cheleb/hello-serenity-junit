package sstarter.wikipedia;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

class SearchActions extends UIInteractions {

  @Step("Search by keyword '{0}'")
  def searchBy(keyword: String): Unit = {
    // $("#searchInput").sendKeys(keyword, Keys.ENTER);
  }
}

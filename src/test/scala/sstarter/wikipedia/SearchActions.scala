package sstarter.wikipedia;

import net.serenitybdd.core.steps.UIInteractions;

import org.openqa.selenium.Keys;
import net.serenitybdd.annotations.Step

class SearchActions extends UIInteractions {

  @Step("Search by keyword '{0}'")
  def searchBy(keyword: String): Unit = {
    // $("#searchInput").sendKeys(keyword, Keys.ENTER);
  }
}

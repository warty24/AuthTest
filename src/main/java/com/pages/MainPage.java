package com.pages;

import com.codeborne.selenide.Selenide;
import com.core.base.PageTools;
import com.core.utils.Constants;
import org.openqa.selenium.By;


public class MainPage extends PageTools {

    private By searchBox = By.cssSelector("input#twotabsearchtextbox");
    private By dropDownBox = By.cssSelector("#searchDropdownBox");



    public void loadPage () {
        Selenide.open(Constants.MAIN_PAGE_URL);
    }
    public void search (String search) {
        waitForElementVisibility(searchBox);
        Selenide.$(searchBox).sendKeys(search);
        Selenide.$(searchBox).submit();
    }
    public void setFilter (String partition)
    {
        Selenide.$(dropDownBox).click();
        Selenide.$(By.linkText(partition)).click();
    }
}

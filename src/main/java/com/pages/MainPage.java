package com.pages;

import com.codeborne.selenide.Selenide;
import com.core.base.PageTools;
import com.core.utils.Constants;
import org.openqa.selenium.By;


public class MainPage extends PageTools {

    private By searchBox = By.cssSelector("input#twotabsearchtextbox");
    private By dropDownBox = By.cssSelector(".nav-search-scope.nav-sprite");
    private By bookPartition = By.cssSelector("#searchDropdownBox > option:nth-child(6)");

    public void loadPage () {
        Selenide.open(Constants.MAIN_PAGE_URL);
    }
    public void search (String search) {
        waitForElementVisibility(searchBox);
        type(search, searchBox);
        clickEnterButton();
       // Selenide.$(searchBox).submit();
    }
    public void setFilter ()
    {
        click(dropDownBox);
        click(bookPartition);
    }
}

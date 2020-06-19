package com.pages;

import com.codeborne.selenide.Selenide;
import com.core.base.PageTools;
import com.core.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class ProductPage extends PageTools {

    private By productTitle = By.cssSelector("span#productTitle");
    private By bookAuthor = By.cssSelector("div#bylineInfo");
    private By bestSeller = By.cssSelector("div.badge-wrapper");

    public void loadPage () {
        Selenide.open(Constants.EXPECTED_BOOK_URL);
    }
    public String getProductName() {
        return Selenide.$(productTitle).getText();
    }
    private  String getBookAuthorElement() {
        return Selenide.$(bookAuthor).getText();
    }
    public String getBookAuthor () {
        return cutStrFromTo(getBookAuthorElement(),'\n','(').replace("(Author),\n", "and ");
    }
    public boolean isBestSeller () {
        return (Selenide.$(bestSeller).exists());
    }
}

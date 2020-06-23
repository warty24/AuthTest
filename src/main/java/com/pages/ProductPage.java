package com.pages;

import com.codeborne.selenide.Selenide;
import com.core.base.PageTools;
import com.core.utils.Constants;
import org.openqa.selenium.By;

public class ProductPage extends PageTools {

    private By productTitle = By.cssSelector("span#productTitle");
    private By bookAuthor = By.cssSelector("span .a-declarative > a");
    private By bestSeller = By.cssSelector("div.badge-wrapper");

    public void loadPage () {
        Selenide.open(Constants.EXPECTED_BOOK_URL);
    }
    public String getProductName() {
        return getElementText(productTitle);
    }
    public String getBookAuthor() {
        try {
            return getElementText( bookAuthor);
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
            return "null";
        }
    }
    public boolean isBestSeller () {
        return isElementExists(bestSeller);
    }
}

package com.pages;

import com.codeborne.selenide.Selenide;
import com.collections.Book;
import com.collections.Collections;
import com.core.base.PageTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SearchPage extends PageTools {

    private By searchResults = By.cssSelector("div.s-include-content-margin.s-border-bottom.s-latency-cf-section");
    private By resultName = By.cssSelector("span.a-size-medium.a-color-base.a-text-normal");
    private By subString = By.cssSelector("div.a-row.a-size-base.a-color-secondary");

    public void findResults () {
       Collections.searchResults().addAll(Selenide.$$(searchResults));
    }
    public void parseResults () {
        for(WebElement we : Collections.searchResults()) {
            String name, author;
            name = we.findElement(resultName).getText();
            author = validateAuthor(we.findElement(subString).getText());
            Collections.bookList().add(new Book(name,author,isBestSeller(we)));
        }
    }

    public String validateAuthor (String s) {
        try {
            return cutStrFromTo(s, ' ', '|');
        }
        catch (StringIndexOutOfBoundsException ex){
            return s;
        }
    }
    public boolean isBestSeller (WebElement we) {
        if (we.getText().contains("Best Seller")) {
            return true;
        } else return false;
    }
}

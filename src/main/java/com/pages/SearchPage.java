package com.pages;

import com.collections.Book;
import com.collections.Collections;
import com.core.base.PageTools;
import org.openqa.selenium.By;



public class SearchPage extends PageTools {

    private By searchResults = By.cssSelector("div.s-include-content-margin.s-border-bottom.s-latency-cf-section");
    private By resultName = By.cssSelector("span.a-size-medium.a-color-base.a-text-normal");
    private By subString = By.cssSelector("div.a-row.a-size-base.a-color-secondary");

    public void findResults() {
        waitForElementVisibility(searchResults);
        Collections.searchResults().addAll(getElements(searchResults));
    }

    public void parseResults() {
        for(int i = 0; i<Collections.searchResults().size(); i++ ) {
            Book book = new Book();
            book.setName(getSubElementText(Collections.searchResults().get(i), resultName));
            book.setAuthor(validateAuthor(getSubElementText(Collections.searchResults().get(i), subString)));
            if(isElementContainsText(Collections.searchResults().get(i), "Best Seller")) {
                book.setBestSeller(true);
            }
            Collections.bookList().add(book);
        }

    }
    //branch testing

    private String validateAuthor(String s) {
        try {
            return cutStrFromTo(s, ' ', '|');
        } catch (StringIndexOutOfBoundsException ex) {
            return s;
        }
    }
}
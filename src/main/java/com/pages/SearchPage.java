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
            String name = getSubElementText(Collections.searchResults().get(i), resultName);
            String author = validateAuthor(getSubElementText(Collections.searchResults().get(i), subString));
            boolean isBestSeller = isElementContainsText(Collections.searchResults().get(i), "Best Seller");
            addABookToCollection(name,author,isBestSeller);
        }
        /*
        for (WebElement we : Collections.searchResults()) {
            addABookToCollection(getSubElementText(we, resultName),validateAuthor(getSubElementText(we, subString)),isBestSeller(we));
        }
        */
    }

    private String validateAuthor(String s) {
        try {
            return cutStrFromTo(s, ' ', '|');
        } catch (StringIndexOutOfBoundsException ex) {
            return s;
        }
    }

    private void addABookToCollection(String name, String author, boolean isBestSeller) {
        Collections.bookList().add(new Book(name, author, isBestSeller));
    }






}
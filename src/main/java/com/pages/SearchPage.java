package com.pages;

import com.core.base.PageTools;
import org.openqa.selenium.By;


public class SearchPage extends PageTools {

    private By searchResults = By.xpath("//div[@data-component-type='s-search-result']");


    private By bookTitle = By.xpath("//div[@data-component-type='s-search-result'][%s]//h2//span");
    private By bookAuthor = By.xpath("//div[@data-component-type='s-search-result'][%s]//h2/../div/*[2]");
    private By isBestSeller = By.xpath("//div[@data-component-type='s-search-result'][%s]//span[contains(@id, 'best-seller-label')]");


    public int getAmountOfBooks(){
        return getElements(searchResults).size();
    }

    public String getBookTitleByIndex(int index){
        return getElementText(bookTitle, index);
    }
    public String getBookAuthorByIndex(int index) {
       try {
            if (isElementExists(bookAuthor,index))return getElementText(bookAuthor, index);
            else return "null";
        }
       catch (AssertionError e){
           System.out.println(e.getMessage());
           return  "null";
       }
    }
    public boolean getIsBestSeller(int index){
        return isElementExists(isBestSeller, index);
    }

}
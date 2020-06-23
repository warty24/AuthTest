package com;

import com.actions.Actions;
import com.actions.SearchPageActions;
import com.collections.Book;
import com.core.base.BaseTest;
import com.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class AmazonTest extends BaseTest {
    @Test
    public void amazonTest() {

        Actions.mainPageActions().search("java");
        List<Book> listOfBooks = Actions.searchPageActions().getBooksFromSearchPage();


        Pages.productPage().loadPage();

        Book expectedBook = new Book();

        expectedBook.setName(Pages.productPage().getProductName());
        expectedBook.setAuthor(Pages.productPage().getBookAuthor());
        expectedBook.setBestSeller(Pages.productPage().isBestSeller());
        expectedBook.cOutBook();


            Assert.assertTrue(Actions.searchPageActions().isBookInCollection(listOfBooks,expectedBook),
                    "Expected book is not present");

    }
}

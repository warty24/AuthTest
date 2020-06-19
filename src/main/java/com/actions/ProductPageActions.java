package com.actions;

import com.collections.Book;
import com.collections.Collections;
import com.pages.Pages;

import static com.collections.Collections.expectedBook;

public class ProductPageActions {

    public void createExpectedBook () {
        Pages.productPage().loadPage();
        expectedBook().setBestSeller(Pages.productPage().isBestSeller());
        expectedBook().setName(Pages.productPage().getProductName());
        expectedBook().setAuthor(Pages.productPage().getBookAuthor());
    }
    public boolean findBookInCollection (){
        for(Book b : Collections.bookList()){
            if(isBooksEqual(b,expectedBook())) return true;
        }
        return false;
    }
    public boolean isBooksEqual (Book b1, Book b2)
    {
        if (b1.getName().contains(b2.getName())) return true;
        else return false;
    }
}

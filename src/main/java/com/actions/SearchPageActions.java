package com.actions;

import com.collections.Book;
import com.pages.Pages;
import java.util.ArrayList;
import java.util.List;

public class SearchPageActions {


    public List<Book> getBooksFromSearchPage(){
        List<Book> listOfBooks = new ArrayList<>();

        for (int i = 0; i < Pages.searchPage().getAmountOfBooks(); i++) {
            Book book = new Book();
            book.setName(Pages.searchPage().getBookTitleByIndex(i+1));
            book.setAuthor(Pages.searchPage().getBookAuthorByIndex(i+1));
            book.setBestSeller(Pages.searchPage().getIsBestSeller(i+1));

            listOfBooks.add(book);

        }
        return listOfBooks;
    }

    public boolean isBookInCollection (List<Book> bList, Book expectedBook)
    {
        for(Book b : bList) {
            if (b.bookComparator(expectedBook)) return true;
        }
        return false;
    }

}

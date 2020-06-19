package com.collections;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class Collections {

    private static ArrayList<Book> books;
    private static ArrayList<WebElement> searchResults;

    public static ArrayList<Book> bookList() {
        if (books == null) {
            books = new ArrayList<>();
        }
        return books;
    }
    public static ArrayList<WebElement> searchRelts() {
        if (searchResults == null) {
            searchResults = new ArrayList<>();
        }
        return searchResults;
    }
    public static void cOutAllBooks() {
        for(Book b : books) {
            b.coutBook();
        }
    }
}

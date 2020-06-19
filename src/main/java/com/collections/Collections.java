package com.collections;

import java.util.ArrayList;

public class Collections {

    private static ArrayList<Book> books;

    public static ArrayList<Book> bookList() {
        if (books == null) {
            books = new ArrayList<>();
        }
        return books;
    }
}

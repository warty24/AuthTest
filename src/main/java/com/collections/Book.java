package com.collections;

public class Book {

    private String name, author;
    private boolean isBestSeller;

    Book (String name, String author) {
        this.name = name;
        this.author = author;
    }

    void coutBook() {
        if(isBestSeller) {
            System.out.println("!!!!Best Seller!!!");
        }
        System.out.println(name + '\n' + author + '\n');
    }
    void setBestSeller(boolean isBestSeller) {
        this.isBestSeller = isBestSeller;
    }
    String getName() {
        return name;
    }
    String getAuthor() {
        return author;
    }
}


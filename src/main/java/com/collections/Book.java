package com.collections;

public class Book {

    private String name, author;
    private boolean isBestSeller;

    public Book (String name, String author) {
        this.name = name;
        this.author = author;
    }
    public Book (String name, String author, boolean isBestSeller) {
        this.name = name;
        this.author = author;
        this.isBestSeller = isBestSeller;
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


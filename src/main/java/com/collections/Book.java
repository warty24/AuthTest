package com.collections;

public class Book {

    private String name, author;
    private boolean isBestSeller;

    public Book () {
    }

    public void cOutBook() {
        if(isBestSeller) System.out.println("!!!!Best Seller!!!");
        System.out.println(name);
        if(author != "null") System.out.println(author);
    }
    public void setBestSeller(boolean isBestSeller) {
        this.isBestSeller = isBestSeller;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setAuthor (String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public boolean bookComparator (Book a){
        if (!(a.getName().equals(name))) return false;
        else if (!(a.getAuthor().equals(author))) return false;
        else if ((a.isBestSeller ^ isBestSeller)) return false;
        else return true;
    }
}


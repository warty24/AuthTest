package com.collections;

public class Book {

    private String name, author;
    private boolean isBestSeller;

    public Book () {
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
    @Override
    public boolean equals (Object o) {
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return name.equals(book.name) &&
                author.equals(book.author) &&
                isBestSeller == book.isBestSeller;
    }
    @Override
    public int hashCode(){
        int hash = 13;
        hash = hash * 47 + name.hashCode();
        hash = hash * 47 + author.hashCode();
        if (isBestSeller) hash *= 47;
        return hash;
    }

}


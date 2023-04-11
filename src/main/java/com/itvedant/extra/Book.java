package com.itvedant.extra;

public class Book {
    private String name;
    private String author;
    private Double price;

    public Book(String name, String author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
    }   
}

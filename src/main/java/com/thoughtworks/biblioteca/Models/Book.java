package com.thoughtworks.biblioteca.Models;

public class Book {

    private String author;
    private String title;
    private Integer year;

    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getBookName() {
        return this.title;
    }

    public String getAuthorName() {
        return this.author;
    }

    public Integer getYear(){
        return this.year;
    }

    public String getAllInformation() {
        return this.title + " - " + this.author + " - " + this.year;
    }
}

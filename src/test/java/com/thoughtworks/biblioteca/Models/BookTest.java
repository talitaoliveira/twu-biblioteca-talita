package com.thoughtworks.biblioteca.Models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldValidadeBookName() {
        Book book = new Book("AnyName Book", null, null);
        assertEquals("AnyName Book", book.getBookName());
    }

    @Test
    public void shouldValidateAlwaysRightName() {
        Book book = new Book("AnyName Book 2", null, null);
        assertEquals("AnyName Book 2", book.getBookName());
    }

    @Test
    public void shouldValidateAuthorName() {
        Book book = new Book("AnyNameBook", "Author Name", null);
        assertEquals("Author Name", book.getAuthorName());
    }

    @Test
    public void shouldValidadeYear() {
        Integer year = 2019;
        Book book = new Book("AnyNameBook", "Author Name", year);
        assertEquals(year, book.getYear());
    }

    @Test
    public void shoulValidadeAllInformationFromBook() {

        Integer year = 2019;
        Book book = new Book("AnyNameBook", "Author Name", year);
        String allInformation = "AnyNameBook - Author Name - " + year;
        assertEquals(allInformation, book.getAllInformation());

    }
}

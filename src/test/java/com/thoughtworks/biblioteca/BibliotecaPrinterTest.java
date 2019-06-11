package com.thoughtworks.biblioteca;

import com.thoughtworks.biblioteca.Models.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaPrinterTest {
    @Test

    public void shouldPrintCorrectly(){
        Book book = new Book("Any Book 3", "Any Name", 2019);
       // assertEquals("AnyName Book", book.getBookName());

    }

}

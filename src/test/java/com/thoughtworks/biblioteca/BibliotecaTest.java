package com.thoughtworks.biblioteca;

import com.thoughtworks.biblioteca.Models.Book;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {
    @Test
    // 1.1
    public void shouldPrintAWelcomeMessage() {
        String welcomeMessageExpected = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        BibliotecaPrinter printer = mock(BibliotecaPrinter.class);
        Biblioteca biblioteca = new Biblioteca(printer);

        biblioteca.start();

        verify(printer).print(welcomeMessageExpected);
    }

    @Test
    // 1.2
    public void shouldShowListOfBooksAfterWelcomeMessage() {

        BibliotecaPrinter printer = mock(BibliotecaPrinter.class);
        Biblioteca biblioteca = new Biblioteca(printer);
        List<Book> allBooksListed = biblioteca.booksOnLibrary;

        biblioteca.start();

        verify(printer).printAllBooks(allBooksListed);

    }

}

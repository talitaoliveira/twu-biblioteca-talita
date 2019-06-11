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
    // O que acontece com os testes a medida que vai tendo outras features que "sobrepõem" o que tinha antes?
    public void shouldShowListOfBooksAfterWelcomeMessage() {

        BibliotecaPrinter printer = mock(BibliotecaPrinter.class);
        Biblioteca biblioteca = new Biblioteca(printer);
        List<Book> allBooksListed = biblioteca.booksOnLibrary;

        biblioteca.start();

        verify(printer).printAllBooks(allBooksListed);

    }

    @Test
    public void shouldHaveOptionsOnMenuOptions() {

        BibliotecaPrinter printer = mock(BibliotecaPrinter.class);
        Biblioteca biblioteca = new Biblioteca(printer);

        assertFalse(biblioteca.getMenuOptions().isEmpty());
    }
}

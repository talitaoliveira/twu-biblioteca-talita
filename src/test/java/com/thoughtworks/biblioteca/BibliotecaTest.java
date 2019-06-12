package com.thoughtworks.biblioteca;

import com.thoughtworks.biblioteca.Models.Book;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {
    @Test
    // 1.1
    public void shouldPrintAWelcomeMessage() {
        String welcomeMessageExpected = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        BibliotecaPrinter printer = mock(BibliotecaPrinter.class);
        Menu menu = mock(Menu.class);
        Biblioteca biblioteca = new Biblioteca(printer, menu);

        biblioteca.start();

        verify(printer).print(welcomeMessageExpected);
    }

    @Test
    public void shouldShowMenuOptions() {
        BibliotecaPrinter printer = mock(BibliotecaPrinter.class);
        Menu menu = mock(Menu.class);
        Biblioteca biblioteca = new Biblioteca(printer, menu);

        biblioteca.start();

        verify(menu).listOptions();
    }

    @Test
    // 1.2
    // O que acontece com os testes a medida que vai tendo outras features que "sobrepõem" o que tinha antes?
    @Ignore
    public void shouldShowListOfBooksAfterWelcomeMessage() {

        BibliotecaPrinter printer = mock(BibliotecaPrinter.class);
        Menu menu = mock(Menu.class);
        Biblioteca biblioteca = new Biblioteca(printer, menu);
        List<Book> allBooksListed = biblioteca.booksOnLibrary;

        biblioteca.start();

        verify(printer).printAllBooks(allBooksListed);

    }

    @Test
    public void shouldHaveOptionsOnMenuOptions() {
        BibliotecaPrinter printer = mock(BibliotecaPrinter.class);
        Menu menu = mock(Menu.class);
        Biblioteca biblioteca = new Biblioteca(printer, menu);

        assertFalse(biblioteca.getMenuOptions().isEmpty());
    }

    @Test
    @Ignore
    public void shouldVerifyIfFunctionToShowMenuOptionsWasCalled() {

        Biblioteca biblioteca = mock(Biblioteca.class);

        biblioteca.start();

        verify(biblioteca).getMenuOptions();

    }
}

package com.thoughtworks.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {
    @Test
    public void shouldPrintAWelcomeMessage() {
        String welcomeMessageExpected = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        BibliotecaPrinter printer = mock(BibliotecaPrinter.class);
        Biblioteca biblioteca = new Biblioteca(printer);

        biblioteca.start();

        verify(printer).print(welcomeMessageExpected);
    }

}

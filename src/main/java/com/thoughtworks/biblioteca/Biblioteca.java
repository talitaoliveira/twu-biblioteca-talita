package com.thoughtworks.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    BibliotecaPrinter printer;

    List<String> booksOnLibrary = new ArrayList<String>();


    public Biblioteca(BibliotecaPrinter printer) {
        this.printer = printer;
        populateLibrary();

    }

    String welcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public void start() {
        printer.print(welcomeMessage());
        printer.printAllBooks(booksOnLibrary);

    }

    public void populateLibrary(){
        booksOnLibrary.add("Java");
        booksOnLibrary.add("PHP");
        booksOnLibrary.add("JS");
        booksOnLibrary.add("Python");
    }
}

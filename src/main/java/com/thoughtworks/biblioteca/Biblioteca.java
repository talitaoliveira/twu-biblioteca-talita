package com.thoughtworks.biblioteca;

import com.thoughtworks.biblioteca.Models.Book;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    BibliotecaPrinter printer;

    List<Book> booksOnLibrary = new ArrayList<Book>();


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

        Book book1 = new Book("Livro de Java", "Autor do Livro de Java", 1991);
        Book book2 = new Book("Livro de PHP", "Autor do Livro de PHP", 1993);
        Book book3 = new Book("Livro de JS", "Autor do Livro de JS", 1995);
        Book book4 = new Book("Livro de Python", "Autor do Livro de Python", 1992);


        booksOnLibrary.add(book1);
        booksOnLibrary.add(book2);
        booksOnLibrary.add(book3);
        booksOnLibrary.add(book4);
    }
}

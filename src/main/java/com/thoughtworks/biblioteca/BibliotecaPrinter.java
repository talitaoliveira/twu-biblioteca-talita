package com.thoughtworks.biblioteca;

import com.thoughtworks.biblioteca.Models.Book;

import java.util.List;

public class BibliotecaPrinter {

    public void print(String message) {
        System.out.println(message);
    }

    public void printAllBooks(List<Book> listOfBooks) {

        String books = "";


        for (int i = 0; i < listOfBooks.size(); i++) {
            books += listOfBooks.get(i).getAllInformation() + "\n";
        }

        System.out.println(books);

    }
}

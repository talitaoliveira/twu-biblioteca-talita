package com.thoughtworks.biblioteca;

import java.util.List;

public class BibliotecaPrinter {

    public void print(String message) {
        System.out.println(message);
    }

    public void printAllBooks(List<String> listOfBooks) {

        String books = "";


        for (int i = 0; i < listOfBooks.size(); i++) {
            books += listOfBooks.get(i) + "\n";
        }

        System.out.println(books);

    }
}

package com.thoughtworks.biblioteca;

public class Biblioteca {

    BibliotecaPrinter printer;

    public Biblioteca(BibliotecaPrinter printer) {
        this.printer = printer;
    }

    String welcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public void start() {
        printer.print(welcomeMessage());
    }
}

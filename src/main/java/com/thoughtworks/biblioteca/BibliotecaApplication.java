package com.thoughtworks.biblioteca;

public class BibliotecaApplication {
    public static void main(String[] args) {
        BibliotecaPrinter printer = new BibliotecaPrinter();
        Biblioteca library = new Biblioteca(printer);
        library.start();
    }
}

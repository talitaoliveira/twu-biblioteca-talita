package com.thoughtworks.biblioteca;

public class BibliotecaApplication {
    public static void main(String[] args) {
        BibliotecaPrinter printer = new BibliotecaPrinter();
        Menu menu = new Menu(printer);
        menu.addOption(new MenuOption("list", ()-> System.out.println("Lista livros")));
        menu.addOption(new MenuOption("search", ()-> System.out.println("Busca livros")));
        Biblioteca library = new Biblioteca(printer, menu);
        library.start();
    }
}

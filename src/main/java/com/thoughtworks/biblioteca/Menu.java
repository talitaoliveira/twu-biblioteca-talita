package com.thoughtworks.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private BibliotecaPrinter printer;
    private List<MenuOption> options;

    public Menu(BibliotecaPrinter printer){
        this.printer = printer;
        this.options = new ArrayList<>();
    }

    public void addOption(MenuOption option) {
        options.add(option);
    }

    public void listOptions() {

        for (MenuOption option: options) {
            printer.print(option.getTitle());
        }

    }

    public void processUserInput(int optionNumber) {

        options.get(optionNumber).action();

    }
}

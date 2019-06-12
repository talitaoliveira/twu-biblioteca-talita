package com.thoughtworks.biblioteca;

public class MenuOption {

    private String title;
    private Runnable action;


    public MenuOption(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

    public String getTitle(){
        return title;
    }

    public void action(){
        action.run();
    }
}

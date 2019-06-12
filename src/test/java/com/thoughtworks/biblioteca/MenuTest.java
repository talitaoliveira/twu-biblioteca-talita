package com.thoughtworks.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuTest {

    // Exibir lista de opcoes
    @Test
    public void shouldDisplayOptions() {

        // given
        Runnable listMenuAction = ()-> System.out.println("Lista de livros");
        Runnable searchMenuAction = ()-> System.out.println("Busca de livros");

        MenuOption listMenuOption = new MenuOption("list", listMenuAction);
        MenuOption searchMenuOption = new MenuOption("search", searchMenuAction);

        BibliotecaPrinter printer = mock(BibliotecaPrinter.class);
        Menu menu = new Menu(printer);
        menu.addOption(listMenuOption);
        menu.addOption(searchMenuOption);

        // when
        menu.listOptions();

        //then
        verify(printer).print(listMenuOption.getTitle());
        verify(printer).print(searchMenuOption.getTitle());

    }

    // Processar entrada
    @Test
    public void shouldProcessUserInput() {
        //given
        BibliotecaPrinter printer = mock(BibliotecaPrinter.class);
        MenuOption listMenuOption =  mock(MenuOption.class);
        MenuOption searchMenuOption = mock(MenuOption.class);
        Menu menu = new Menu(printer);
        menu.addOption(listMenuOption);
        menu.addOption(searchMenuOption);

        //when
        menu.processUserInput(0);

        //then
        verify(listMenuOption).action();
    }

    //verificar se o usario escolheu opcao errada, e retornar erro
}

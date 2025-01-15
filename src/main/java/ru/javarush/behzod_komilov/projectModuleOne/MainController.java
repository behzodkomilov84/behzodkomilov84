package ru.javarush.behzod_komilov.projectModuleOne;

import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

public class MainController {

    MenuHandler menuHandler = new MenuHandler();

    public void run(){
        MenuHandler.showMenuSelection();
        menuHandler.selectMenuOption();
        System.out.println(Constants.DIVIDING_LINE);
    }


}

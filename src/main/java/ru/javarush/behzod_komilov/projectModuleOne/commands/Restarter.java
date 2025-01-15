package ru.javarush.behzod_komilov.projectModuleOne.commands;

import ru.javarush.behzod_komilov.projectModuleOne.MainController;
import ru.javarush.behzod_komilov.projectModuleOne.MenuHandler;
import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToDoSomething;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.Restartable;

public class Restarter extends Restartable implements AbleToDoSomething {

    private MenuHandler menuHandler = new MenuHandler();

    @Override
    public  void restartSelection() {

        System.out.println(Constants.ERROR_SELECTION_TEXT);
        MenuHandler.showMenuSelection();
        menuHandler.selectMenuOption();
    }


}

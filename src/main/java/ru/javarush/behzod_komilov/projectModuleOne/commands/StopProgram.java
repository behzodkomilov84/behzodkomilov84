package ru.javarush.behzod_komilov.projectModuleOne.commands;

import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToDoSomething;

public class StopProgram implements AbleToDoSomething {

    public void stopThisProgram() {


        System.out.print("Закрываем");

        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(700);
                System.out.print(".");
            }
            System.out.println();
            System.out.println(Constants.DIVIDING_LINE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.exit(0);
    }

}

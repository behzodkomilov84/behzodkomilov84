package ru.javarush.behzod_komilov.projectModuleOne.commands;

import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToDoSomething;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToUseForce;

public class BruteForce extends AbleToUseForce implements AbleToDoSomething {

    @Override
    public void bruteForceFile() {
        System.out.println("File brute force successfully");
    }


}

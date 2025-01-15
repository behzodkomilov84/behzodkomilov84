package ru.javarush.behzod_komilov.projectModuleOne;

import ru.javarush.behzod_komilov.projectModuleOne.commands.*;
import ru.javarush.behzod_komilov.projectModuleOne.exceptions.ActionNotFoundInMenuOptionException;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToDoSomething;

public enum ActionsName {
    ENCRYPT(new Encoder()),
    DECRYPT(new Decoder()),
    BRUTEFORCE(new BruteForce()),
    EXIT(new StopProgram()),
    OTHER(new Restarter());


    private final AbleToDoSomething ableToDoSomething;

    ActionsName(AbleToDoSomething toDoSomething) {
        this.ableToDoSomething = toDoSomething;
    }

    public static AbleToDoSomething findActionsName(String actionName) {
        try {
            ActionsName value = ActionsName.valueOf(actionName.toUpperCase());
            return value.ableToDoSomething;
        } catch (IllegalArgumentException e) {
            throw new ActionNotFoundInMenuOptionException("not found " + actionName, e);
        }

    }

    public static AbleToDoSomething findActionsName(ActionsName actionName) {

        return actionName.ableToDoSomething;

    }

}

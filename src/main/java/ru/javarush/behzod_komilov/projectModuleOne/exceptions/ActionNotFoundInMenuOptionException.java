package ru.javarush.behzod_komilov.projectModuleOne.exceptions;

public class ActionNotFoundInMenuOptionException extends RuntimeException{
    public ActionNotFoundInMenuOptionException(String message) {
        super(message);
    }

    public ActionNotFoundInMenuOptionException(String message, IllegalArgumentException e) {

    }
}

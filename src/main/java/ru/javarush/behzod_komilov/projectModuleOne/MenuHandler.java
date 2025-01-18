package ru.javarush.behzod_komilov.projectModuleOne;

import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToDoSomething;
import ru.javarush.behzod_komilov.projectModuleOne.commands.*;
import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

import java.util.Scanner;

public class MenuHandler {

    private static int key;
    private static ActionsName selectedAction = ActionsName.OTHER;
    private static String selectedMenuNumber;
    private static Scanner scanner = new Scanner(System.in);

    public static int getKey() {
        return key;
    }

    public static void setKey(int key) {
        MenuHandler.key = key;
    }

    public static void showMenuSelection() {

        System.out.println(Constants.DIVIDING_LINE);
        System.out.println("Выберите опцию набрав цифру перед ним:");
        System.out.println();
        System.out.println("1) " + Constants.ENCRYPT_TEXT);
        System.out.println("2) " + Constants.DECRYPT_TEXT);
        System.out.println("3) " + Constants.BRUTE_FORCE_TEXT);
        System.out.println("4) " + Constants.EXIT_TEXT);
        System.out.println(Constants.DIVIDING_LINE);
    }


    public static ActionsName findActionsName() {

        selectedMenuNumber = scanner.nextLine();

        if (selectedMenuNumber.equals("1")) {

            System.out.println("Вы выбрали: " + Constants.ENCRYPT_TEXT);
            System.out.println(Constants.DIVIDING_LINE);

            inputKey();

            selectedAction = ActionsName.ENCRYPT;

            return ActionsName.ENCRYPT;

        } else if (selectedMenuNumber.equals("2")) {

            System.out.println("Вы выбрали: " + Constants.DECRYPT_TEXT);
            System.out.println(Constants.DIVIDING_LINE);

            inputKey();

            selectedAction = ActionsName.DECRYPT;

            return ActionsName.DECRYPT;

        } else if (selectedMenuNumber.equals("3")) {

            System.out.println("Вы выбрали: " + Constants.BRUTE_FORCE_TEXT);
            System.out.println(Constants.DIVIDING_LINE);

            selectedAction = ActionsName.BRUTEFORCE;

            return ActionsName.BRUTEFORCE;

        } else if (selectedMenuNumber.equals("4")) {

            System.out.println("Вы выбрали: " + Constants.EXIT_TEXT);
            System.out.println(Constants.DIVIDING_LINE);

            selectedAction = ActionsName.EXIT;

            return ActionsName.EXIT;

        } else {

            selectedAction = ActionsName.OTHER;
            return ActionsName.OTHER;

        }


    }

    private static void inputKey() {

        System.out.print("Введите ключ шифра: ");

        boolean isTrueFormat = true;

        while (isTrueFormat) {
            try {
                setKey(Integer.parseInt(scanner.nextLine()));
                isTrueFormat = false;
            } catch (NumberFormatException e) {
                System.out.println("Вы не ввели число, введите ключ шифра заново: ");
            }
        }
    }

    public void executeAction(ActionsName action) {
        switch (action) {
            case ENCRYPT:
                AbleToDoSomething encoder = ActionsName.findActionsName(ActionsName.ENCRYPT);
                Encoder encoderObject = (Encoder) encoder;
                encoderObject.encryptFile(key);
                break;
            case DECRYPT:
                AbleToDoSomething decoder = ActionsName.findActionsName(ActionsName.DECRYPT);
                Decoder decoderObject = (Decoder) decoder;
                decoderObject.decryptFile(key);
                break;
            case BRUTEFORCE:
                AbleToDoSomething brute = ActionsName.findActionsName(ActionsName.BRUTEFORCE);
                BruteForce bruteForce = (BruteForce) brute;
                bruteForce.bruteForceFile();
                break;
            case EXIT:
                AbleToDoSomething exitThisProgram = ActionsName.findActionsName(ActionsName.EXIT);
                StopProgram stopThisProgram = (StopProgram) exitThisProgram;
                stopThisProgram.stopThisProgram();
                break;
            case OTHER:
                AbleToDoSomething restartProgram = ActionsName.findActionsName(ActionsName.OTHER);
                Restarter restarter = (Restarter) restartProgram;
                restarter.restartSelection();
                break;

        }
    }


    public void selectMenuOption() {
        executeAction(findActionsName());
    }

}

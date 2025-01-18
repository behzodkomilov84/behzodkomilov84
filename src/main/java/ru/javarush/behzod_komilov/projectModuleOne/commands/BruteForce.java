package ru.javarush.behzod_komilov.projectModuleOne.commands;

import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToDoSomething;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToUseForce;
import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class BruteForce extends AbleToUseForce implements AbleToDoSomething {

    @Override
    public void bruteForceFile() {

//        try {
//            List<String> stringListOfReferenceWords = Files.readAllLines(Path.of(Constants.PATH_OF_REFERENCE_WORDS_FILE));
//            System.out.println(stringListOfReferenceWords);
//        } catch (IOException e) {
//            System.out.println("Error reading reference words file");
//        }


        System.out.println("File brute force successfully");
    }


}

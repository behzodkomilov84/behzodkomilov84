package ru.javarush.behzod_komilov.projectModuleOne.commands;

import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToDoSomething;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToUseForce;
import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BruteForce extends AbleToUseForce implements AbleToDoSomething {

    private Set<String> listOfReferenceWords = GeneralFunctions.createUnicalWordListOfFile(Constants.STRING_OF_PATH_OF_REFERENCE_WORDS_FILE);
    private Path pathOfSourceFile = Path.of(Constants.STRING_OF_PATH_OF_SOURCE_FILE);
    private Path pathOfBruteForceFile = Path.of(Constants.STRING_OF_PATH_OF_BRUTE_FORCE_FILE);
    private Encoder encoder = new Encoder();

    private List<String> linesOfSourceFile = new ArrayList<>();

    @Override
    public void bruteForceFile() {

        Set<String> wordsListExtractedFromFile = GeneralFunctions.CreateUnicalWordsListExtractingWordsFromFile(Constants.STRING_OF_PATH_OF_SOURCE_FILE);

        wordsListExtractedFromFile.forEach(System.out::println);

        System.out.println("File brute force successfully");
    }


}

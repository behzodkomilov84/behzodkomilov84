package ru.javarush.behzod_komilov.projectModuleOne.commands;

import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToDoSomething;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToUseForce;
import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BruteForce extends AbleToUseForce implements AbleToDoSomething {

    private Path pathOfSourceFile = Path.of(Constants.STRING_OF_PATH_OF_SOURCE_FILE);
    private Path pathOfBruteForceFile = Path.of(Constants.STRING_OF_PATH_OF_BRUTE_FORCE_FILE);
    private int probableAmountOfCypherCodes;
    private int probableKey;
    private Encoder encoder = new Encoder();

    @Override
    public void bruteForceFile() {

        int key = bruteForce();

        encoder.setPathOfSourceFile(pathOfSourceFile);
        encoder.setPathOfEncryptedFile(pathOfBruteForceFile);

        encoder.encryptFile(key);
    }

    private int bruteForce() {

        Set<String> wordsListExtractedFromFile = Calculate.CreateUnicalWordsListByExtractingWordsFromFile(Constants.STRING_OF_PATH_OF_SOURCE_FILE);

        int key = 1;
        int containsCountValue; // для рас считывание присутствия

        HashMap<Integer, Integer> numbersOfAttempts = new HashMap<>();

        boolean bruteForceIsStopped = false;

        while (!bruteForceIsStopped) {
            containsCountValue = 0;
            for (String word : wordsListExtractedFromFile) {

                String crackedWord = Calculate.encryptWord(word, key);

                if (word.equals(crackedWord)) {
                    probableAmountOfCypherCodes = key;
                    bruteForceIsStopped = true;
                    break;
                }

                if (Calculate.containsInReferenceWords(crackedWord)) {
                    containsCountValue++;
                }
            }

            numbersOfAttempts.put(key, containsCountValue);

            key++;
        }

        Set<Integer> keySet = numbersOfAttempts.keySet();
        Collection<Integer> values = numbersOfAttempts.values();

        int maxValue = 0;

        for (Integer value : values) {
            maxValue = Math.max(maxValue, value);
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : numbersOfAttempts.entrySet()) {
            if (integerIntegerEntry.getValue() == maxValue) {
                probableKey = integerIntegerEntry.getKey();
            }
        }


        System.out.println("probableAmountOfCypherCodes: " + probableAmountOfCypherCodes);
        System.out.println("numbersOfAttempts: " + numbersOfAttempts.size());
        System.out.println("Ключ может быть: " + probableKey);
        System.out.println(Constants.DIVIDING_LINE);
        System.out.println("Ключ может быть для зашифровка (encrypt): " + probableKey);
        System.out.println("Ключ может быть для расшифровка (decrypt): " + (numbersOfAttempts.size() - probableKey));

        System.out.println(Constants.DIVIDING_LINE);

        System.out.println("File brute force successfully");
        System.out.println(Constants.DIVIDING_LINE);

        return probableKey;
    }


}

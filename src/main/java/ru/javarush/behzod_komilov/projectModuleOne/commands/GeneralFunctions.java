package ru.javarush.behzod_komilov.projectModuleOne.commands;

import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GeneralFunctions {

    private static int indexOfCharacterInAlphabetsAndSymbols;
    private static int newIndexOfCharacterInAlphabetsAndSymbols;

    public static byte encryptByte(byte oneByteOfSourceFile, int key) {

        byte encryptedByte;
        int realCypherKey = convertCypherKeyIntoRealCypherKey(key);

        int indexOfCharacterInAlphabetsAndSymbols;
        int newIndexOfCharacterInAlphabetsAndSymbols;

        indexOfCharacterInAlphabetsAndSymbols = findIndexOfCharacterInAlphabetsAndSymbols(oneByteOfSourceFile);

        newIndexOfCharacterInAlphabetsAndSymbols = findNewIndex(indexOfCharacterInAlphabetsAndSymbols, realCypherKey);

        encryptedByte = Constants.ALPHABETS_AND_SYMBOLS.getBytes()[newIndexOfCharacterInAlphabetsAndSymbols];

        return encryptedByte;
    }

    public static char encryptChar(char oneByteOfSourceFile, int key) {

        char encryptedChar;
        int realCypherKey = convertCypherKeyIntoRealCypherKey(key);

        boolean existsCharacterInAlphabetsAndSymbols = existInAlphabetsAndSymbols(oneByteOfSourceFile);
        if (existsCharacterInAlphabetsAndSymbols) {
            indexOfCharacterInAlphabetsAndSymbols = findIndexOfCharacterInAlphabetsAndSymbols(oneByteOfSourceFile);

            newIndexOfCharacterInAlphabetsAndSymbols = findNewIndex(indexOfCharacterInAlphabetsAndSymbols, realCypherKey);

            encryptedChar = Constants.ALPHABETS_AND_SYMBOLS.toCharArray()[newIndexOfCharacterInAlphabetsAndSymbols];
        } else {
            encryptedChar = oneByteOfSourceFile;
        }
            return encryptedChar;
    }

    private static int findNewIndex(int indexOfCharacterInAlphabetsAndSymbols, int realCypherKey) {

        int newIndexOfCharacterInAlphabetsAndSymbols = indexOfCharacterInAlphabetsAndSymbols + realCypherKey;

        if (newIndexOfCharacterInAlphabetsAndSymbols > 0) {

            if (newIndexOfCharacterInAlphabetsAndSymbols < indexOfCharacterInAlphabetsAndSymbols) {
                return newIndexOfCharacterInAlphabetsAndSymbols;
            } else if (newIndexOfCharacterInAlphabetsAndSymbols >= Constants.ALPHABETS_AND_SYMBOLS.length()) {
                newIndexOfCharacterInAlphabetsAndSymbols = convertCypherKeyIntoRealCypherKey(newIndexOfCharacterInAlphabetsAndSymbols);
            }

        } else if (newIndexOfCharacterInAlphabetsAndSymbols < 0) {
            newIndexOfCharacterInAlphabetsAndSymbols = Constants.ALPHABETS_AND_SYMBOLS.length() + newIndexOfCharacterInAlphabetsAndSymbols;
        } else {
            newIndexOfCharacterInAlphabetsAndSymbols = 0;
        }

        return newIndexOfCharacterInAlphabetsAndSymbols;
    }

    public static boolean existInAlphabetsAndSymbols(char oneCharOfSourceFile) {

        boolean isExist = Constants.ALPHABETS_AND_SYMBOLS.contains(String.valueOf(oneCharOfSourceFile));

        return isExist;
    }

    private static int findIndexOfCharacterInAlphabetsAndSymbols(char oneCharOfSourceFile) {

        String oneStringOfSourceFile = String.valueOf(oneCharOfSourceFile);

        int indexOfCharacterInAlphabetsAndSymbols = Constants.ALPHABETS_AND_SYMBOLS.indexOf(oneStringOfSourceFile);

        return indexOfCharacterInAlphabetsAndSymbols;
    }

    private static int findIndexOfCharacterInAlphabetsAndSymbols(byte oneByteOfSourceFile) {

        String oneStringOfSourceFile = String.valueOf((char) oneByteOfSourceFile);

        int indexOfCharacterInAlphabetsAndSymbols = Constants.ALPHABETS_AND_SYMBOLS.indexOf(oneStringOfSourceFile);

        return indexOfCharacterInAlphabetsAndSymbols;
    }


    private static int convertCypherKeyIntoRealCypherKey(int cypherKey) {
        int realCypherKey = (cypherKey % Constants.ALPHABETS_AND_SYMBOLS.length());
        return realCypherKey;
    }

    public static List<Character> convertStringToCharList(String stringToConvertTo) {
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < stringToConvertTo.length(); i++) {
            charList.add(stringToConvertTo.charAt(i));
        }
        return charList;
    }

    public static List<Character> convertFileToCharList(Path sourceFile) {

        List<Character> charList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile.toFile()))) {

            int ch;
            while ((ch = bufferedReader.read()) != -1) {
                charList.add((char) ch);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return charList;
    }

}

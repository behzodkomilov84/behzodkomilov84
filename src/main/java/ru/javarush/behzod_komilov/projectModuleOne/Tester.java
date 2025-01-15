package ru.javarush.behzod_komilov.projectModuleOne;

import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Tester {


    public static void main(String[] args) {

//        System.out.println("RUSSIAN_LETTERS -> " + Constants.RUSSIAN_LETTERS);
//        System.out.println("RUSSIAN_LETTERS.length() -> " + Constants.RUSSIAN_LETTERS.length());
//
//        System.out.println("ALPHABETS_AND_SYMBOLS -> " + Constants.ALPHABETS_AND_SYMBOLS);
//        System.out.println("ALPHABETS_AND_SYMBOLS.length() -> " + Constants.ALPHABETS_AND_SYMBOLS.length());
//        System.out.println("Key: " + MenuHandler.key);
//        System.out.println();

        List<Character> characters = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(Constants.PATH_OF_SOURCE_FILE))) {
            int character;
            while ((character = br.read()) != -1) {
                char characterChar = (char) character;
                characters.add(characterChar);
            }

            characters.forEach(System.out::print);
            System.out.println();
            System.out.println(characters.get(0));
            System.out.println();
            System.out.println(Constants.RUSSIAN_LETTERS.charAt(1));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/*
public class CharacterCheck {
    public static void main(String[] args) {
        char c = 'а'; // Замените на нужный символ

        if (Character.UnicodeScript.of(c) == Character.UnicodeScript.CYRILLIC) {
            System.out.println("Символ '" + c + "' является кириллическим.");
        } else if (Character.UnicodeScript.of(c) == Character.UnicodeScript.LATIN) {
            System.out.println("Символ '" + c + "' является латинским.");
        } else {
            System.out.println("Символ '" + c + "' является другим.");
        }
    }
}  */


//Character.highSurrogate()
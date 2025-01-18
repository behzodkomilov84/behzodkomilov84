package ru.javarush.behzod_komilov.projectModuleOne;

import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Tester {


    public static void main(String[] args) {

        try {
            List<String> tmpStringLinesOfReferenceWords = Files.readAllLines(Path.of(Constants.STRING_OF_PATH_OF_REFERENCE_WORDS_FILE), Charset.defaultCharset());
            List<String> stringListOfReferenceWords = new ArrayList<>();

            for (String line : tmpStringLinesOfReferenceWords) {
            }

            System.out.println(stringListOfReferenceWords);
        } catch (IOException e) {
            System.out.println("Error reading reference words file");
        }
    }
}




/* public class CharacterCheck{
    public static void main(String[] args) {
        char c = 'а'; // Замените на нужный символ

        if(Character.UnicodeScript.of(c) == Character.UnicodeScript.CYRILLIC){
            System.out.println("Символ '" + c + "' является кириллическим.");
        }else if (Character.UnicodeScript.of(c) == Character.UnicodeScript.LATIN){
            System.out.println("Символ '" + c + "' является латинским.");
        } else {
            System.out.println("Символ '" + c + "' является другим.");
        }
    }
}  */


//Character.highSurrogate()
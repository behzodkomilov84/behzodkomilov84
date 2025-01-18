package ru.javarush.behzod_komilov.projectModuleOne;

import ru.javarush.behzod_komilov.projectModuleOne.commands.Calculate;
import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

import java.util.Set;

public class Tester {


    public static void main(String[] args) {

        Set<String> wordsListExtractedFromFile = Calculate.CreateUnicalWordsListByExtractingWordsFromFile(Constants.STRING_OF_PATH_OF_SOURCE_FILE);

        int i = 0;
        for (String string : wordsListExtractedFromFile) {
            System.out.println(i + ": " + string);
            i++;
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
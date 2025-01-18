package ru.javarush.behzod_komilov.projectModuleOne.constants;

public class Constants {

    public static final String ENCRYPT_TEXT = "Зашифровать текст (encrypt)";
    public static final String DECRYPT_TEXT = "Расшифровать текст (decrypt)";
    public static final String BRUTE_FORCE_TEXT = "Попробовать взломать текст (brute force)";
    public static final String EXIT_TEXT = "Выход";
    public static final String ERROR_SELECTION_TEXT = "Вы не выбрали ни одной команды в меню. Выберите заново.";
    public static final String DIVIDING_LINE = "----------------------------------------------------";

    public static final String RUSSIAN_LETTERS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static final String ENGLISH_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String SYMBOLS = ".,-:;!";
    public static final String ALPHABETS_AND_SYMBOLS = RUSSIAN_LETTERS + ENGLISH_LETTERS + RUSSIAN_LETTERS.toUpperCase()
            + ENGLISH_LETTERS.toUpperCase() + SYMBOLS;
    public static final String STRING_OF_PATH_OF_SOURCE_FILE = "src/TextFiles/SourceFile.txt";
    public static final String STRING_OF_PATH_OF_ENCRYPTED_FILE = "src/TextFiles/EncryptedFile.txt";
    public static final String STRING_OF_PATH_OF_DECRYPTED_FILE = "src/TextFiles/DecryptedFile.txt";
    public static final String STRING_OF_PATH_OF_REFERENCE_WORDS_FILE = "src/TextFiles/ReferenceWords.txt";
    public static final String STRING_OF_PATH_OF_BRUTE_FORCE_FILE = "src/TextFiles/BruteForce.txt";



}

package ru.javarush.behzod_komilov.projectModuleOne.commands;

import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToDoSomething;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.Encryptable;
import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Encoder extends Encryptable implements AbleToDoSomething {

    private static Path pathOfSourceFile = Paths.get(Constants.PATH_OF_SOURCE_FILE);
    private static Path pathOfEncryptedFile = Paths.get(Constants.PATH_OF_ENCRYPTED_FILE);

    public void setPathOfEncryptedFile(Path pathOfEncryptedFile) {
        this.pathOfEncryptedFile = pathOfEncryptedFile;
    }

    public void setPathOfSourceFile(Path pathOfSourceFile) {
        this.pathOfSourceFile = pathOfSourceFile;
    }

    @Override
    public void encryptFile(int key) {

        List<Character> charListOfSourceFile = GeneralFunctions.convertFileToCharList(pathOfSourceFile);
        List<Character> charListOfEncryptedFile = new ArrayList<>();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOfEncryptedFile.toFile()))) {

            for (int i = 0; i < charListOfSourceFile.size(); i++) {

                charListOfEncryptedFile.add(GeneralFunctions.encryptChar(charListOfSourceFile.get(i), key)); // shu yerda encrypt bo'ladi
                bufferedWriter.write(charListOfEncryptedFile.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Encrypted file: " + pathOfEncryptedFile);
    }
}


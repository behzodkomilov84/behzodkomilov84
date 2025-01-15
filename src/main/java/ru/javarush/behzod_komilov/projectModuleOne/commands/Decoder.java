package ru.javarush.behzod_komilov.projectModuleOne.commands;

import ru.javarush.behzod_komilov.projectModuleOne.MenuHandler;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToDoSomething;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.Decryptable;
import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Decoder extends Decryptable implements AbleToDoSomething {

    private static int key = MenuHandler.getKey();
    private Path pathOfDecryptedFile = Paths.get(Constants.PATH_OF_DECRYPTED_FILE);
    private Path pathOfEncryptedFile = Paths.get(Constants.PATH_OF_ENCRYPTED_FILE);

    @Override
    public void decryptFile() { //TODO boshqattan qilinadi

        try {
            Files.write(pathOfDecryptedFile, Encoder.allBytesOfSourceFileForDecryption);
        } catch (IOException e) {
            System.out.println("Error decrypting file");
        }

        System.out.println("Key: " + key);

        System.out.println("Decrypted file" + pathOfDecryptedFile);
    }

}

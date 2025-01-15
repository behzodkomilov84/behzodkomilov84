package ru.javarush.behzod_komilov.projectModuleOne.commands;

import ru.javarush.behzod_komilov.projectModuleOne.abstractions.AbleToDoSomething;
import ru.javarush.behzod_komilov.projectModuleOne.abstractions.Decryptable;
import ru.javarush.behzod_komilov.projectModuleOne.constants.Constants;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Decoder extends Decryptable implements AbleToDoSomething {

    private Path pathOfDecryptedFile = Paths.get(Constants.PATH_OF_DECRYPTED_FILE);
    private Path pathOfEncryptedFile = Paths.get(Constants.PATH_OF_ENCRYPTED_FILE);
    private Encoder encoder = new Encoder();

    @Override
    public void decryptFile(int key) {

        encoder.setPathOfSourceFile(pathOfEncryptedFile);
        encoder.setPathOfEncryptedFile(pathOfDecryptedFile);

        encoder.encryptFile(-key);

        System.out.println("Decrypted file" + pathOfDecryptedFile);
    }

}

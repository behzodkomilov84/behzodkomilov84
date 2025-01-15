package ru.javarush.behzod_komilov.projectModuleOne.abstractions;

public abstract class Encryptable implements AbleToDoSomething {
    public abstract void encryptFile(int key);

    @Override
    public void decryptFile() {
    }

    @Override
    public void bruteForceFile() {
    }

    @Override
    public void restartSelection() {
    }

    @Override
    public void stopThisProgram() {
    }

}

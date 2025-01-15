package ru.javarush.behzod_komilov.projectModuleOne.abstractions;

public abstract class Decryptable implements AbleToDoSomething {
    public abstract void decryptFile();

    @Override
    public void encryptFile(int key) {
    }

    @Override
    public void bruteForceFile() {
    }

    @Override
    public void restartSelection(){}

    @Override
    public void stopThisProgram(){}

}

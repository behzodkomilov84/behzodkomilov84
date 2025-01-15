package ru.javarush.behzod_komilov.projectModuleOne.abstractions;

public abstract class AbleToUseForce implements AbleToDoSomething {

    public abstract void bruteForceFile();

    @Override
    public void decryptFile(int key) {}

    @Override
    public void encryptFile(int key) {}


    @Override
    public void restartSelection(){}

    @Override
    public void stopThisProgram(){}


}

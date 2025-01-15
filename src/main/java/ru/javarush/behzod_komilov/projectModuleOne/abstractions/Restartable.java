package ru.javarush.behzod_komilov.projectModuleOne.abstractions;

public  abstract class Restartable implements AbleToDoSomething{

    @Override
    public abstract void restartSelection();

    @Override
    public void encryptFile(int key){}

    @Override
    public void decryptFile(int key){}

    @Override
    public void bruteForceFile(){}

    @Override
    public void stopThisProgram(){}



}
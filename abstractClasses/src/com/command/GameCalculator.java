package com.command;

public abstract class GameCalculator//abstract sınıflar asla new yapilamaz
{
    public abstract void calculate(); //abstract yaparsan kesinlikle override etmen gerek

        public final void gameOver(){ //override yapılamaz.
        System.out.println("Oyun bitti.");
    }
}


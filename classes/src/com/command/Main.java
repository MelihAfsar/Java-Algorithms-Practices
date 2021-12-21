package com.command;

public class Main {

    public static void main(String[] args) {
        //reference type, stack ve heap te olusur. Diziler
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value type yalnızca stack te olusur
    }
}




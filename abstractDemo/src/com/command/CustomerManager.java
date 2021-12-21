package com.command;

public class CustomerManager {

    BaseDatabaseManager baseDatabaseManager;

    public void getCustomers(){
        baseDatabaseManager.getData();
    }
}

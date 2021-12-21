package com.command;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();

        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.baseDatabaseManager = new SqlServerDatabaseManager();
        customerManager1.getCustomers();

        CustomerManager customerManager2 = new CustomerManager();
        customerManager2.baseDatabaseManager = new MySqlDatabaseManger();
        customerManager2.getCustomers();
    }
}

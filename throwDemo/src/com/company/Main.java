package com.company;

public class Main {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println(manager.getBalance());

        manager.deposit(50.0);
        System.out.println(manager.getBalance());

        try {
            manager.withdraw(115.0);
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(manager.getBalance());
    }
}

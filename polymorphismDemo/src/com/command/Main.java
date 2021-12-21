package com.command;

public class Main {
    //Plymorphism | çok biçimlilik
    public static void main(String[] args) {

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()};

        for (BaseLogger logger : loggers) {
            logger.log("Log Başarılı");
        }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}

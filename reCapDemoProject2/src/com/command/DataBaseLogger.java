package com.command;

public class DataBaseLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Database to logger : " + message);
    }
}

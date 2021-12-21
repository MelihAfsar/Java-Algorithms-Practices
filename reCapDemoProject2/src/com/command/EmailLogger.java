package com.command;

public class EmailLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Email to logger : " + message);
    }
}

package com.command;

public class MySqlCustomerDal implements ICustomerDal, IRepository{ //Bir clas birden fazla interface implement edebilir.

    @Override
    public void Add() {
        System.out.println("MySql eklendi.");
    }

    @Override
    public void Update(){
        System.out.println("MySql Guncellendi.");
    }
}

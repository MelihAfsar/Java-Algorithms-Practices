package com.command;

public interface ICustomerDal { //referans tutma görevi //new yapilamaz
     default void Add() {

    }
}

//Bir clas birden fazla interface implement edebilir.
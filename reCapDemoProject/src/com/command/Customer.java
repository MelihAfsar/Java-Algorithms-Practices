package com.command;

public class Customer {

    public Customer(int id, String name, String surname, String eMail, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
        this.age = age;
    }

    private int id;
    private String name;
    private String surname;
    private String eMail;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

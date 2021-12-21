package com.command;

public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String colour) { //Constructor
        System.out.println("Yapici blok calisti.");
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockAmount = stockAmount;
        this.description = description;
        this.colour = colour;
    }

    /*
    public Product() { //Constructor block

    }*/

    //Attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String code;
    private String colour; //private olarak tanımlanırsa sadece bu blokta tanımlı kalır.

    //getter
    public String getColour() { //private olan degisken okunabilir hale getirildi
        return colour;
    }

    //setter
    public void setColour(String colour) { //private olan degisken degerinin icerigine atama yapilabilir.
        //this.colour = colour; //this kullanımı bu class içerisindeki degişkeni belirtir.
        this.colour = colour;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getCode() {
        return this.name.substring(0, 1) + id;
    }
/*//Kod sonradan degistirilebilir olmasin.
    public void setCode(String code) {
        this.code = code;
    }*/
}

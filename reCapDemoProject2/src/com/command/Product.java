package com.command;

public class Product {

    public Product(int id,String name,String description,String colour,double price,int stockAmount, double score) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.colour = colour;
        this.price = price;
        this.stockAmount = stockAmount;
        this.score = score;
    }

    private int id;
    private String name;
    private String description;
    private String colour;
    private double price;
    private int stockAmount;
    private double score;

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

package com.command;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop ","Asus ",5000,3,"Blue");
        /* Ustteki yazim ile ayni
        product.setName("Laptop");
        product.setId(1);
        product.setPrice(5000);
        product.setDescription("Asus Laptop");
        product.setStockAmount(3);
        product.setColour("Blue");
        */

        System.out.println(product.getName());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        product.setName("LG");

        System.out.println(product.getColour());
        System.out.println(product.getCode());
        System.out.println(product.getName());
    }
}

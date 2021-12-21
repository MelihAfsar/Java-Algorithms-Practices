package com.command;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.id = 1;
        product.name = "Karnabahar";
        product.price = 10;

        ProductManager manager = new ProductManager();
        manager.add(product);

        DatabaseHelper.Crud.Delete();////Bu yapı çok sağlıklı değil
    }
}
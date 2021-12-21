package com.command;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "TV", "Samsung", 5000.5, 100);
        Product product2 = new Product(2, "Smart Phone", "LG", 4500, 150);

        Customer customer1 = new Customer(101, "Melih", "Afsar", "mlh@gmail.com", 20);
        Customer customer2 = new Customer(102, "Ahmet", "Al", "ahm@hotmail.com", 21);

        ProductManager productManager = new ProductManager();
        CustomerManager customerManager = new CustomerManager();

        productManager.Update(product1, 4560);
        System.out.println(product1.getDescription() + product1.getName() + " urunun guncellenmis fiyati: " + product1.getPrice());

        productManager.NameUpdate(product2, "Camera");

        product1.setName("Smart Tv");
        System.out.println(product1.getName());


    }
}

package com.command;

public class Main {

    public static void main(String[] args) {
        BaseLogger[] logger = new BaseLogger[]{new EmailLogger(), new DataBaseLogger()};
        ProductManager productManager1 = new ProductManager(new DataBaseLogger());
        ProductManager productManager2 = new ProductManager(new EmailLogger());


        Product[] products = new Product[3];
        products[0] = new Product(100, "GM20", "Smart Phone", "Mystic Green", 1800, 5000, 8.5);
        products[1] = new Product(200, "GM20", "Smart Phone", "Mystic Blue", 1755, 5000, 8.4);
        products[2] = new Product(300, "J7 Duo", "Samsung Smart Phone", "Black", 1400, 101, 5.2);

        Customer[] customer = new Customer[3];

        customer[0].setId(1);
        customer[0].setName("Semih");
        customer[0].setSurname("Afsar");
        customer[0].setAge(8);
        customer[0].setPhoneNumber("05307777777");
        customer[0].setAddress("Nilufer/Bursa");
        customer[0].setAccountBalance(1500.5);



        Employee[] employee = new Employee[3];



        productManager1.PriceUpdate(products[1], 1790);
        productManager2.StockAmountUpdate(products[2], 5);
        //System.out.println(products[2].getStockAmount());


    }
}



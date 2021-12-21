package com.command;

public class ProductManager {
    public void add(Product product){


        if(ProductValidator.isValid(product)){
        System.out.println("Eklendi.");
        }else{System.out.println("Urun bilgileri gecersiz. Eklenemedi.");}



        ProductValidator productValidator = new ProductValidator();
        productValidator.birsey();
        //static olan oparasyonlar için tekrar new lemeye ihtiyaç olmaz.
        //Zaten static kullanıldığında bellekte oluşturulmuştur

    }
}

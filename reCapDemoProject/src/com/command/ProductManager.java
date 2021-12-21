package com.command;

public class ProductManager {
    public void Update(Product product, double newPrice) {
        product.setPrice(newPrice);
        System.out.println(product.getName() + " urun guncellendi. Yeni fiyati: " + product.getPrice());
    }

    public void StockAmountUpdate(Product product, int newStock) {
        product.setStockAmount(newStock);
        System.out.println(product.getDescription() + " " + product.getName() + " urununun stoktaki adedi: " + product.getStockAmount());
    }

    public void NameUpdate(Product product, String newName) {
        String oldName;
        oldName = product.getName();
        product.setName(newName);
        System.out.println(product.getDescription() + oldName + " urununun yeni ismi: " + product.getName());
    }


}

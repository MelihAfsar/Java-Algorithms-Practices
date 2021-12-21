package com.command;

public class ProductManager {

    private BaseLogger logger;

    public ProductManager(BaseLogger logger){
        this.logger = logger;
    }

    public void PriceUpdate(Product product, double newPrice){
        product.setPrice(newPrice);
        System.out.println(product.getName() + " " + product.getDescription()  + " ürününün yeni fiyatı " + product.getPrice() + "  TL olmuştur. ");
        this.logger.log("Başarılı");
    }

    public void NameUpdate(Product product, String newName){
        product.setName(newName);
        System.out.println(product.getName() + " " + product.getDescription()  + " ürününün yeni ismi " + product.getName() + "  olmuştur. ");
        this.logger.log("Başarılı");
    }

    public void StockAmountUpdate(Product product,int newPiece){
        int stock = product.getStockAmount() - newPiece;
        product.setStockAmount(stock);
        System.out.println(product.getName() + " " + product.getDescription()  + " ürününün mevcut stoktaki durumu " + product.getStockAmount() + " adettir. ");
        this.logger.log("Başarılı");
    }

}

package com.command;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        int sayi = topla(7, 8, 9);
        System.out.println(yeniMesaj);
        System.out.println(sayi);
        int toplam = topla2(2, 3, 5, 7, 9, 10);
        int sonuc = carp(5,4,2);
        System.out.println(toplam);
        System.out.println(sonuc);

    }

    public static void ekle() {
        System.out.println("Eklendi.");
    }

    public static void sil() {
        System.out.println("Silindi.");

    }

    public static void guncelle() {
        System.out.println("Güncellendi.");

    }

    public static int topla(int x, int y, int z) {
        return x + y + z;
    }

    public static int topla2(int... sayilar) { //veriable arguments
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }

    public static int carp(int... numbers){
        int sonuc=1;
        for(int number: numbers){
            sonuc *=number;
        }
        return sonuc;
    }
}

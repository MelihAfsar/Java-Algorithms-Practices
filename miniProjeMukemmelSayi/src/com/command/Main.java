package com.command;

public class Main {

    public static void main(String[] args) {
        int sayi = 5,toplam=0;
        for (int i=1; i<sayi;i++ ){
            if (sayi%i==0) {
                toplam += i;
            }
        }
        if (toplam==sayi)
            System.out.println("Mukemmel sayidir.");
        else
            System.out.println("Mukemmel sayı değildir.");
    }
}

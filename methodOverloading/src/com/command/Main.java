package com.command;

public class Main {

    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(2,3);
        int sonuc2 = dortIslem.Topla(2,3,4);
        System.out.println(sonuc);
        System.out.println(sonuc2);

    }
}

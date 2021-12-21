package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        System.out.println(sayilar.size());
        sayilar.add(10);
        sayilar.add("ankara");
        sayilar.add(10.5);

        System.out.println(sayilar);

        //get ile indis numarası verilen eleman okunur
        System.out.println(sayilar.get(2));

        //set ile indis numarası verilen deger ile degisirilir.
        sayilar.set(0,100);
        System.out.println(sayilar);

        sayilar.remove(0);
        System.out.println(sayilar);

        //tamamen liste silinir.
        //sayilar.clear();
        //System.out.println(sayilar);

        for (Object i: sayilar){
            System.out.println(i);
        }


    }
}

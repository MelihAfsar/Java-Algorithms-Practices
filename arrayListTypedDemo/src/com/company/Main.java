package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Samsun");
        sehirler.add("Bursa");

        Collections.sort(sehirler);
        for(String i : sehirler){
            System.out.println(i);
        }





    }
}

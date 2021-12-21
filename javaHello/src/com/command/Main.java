package com.command;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

/*
        //case sensitive
        System.out.print("Hello JAVA");
        System.out.println("Hello JAVA2");


        //veriables
        //reusability = tekrar tekrar kullanilabilirlik
        int value = 10;
        String message = "Value: ";
        double value2 = 20.5;
        System.out.println(value);
        System.out.println("Value2: " + value2);
        System.out.println("Value2: " + value2);
        System.out.println(message + value);


        //dataTypes
        int value3 = 12;        //4bytes
        byte value4 = 127;     //1 byte
        short value5 = 32767;  //2bytes
        long value6 = 123;     //8bytes
        double value7 = 123.5;   //8bytes
        char character = 'A';
        String city = "Ankara";
        boolean question = false;


        //conditionals = sart
        if (value < 20) {
            System.out.println("20'den kucuktur");
        } else if (value == 20) {
            System.out.println("20'ye essitir");
        } else {
            System.out.println("20'den buyuktur");
        }

        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Gectiniz " + grade);
                break;
            case 'B':
                System.out.println("Gectiniz " + grade);
                break;
            case 'C':
                System.out.println("Gectiniz " + grade);
                break;
            case 'D':
                System.out.println("Gectininiz " + grade);
                break;
            case 'F':
                System.out.println("Kaldiniz" + grade);
                break;
            default:
                System.out.println("Gecersiz giris!");
        }


        //loop
        for (int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }

        int j=0;
        while(j<5) {
            j++;
        }
        System.out.println("\n" + j);

        int k=0;
        do {
           System.out.println("\n"+k);
           k++;
        }while(k<0);

        //Arrays
        String student1 = "Melih", student2 = "Eren", student3 = "Dogukan";
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Ahmet";
        ogrenciler[1] = "Mehmet";
        ogrenciler[2] = "Ceyhan";
        ogrenciler[3] = "Kasim";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        //or
        System.out.println("--------------------");
        for(String ogrenci: ogrenciler){
            System.out.println(ogrenci);
        }


        //multiDimensionalArray
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "Istanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Balikesir";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Sivas";
        sehirler[2][0] = "Izmir";
        sehirler[2][1] = "Manisa";
        sehirler[2][2] = "Aydin";

        for(int i=0 ; i<=2; i++){
            System.out.println("----------------");
            for(int j=0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }
*/
        
        //Strings
        String message = "Have a nice day.";
        System.out.println(message);
        System.out.println("Length: " + message.length());

        System.out.println("5. character " + message.charAt(3)); //stringlerde eleman bulma

        System.out.println(message.concat(" !!! :)")); // eski string ustene yeni string ekler
        String message2 = message.concat(" !!! :)");
        System.out.println(message2);

        System.out.println(message.startsWith("H")); //Ne ile baslıyor True or False
        System.out.println(message2.endsWith("."));  //Ne ile bitiyor True or false // buyuk kucuk harf duyarlidir.

        char[] characters = new char[4];
        message2.getChars(0,4,characters,0);
        //message2 metninden 0. elemandan 4. elemana kadar sec characters char array ine at array in 0. elemanina yazarak basla
        System.out.println(characters);

        System.out.println(message2.indexOf("ay")); //Karakterin ilk olarak kacinci karakterde oldugunu buluyor
        System.out.println(message2.lastIndexOf("av")); //Sagdan aramaya baslar ancak index numarasi degismez

        String message3;
        message3 = message2.replace(" ","-"); //karakterlerin birbiri yerine degistirme
        System.out.println(message3);

        String message4 = message.substring(10); //message dan 10. index itibariyle al
        System.out.println(message4);

        String message5 = message.substring(5,11); //5-11 arasini alir.
        System.out.println(message5);


        for(String word: message.split(" ")){ //message metnindeki kelimeleri ayirir.
            System.out.println(word);
        }

        System.out.println(message.toLowerCase()); //Kucuk harfe cevirme
        System.out.println(message.toUpperCase()); //Buyuk harfe cevirme

        String message6 = "        Bugün hava çok güzel.          ";
        System.out.println(message6.trim()); //message in basindaki ve sonundaki bosluklari atar

    }
}
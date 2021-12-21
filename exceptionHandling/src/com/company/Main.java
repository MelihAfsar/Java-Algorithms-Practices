package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =null;
        int toplam = 0;
        try{
            reader = new BufferedReader(new FileReader("C:\\Desktop\\Yazılım Dilleri\\BTK Akademi\\Java\\exceptionHandling\\src\\com\\company\\sayilar.txt"));
            String line = null;
            while ((line = reader.readLine())!=null){
                toplam += Integer.valueOf(line);
            }
            System.out.println(toplam);

        }catch (FileNotFoundException e) {
            e.printStackTrace();

        }finally{
            reader.close();
        }



    }
}

package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
//.createNewFile dosya olup olmamasına göre true veya false dondurur. Dosya yoksa yeni dosya üretir.
    public static void main(String[] args) {
        String dosyaYolu = "C:\\Desktop\\Yazılım Dilleri\\BTK Akademi\\Java\\files\\students.txt";
        String metin = "Herkese merhaba";

        createFile(dosyaYolu);
        getInfo(dosyaYolu);
        readFile(dosyaYolu);
        writeFile(dosyaYolu,metin);
        readFile(dosyaYolu);
    }

    public static void createFile (String dosyaYolu) {
        File file = new File(dosyaYolu);
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
            } else {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //ilgili yolda böyle bir dosya varsa True yoksa false dondurur. exists()
    public static void getInfo(String dosyaYolu){
        File file = new File(dosyaYolu);
        if(file.exists()){
            System.out.println("Dosya adı: " + file.getName()); //dosyanın ismini verir
            System.out.println("Dosya yolu: " + file.getAbsolutePath()); //dosya yolunu verir
            System.out.println("Dosya yazılabilir mi? : " + file.canWrite()); //dosya yazılabilir mi?
            System.out.println("Dosya okunabilir mi?: " + file.canRead()); //dosya okunabilir mi?
            System.out.println("Dosya boyutu: " + file.length()); //dosya boyutunu byte tipinde verir.
        }
    }

    public static void readFile(String dosyaYolu){
        File file = new File(dosyaYolu);
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Bu yöntem dosyanın üzerine yazar. File writer default olarrak bu şekilde yazar ancak bir paremetre daha eklenip
    // true olarak geçilirse append metoduna dönüşür.
    public static void writeFile(String dosyaYolu,String metin){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaYolu,true));
            writer.newLine(); //yeni satır oluştur. daha sonra alttaki işlemleri yap.
            writer.write(metin);
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package com.command;

public class Main {

    public static void main(String[] args) {
        char[] kalin = {'A', 'I', 'O', 'U'};
        char degisken = 'A';
        boolean kalinMi = true;

        for (int i = 0; i < kalin.length; i++) {
            if (kalin[i] == degisken) {
                kalinMi = true;
                break;
            } else {
                kalinMi = false;
            }

        }
        if (kalinMi) {
            System.out.println("Seçtiğiniz karakter kalındır.");
        } else {
            System.out.println("Seçtiğiniz karakter incedir.");
        }
    }
}

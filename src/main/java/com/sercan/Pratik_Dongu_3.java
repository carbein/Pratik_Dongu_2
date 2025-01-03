package com.sercan;

import java.util.Scanner;

public class Pratik_Dongu_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int sayi = input.nextInt();

        for (int i = 1; i < sayi; i*=4) {

            System.out.println(i);
        }
        for (int i = 1; i < sayi; i*=5) {

            System.out.println(i);
        }

    }
}

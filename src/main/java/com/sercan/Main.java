package com.sercan;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;
        int toplam=0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Lütfen sayı giriniz :");
            n = sc.nextInt();
            if (n%2==0 & n%4==0){
                toplam+=n;

            }
        }while (n %2 ==0);
        System.out.println(toplam);


    }
}
package com.company;

import java.util.Scanner;

public class InstrukcjeWarunkow2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = skaner.nextInt();
        if (liczba > 0) {
            System.out.println("Liczba jest dodatnia");
        }
        else if (liczba<0){
            System.out.println("Liczba jest ujemna");
        }
        else{
            System.out.println("Jest równa zero");
        }
        if (liczba%2==0){
            System.out.println("Liczba jest parzysta");
        }
        else{
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
package com.company;

import java.util.Scanner;

public class InstrukcjeWarunkowe4
{
    public static void main(String[] args)
    {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj cene towaru (zakrez od 100zł do 10000zł)");
        double cena=skaner.nextDouble();
        System.out.println("Podaj ilość rat (zakres od 6 do 48)");
        int raty=skaner.nextInt();
        if(cena<100 || cena>10000){
            System.out.println("Cena jest poza zakresem!");
            return;
        }
    }
}

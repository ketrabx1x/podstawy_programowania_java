package com.company;

import java.util.Scanner;

public class InstrukcjeWarunkowe3
{
    public static void main(String[] args)
    {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Czy pada deszcz? T/F");
        String czyDeszcz = skaner.nextLine();
        System.out.println("Czy swieci słońce? T/F");
        String czySwieciSlonce = skaner.nextLine();
        boolean deszcz;
        boolean swieciSlonce;
        if (czyDeszcz.equals("T")){
            deszcz=true;
        }
        else{
            deszcz=false;
        }
        if (czySwieciSlonce.equals("T")){
            swieciSlonce=true;
        }
        else{
            swieciSlonce=false;
        }
        if (!deszcz && swieciSlonce){
            System.out.println("Jest pogodnie!");
        }
        else if (deszcz && swieciSlonce){
            System.out.println("Tęcza!");
        }
        else if (!deszcz && !swieciSlonce){
            System.out.println("Jest pochmurno...");
        }
        else {
            System.out.println("Jest ulewa");
        }
    }
}

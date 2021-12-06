package com.company;

import java.util.Scanner;

public class Skaner
{
    public static void main(String[] args)
    {
        Scanner ankieter = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String imie = ankieter.nextLine();
        System.out.println(imie);
        System.out.println("Podaj nazwisko:");
        String nazwisko=ankieter.nextLine();
        System.out.println(nazwisko);
        System.out.println("Podaj wiek:");
        int wiek = ankieter.nextInt();
        System.out.println(wiek);
        boolean czyPelnoletni=wiek>=18;
        System.out.println("Czy osoba jest pełnoletnia: "+czyPelnoletni);
        System.out.println("Witaj "+imie+" "+nazwisko);
    }
}


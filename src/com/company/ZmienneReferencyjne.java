package com.company;

public class ZmienneReferencyjne
{
    public static void main(String[] args)
    {
        String imie=null;
        String nazwisko="Rokita";
        int wiek=20;
        System.out.println("Witaj "+imie+" "+nazwisko+". Wszystkoego najlepszego z okazji "+wiek+" urodzin!");

        System.out.println(imie.toUpperCase());
        System.out.println(nazwisko.toUpperCase());
        System.out.println(imie.equals(nazwisko));
        System.out.println(imie.equals(imie));

        String zdanie="Ala ma dwa koty i dwa psy";
        int iloscSymboli;
        System.out.println(zdanie.toUpperCase());
    }
}
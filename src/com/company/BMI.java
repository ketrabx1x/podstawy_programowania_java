import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
        Scanner ankieter = new Scanner(System.in);
        String powitanie="Witaj, to program to pomiaru BMI";
        System.out.println(powitanie);
        System.out.println("Podaj wagę: ");
        int waga=ankieter.nextInt();
        System.out.println(waga);
        System.out.println("Podaj wzrost: ");
        Scanner ankieter2 = new Scanner(System.in);
        double wzrost= ankieter2.nextDouble();
        System.out.println(wzrost);
        String dane="Podana waga to "+waga+" kg, podany wzrost to "+wzrost+" m";
        System.out.println(dane);
        double bmi=waga/(wzrost*wzrost);
        String wynik="Twoje BMI to "+bmi;
        System.out.println(wynik);
        boolean czyNadWaga=bmi>=24.9;
        System.out.println("Czy masz nadwagę: "+czyNadWaga);
        boolean czyNieDowaga=bmi<=18.5;
        System.out.println("Czy masz niedowagę: "+czyNieDowaga);
    }
}
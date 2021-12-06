import java.util.Scanner;

public class AGD
{
    public static void main(String[] args)
    {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Proszę podać cene towaru: (od 100 do 10000)");
        double cenaTowaru = skaner.nextDouble();
        System.out.println("Proszę podac ilość rat: (od 6 do 48)");
        int rata = skaner.nextInt();
        if(cenaTowaru<100 || cenaTowaru>10000)
        {
            System.out.println("Zła cena towaru");
            return;
        }
        if(rata<6 || rata>48)
        {
            System.out.println("Zła liczba rat");
            return;
        }
        double wysokoscOprocent;
        if(rata<=12)
        {
            wysokoscOprocent=0.025;
        }
        else if(rata <=24)
        {
            wysokoscOprocent=0.05;
        }
        else
        {
            wysokoscOprocent=0.1;
        }
        double wysokoscRat= cenaTowaru / rata;
        double oprocentowanie = wysokoscRat * wysokoscOprocent;
        double cenaOprocentowana = wysokoscRat + oprocentowanie;
        System.out.println("Wysokość twojej raty wynosi: "+cenaOprocentowana);
    }
}
import java.util.Scanner;

public class InstrukcjeWarunkow
{
    public static void main(String[] args)
    {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        int wiek = skaner.nextInt();
        if(wiek>=18)
        {
            System.out.println("Jesteś osobą pełnoletnią");
        }
        else if(wiek==17)
        {
            System.out.println("Przyjdź za rok!!!");
        }
        else
        {
            System.out.println("Nie jesteś pełnoletni");
        }
    }
}

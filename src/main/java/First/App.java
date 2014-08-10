package First;

/**
 * Hello world!
 *
 */
import com.sun.org.apache.regexp.internal.RE;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        MainGUI myFirstGUI = new MainGUI();
        Scanner input = new Scanner(System.in);
        int option = 0; //do nothing just for start
        double FirstInputNumber = 0;
        double SecondInputNumber = 0;
        double Result = 0;

        while(option != 5)
        {
            System.out.println("Wybierz opcje którą chcesz przeprowadzić:");
            System.out.println("Opcja pierwsza to dodawanie. Aby wybrac dodawanie wpisz 1");
            System.out.println("Opcja druga to odjemowanie. Aby wybrac dodawanie wpisz 2");
            System.out.println("Opcja trzecia to mnożenie. Aby wybrac dodawanie wpisz 3");
            System.out.println("Aby wyjść z programu należy wpisać 5.");

            option = input.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("Wprowadz pierwszą liczbe:");
                    FirstInputNumber = input.nextDouble();
                    System.out.println("Wprowadz drugą liczbe:");
                    SecondInputNumber = input.nextDouble();
                    Result = FirstInputNumber + SecondInputNumber;
                    System.out.println("Wynik to "+Result);
                    break;
                case 2:
                    System.out.println("Wprowadz pierwszą liczbe:");
                    FirstInputNumber = input.nextDouble();
                    System.out.println("Wprowadz drugą liczbe:");
                    SecondInputNumber = input.nextDouble();
                    Result = FirstInputNumber - SecondInputNumber;
                    System.out.println("Wynik to "+Result);
                    break;
                case 3:
                    System.out.println("Wprowadz pierwszą liczbe:");
                    FirstInputNumber = input.nextDouble();
                    System.out.println("Wprowadz drugą liczbe:");
                    SecondInputNumber = input.nextDouble();
                    Result = FirstInputNumber * SecondInputNumber;
                    System.out.println("Wynik to: " + Result);
                    break;
                default:
                    System.out.println("Wybrałeś złą opcje lub została błędznie wpisana. Spróbuj jeszcze raz.");
                    break;
            }
        }

        System.out.println( "Dziękujemy za skorzystanie z naszego programu! Zapraszamy ponownie." );

    }
}

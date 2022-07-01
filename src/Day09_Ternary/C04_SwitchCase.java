package Day09_Ternary;

import java.util.Locale;
import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day  : ");
        String day = scanner.next().toLowerCase(Locale.ROOT);

        switch (day) {
            case ("monday") :
                System.out.println("Weekday");
                break;
            case ("tuesday") :
                System.out.println("Weekday");
                break;
            case ("wednesday") :
                System.out.println("Weekday");
                break;
            case ("thursday") :
                System.out.println("Weekday");
                break;
            case ("friday") :
                System.out.println("Weekday");
                break;
            case ("saturday") :
                System.out.println("Weekday");
                break;
            case ("sunday") :
                System.out.println("Weekday");
                break;
            default         :
                System.out.println("Enter a valid day");
                break;


        }

        //Long double float boolean kullanilmaz


    }
}

package Day09_Ternary;

import java.util.Scanner;

public class C03_SwitchStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number : ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Monday");
            break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thurday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Enter a valid number");

        }

    }
}

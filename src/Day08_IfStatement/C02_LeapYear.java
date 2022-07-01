package Day08_IfStatement;

import java.util.Scanner;

public class C02_LeapYear {
    public static void main(String[] args) {
        //4 e bolunmeyen artik yil degil
        // 4 e bolunup yuze bolunmeyen artik yil degil
        // 400 kati artik yil degil

        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter a valid year : ");
        int year = scanner.nextInt();

        if ((year % 4 != 0) || (year % 100 != 0)) {
            if (year % 400 != 0) {
                System.out.println("Not a leap year ");
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Leap year");
        }

    }
}


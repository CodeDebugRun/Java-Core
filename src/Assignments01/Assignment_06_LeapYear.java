package Assignments01;

import java.util.Scanner;

public class Assignment_06_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year to calculate whether leap year : ");
        int year = scanner.nextInt();

        if ((year%100 == 0 && year%400 == 0) || (year%100 != 0 && year%4 == 0)) {
            System.out.println(year + " is a leap year");
        } else System.out.println(year + " is not a leap year");

        String result = year % 100 == 0 ? year % 400 == 0 ? "leap year" : "not a leap year" : year % 4 == 0 ? "leap year" : "not a leap year";
        System.out.println(result);



    }
}

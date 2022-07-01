package Assignments01;

import java.io.StringReader;
import java.util.Scanner;

public class Assignment_03LeakYear {
    public static void main(String[] args) {
        /*Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)
Sample:
      INPUT:
    Input a month number: 2
    Input a year: 2016
      OUTPUT  :
    February 2016 has 29 days*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year number :");
        int year = scanner.nextInt();
        System.out.print("Enter the month number : ");
        int  month = scanner.nextInt();
        String monthName = "January";
        int daysOfMonth = 30;


        switch (month) {
            case 1:
                monthName = "January";
                daysOfMonth = 31;
                break;
            case 2:
                monthName = "February";
                daysOfMonth = 28;
                break;
            case 3:
                monthName = "March";
                daysOfMonth = 31;
                break;
            case 4:
                monthName = "April";
                //daysOfMonth = 30;
                break;
            case 5:
                monthName = "May";
                daysOfMonth = 31;
                break;
            case 6:
                monthName = "June";
                //daysOfMonth = 30;
                break;
            case 7:
                monthName = "July";
                daysOfMonth = 31;
                break;
            case 8:
                monthName = "August";
                daysOfMonth = 31;
                break;
            case 9:
                monthName = "September";
                daysOfMonth = 30;
                break;
            case 10:
                monthName = "October";
                daysOfMonth = 31;
                break;
            case 11:
                monthName = "November";
                daysOfMonth = 30;
                break;
            case 12:
                monthName = "December";
                daysOfMonth = 31;
                break;
            default:
                System.out.println("Enter between 1-12");
        }


       int isLeakYear = year % 4 == 0 ? 0 : 1;

       switch (isLeakYear) {
           case 0:
               System.out.println(monthName + " " + year + " has 29 days");
               break;
           case 1:
               System.out.println(monthName + " " + year + " has " + daysOfMonth + " days");
               break;
           default:
               System.out.println("Invalid year");

       }
    }
}

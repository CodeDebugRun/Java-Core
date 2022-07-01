package Day07_IfStatements;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid day");
        String day = scan.next();

        dayScanner(day);
        double num = random();
        System.out.println(Math.round(num));

    }

    public static void dayScanner(String day) {
        if (day.equalsIgnoreCase("monday")) {
            System.out.println("the first day");
        }
        if (day.equalsIgnoreCase("tuesday")) {
            System.out.println("the second day");
        }
        if (day.equalsIgnoreCase("wednesday")) {
            System.out.println("the third day");
        }
        if (day.equalsIgnoreCase("thursday")) {
            System.out.println("the fourth day");
        }
        if (day.equalsIgnoreCase("friday")) {
            System.out.println("the fifth day");
        }
        if (day.equalsIgnoreCase("saturday")) {
            System.out.println("the sixth day");
        }
        if (day.equalsIgnoreCase("sunday")) {
            System.out.println("the last day");
        } else {
            System.out.println("Not a valid day");
        }
    }

    public static Double random() {
        return Math.random() * 100;
    }
}

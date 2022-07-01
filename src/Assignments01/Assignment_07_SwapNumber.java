package Assignments01;

import java.util.Scanner;

public class Assignment_07_SwapNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("first number : ");
        double num1 = scanner.nextDouble();
        System.out.print("second number : ");
        double num2 = scanner.nextDouble();
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int y = 20;

        System.out.println((y >= 20) ? (2 + y) : (y-3));

    }
}

package PracticeElif;

import java.util.Scanner;

public class ForLoopFaktoriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial");
        int number = scanner.nextInt();
        int factorial = 1;
        int result = 1;

        for (int i = 1; i <= number; i++) {
            factorial  = factorial * i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
        for (int i = number; i > 0; i--) {
            result  = result * i;
        }
        System.out.println("The factorial of " + number + " from top is " + result);

        }

    }


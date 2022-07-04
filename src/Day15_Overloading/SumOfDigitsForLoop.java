package Day15_Overloading;

import java.util.Scanner;

public class SumOfDigitsForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ...");
        int num = scanner.nextInt();
        int sumOfDigits = 0;

        for (int i = num; i > 0; i/=10) {
            sumOfDigits += num%10;
        }
        System.out.println(sumOfDigits);

        System.out.println("Enter the rows ...");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns ...");
        int columns = scanner.nextInt();

        for (int i = 1; i<=rows; i++){

            String s = "";
            for (int j = 1 ; j<=columns; j++) {
                s += "X ";
            }
            System.out.println(s);
        }

    }
}

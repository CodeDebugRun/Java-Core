package Day15_Overloading;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
    //find the valu of digits after . in double


    double d = 1213.45654654;
    String sd = String.valueOf(d);

    int idx = sd.indexOf(".") + 1;
    String decimal = sd.substring(idx);
        System.out.println(decimal);

    int decimalPart = Integer.valueOf(decimal);
        System.out.println(decimalPart);

    // fibonacci number
        Scanner scanner = new Scanner(System.in);
        System.out.println("enrter the number of fib  ");
        int n = scanner.nextInt();


    }
}

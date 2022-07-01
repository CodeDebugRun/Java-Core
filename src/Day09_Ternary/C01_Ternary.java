package Day09_Ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a valid number : ");
        double num = scanner.nextDouble();
        double num1;
        num1 = num<0 ? (-1*num) : num;
        System.out.println(num1);

      /*  Double num2 = num1;
        num2.toString();
        System.out.println(num2);*/

        System.out.print("Enter the first length of square : ");
        double length1 = scanner.nextDouble();
        System.out.print("Enter the second length of square : ");
        double length2 = scanner.nextDouble();

        String isSquare = length1 == length2 ?  "square" : "rectangle";

        System.out.println("It is a " + isSquare);
        System.out.println("The perimeter is " + calculatePerimeter(length1, length2));
        System.out.println("The area is " + calculateArea(length1, length2));


    }

    public static double calculatePerimeter (double x, double y) {
        return ((2*x) + (2*y));
    }public static double calculateArea (double x, double y) {
        return ((x*y));
    }

}

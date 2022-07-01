package Assignment02_Methods;
/*Kullaniciya kac sayi toplamak istedigini sorun
* Kullanici 2,3,4 degerini girerse kullanicidan bu sayilari girmesini isteyin
* ve sayilarin toplamini yazdirin 4 den buyuk girerse toplayamam yazdirin*/

import java.util.Scanner;

public class A02_AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number to calculate : ");
        int num1 = scanner.nextInt();
        addNumbers(num1);
        System.out.println(A01_TakeNumber.minusPlusCheck(num1));
        System.out.println(A01_TakeNumber.addDigits(num1));
        System.out.println(A01_TakeNumber.oddEven(num1));


    }
    public static void addNumbers(int num1){
        Scanner scanner = new Scanner (System.in);
        String result = "";
        if (num1 <= 1) {
            result = "Enter a number bigger than 1";
        } else if (num1 < 5) {
            if (num1 == 2) {
                System.out.println("Enter the first number : ");
                int num2 = scanner.nextInt();
                System.out.println("Enter the second number : ");
                int num3 = scanner.nextInt();
                int total = num2 + num3;
                result = "The result is " + total;
            }else if (num1 == 3) {
                System.out.println("Enter the first number : ");
                int num2 = scanner.nextInt();
                System.out.println("Enter the second number : ");
                int num3 = scanner.nextInt();
                System.out.println("Enter the third number : ");
                int num4 = scanner.nextInt();
                int total = num2 + num3 + num4;
                result = "The result is " + total;
            } else if (num1 == 4 ) {
                System.out.println("Enter the first number : ");
                int num2 = scanner.nextInt();
                System.out.println("Enter the second number : ");
                int num3 = scanner.nextInt();
                System.out.println("Enter the third number : ");
                int num4 = scanner.nextInt();
                System.out.println("Enter the fourth number : ");
                int num5 = scanner.nextInt();
                int total = num2 + num3 + num4 + num5;
                result = "The result is " + total;

            }

        } else result = "I can not calculate more than 4 numbers";
        System.out.println(result);
    }
}

package Assignment02_Methods;

import java.util.Scanner;

public class A01_TakeNumber {
    /*Kullanicidan bir sayi alin . Bu sayinin tek mi cift mi oldugunu
     * sifirdan buyuk mu kucuk mu oldugunu ayrica 100 den buyukse birler
     * 3 basamakli onlar ve yuzler basamagindaki rakamlarin toplamini 100 den kucukse sadece 1 ler basamagini
     * yazdiran 3 method olusturun*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        System.out.println(oddEven(number));
        System.out.println(minusPlusCheck(number));
        System.out.println(addDigits(number));

    }

    public static String oddEven(int num1) {
        String result = num1 % 2 == 0 ? " is Even number" : " is Odd number";
        return num1 + result;
    }

    public static String minusPlusCheck(int num1) {
        String result = num1 < 0 ? " is less than zero" : num1 == 0 ? " is equal to zero" : " is greater than zero";
        return num1 + result;
    }
    public static String addDigits (int num1){
        num1 = Math.abs(num1);
        int sum = num1<100 ? num1%10 : num1 < 1000 ? num1/100 + (num1/10)%10 + num1%10 : num1;
        String result = num1 < 1000 ? "The result is " : "Enter a number less than zero";
        return result + sum;

    }
}

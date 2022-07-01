package Day12_13_MethodCreation;

import java.util.Scanner;

public class Day12_MethodCreation {

    /*metod olustuma ahmet bulutluoz
    * method call in main
    * argument eklenmesi gerekiyorsa ekle
    * return type void olacaksa varibale olustur
    * deklarayona bak
    * return type void disinda ise return kullan
    * */
    public static void main(String[] args) {

        String java = "this is four Java is great";
        System.out.println(firstFour(java));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first num : ");
        int num3 = scanner.nextInt();
        System.out.print("Enter second num : ");
        int num4 = scanner.nextInt();
        System.out.println("Result of addition : " + addition(num3,num4));
        System.out.println("Result of subtraction : " + subtraction(num3,num4));
        System.out.println("Result of multiplication : " + multiplication(num3,num4));
        System.out.println("Result of division : " + division(num3,num4));
        concatenate(num3,num4);
    }

    public static void concatenate(int num3, int num4) {
        System.out.println("The entered numbers "+num3+ " "+num4);
    }

    static String firstFour(String str) {
        return str.substring(0, 4);
    }

    static int addition (int num1, int num2) {
        return  num1 + num2;
    }
    static int subtraction (int num1, int num2) {
        return  num1 - num2;
    }
    static int multiplication (int num1, int num2) {
        return  num1 * num2;
    }
    static int division (int num1, int num2) {
        return  num1 / num2;
    }
}
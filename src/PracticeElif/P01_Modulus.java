package PracticeElif;

import java.util.Scanner;

public class P01_Modulus {
    public static void main(String[] args) {
        /*
        Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
        Ex :
        input  : 12345
        output : 3*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five digit number : ");
        int i = scanner.nextInt();
        int sumFirstTwoDigit = ((i/1000)%10) + (i/10000);
        int sumLastTwoDigit = (i%10) + ((i/10)%10);
        System.out.println("sumFirstTwoDigit = " + sumFirstTwoDigit);
        System.out.println("sumLastTwoDigit = " + sumLastTwoDigit);

    }
}

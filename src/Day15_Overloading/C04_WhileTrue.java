package Day15_Overloading;

import java.util.Scanner;

public class C04_WhileTrue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bir sayi giriniz");

            int i = scanner.nextInt();
            if (i == -1) break;

            System.out.println("Girilen sayi : " + i);

        }
    }
}
package Day15_Overloading;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();



        for (int i = 1; i < num; i++) {
            if (i%3==0) {
             System.out.println(i + " is divided by 3 with zero remainder");
            }
            if (i%5==0) {
                System.out.println(i + " is divided by 5 with zero remainder ");
            }
            if (i%7==0) {
                System.out.println(i + " is divided by 7 with zero remainder ");
            }

        }


    }
}
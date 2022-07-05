package Day16_WhileLoop01;

import java.util.Scanner;

public class C01_GuessNumber {
    public static void main(String[] args) {
        //Print  543 54 and 5 on the console
        /* for (int i = 1; i <= 5; i++) {
            for (int j = (5-i); j > 1; j--) {
                System.out.print(i+j);
            }
            System.out.println();
        }*/

        int target = (int) (Math.random() * 1000);
        System.out.println(target);
        int attempt = 10;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 1-1000 to play :  ");
            int number = scanner.nextInt();

            if (number < 0 || number > 1000) {
                attempt--;
                System.out.println("Please enter a number between 1-1000");
            } else if (number < target) {
                attempt--;
                System.out.println("Target is greater than " + number + ". Attempt left is " + attempt);
            } else if (number > target) {
                attempt--;
                System.out.println("Target is less than " + number + ". Attempt left is " + attempt);
            } else{
                System.out.println("Remained attempt " + attempt);
                System.out.println("Congrats you win");
                //Burada attempt esittir sifirda calisiyor break de calisiyor;
                //attempt = 0;
                break;
            }

        } while (attempt > 0);
    }
}
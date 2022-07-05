package Assignment02_Methods;

import java.util.Scanner;

public class A07_ReverseForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a sentence to reverse : ");
        String sentence = scanner.nextLine();

        for (int i = sentence.length() - 1; i >= 0; i--) {
            //sentence = "" +sentence.charAt(i);
            System.out.print(sentence.charAt(i));
        }

    }
}

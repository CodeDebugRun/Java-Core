package Assignment02_Methods;

import java.util.Scanner;

public class A06_PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int deneme = 5;
        do {
            System.out.print("Enter a word to check for palindrome :");
            String word = scanner.next();

            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord += word.substring(i, i + 1);
            }
            //System.out.println(reverseWord);

            if (reverseWord.equals(word)) {
                System.out.println(word + " is palindrome");
                deneme = 0;
            } else {
                System.out.println(word + " is not palindrome");
                System.out.println("Kalan deneme : " + (deneme -1));
            } --deneme;
        }while (deneme > 0);

    }
}

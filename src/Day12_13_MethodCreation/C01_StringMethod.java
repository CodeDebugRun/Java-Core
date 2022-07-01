package Day12_13_MethodCreation;

import java.util.Scanner;

public class C01_StringMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to convert");
        String word = scanner.nextLine();
        reverseString(word);

    }
    public static void reverseString (String s1){
        for (int i = s1.length()-1; i >= 0; i--){
            System.out.print(s1.charAt(i));
        }

    }
}

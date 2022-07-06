package Day17_Arrays01;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays04 {
    //Create a string array by getting element from user
    //Type code to pu elements in Alphabetical order
    //Type code to put total number of char in the first and last string

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word ");
        String word = scanner.nextLine();

        String [] wordChars = new String[word.length()];
        for (int i = 0; i < (word.length()) ; i++) {
            wordChars [i] = String.valueOf(word.charAt(i));
        }
        System.out.println(Arrays.toString(wordChars));
        System.out.println(word);
        Arrays.sort(wordChars);
        System.out.println(Arrays.toString(wordChars));
    }

}

package Day15_Overloading;

import java.util.Scanner;

public class C04_ReverseString {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string to reverse ");
    String word = scanner.nextLine();
    String reverse = "";
    for (int i = word.length()-1; i >= 0; i--) {

        reverse += word.substring(i, i+1);

    }
        System.out.println(reverse);


}
}

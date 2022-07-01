package day06_Concatenation;

import java.util.Locale;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        /*String course = "Techpro Education";
        for(int i=0; i<(course.length()); i++){
            System.out.println(course.toUpperCase(Locale.ROOT).charAt((course.length()-1)-i));
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = scanner.nextLine();
        System.out.println(s);
    }
}

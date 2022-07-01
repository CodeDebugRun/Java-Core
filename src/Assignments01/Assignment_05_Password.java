package Assignments01;

import java.util.Scanner;

public class Assignment_05_Password {
    //Ask the user to enter a password at least 8 characters long no spaces
    // contains at least one uppercase one lowercase and one symbol (different from letters and digits)
    // in regular expressions ^ means other than
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Password : ");
        String password = scanner.nextLine();

        if (password.length() < 8) {
            System.out.println("Shorter than 8 characters");
        } else if (password.replaceAll("[^A-Z]", "").length() == 0) {
            System.out.println("Does not have uppercase");
        } else if (password.replaceAll("[^a-z]", "").length() == 0) {
            System.out.println("Does not have lowercase");
        } else if (password.replaceAll("[A-Za-z0-9]", "").length() == 0) {
            System.out.println("Does not have a symbol");
        } else if (password.contains(" ")){
            System.out.println("No space character is allowed in password");
        }
        else {
            System.out.println("Password is valid welcome to Chase Bank");
        }

        }

}

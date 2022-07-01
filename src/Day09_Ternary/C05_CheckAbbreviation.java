package Day09_Ternary;

import java.util.Scanner;

public class C05_CheckAbbreviation {
    //Check the name of the states
    //must be 2 characters and all uppercase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a valid state abbreviation: ");
        String state = scanner.nextLine();

        String validName = state.length() == 2 && state.replaceAll("[A-Z]", "").length() == 0 ?
                "valid" : "invalid";
        System.out.println(validName);



    }


}

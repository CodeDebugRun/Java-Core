package Assignments01;

import java.util.Scanner;

public class Assignment_02 {
    public static void main(String[] args) {
     /*Write a switch statement that tests the value of the char variable response and performs the following actions:
if response is a, the message Your request is being processed is printed
if response is b, the message Thank you anyway for your consideration is printed
if response is c, the message Sorry, no help is currently available is printed for any other value of response,
the message "Invalid entry, please try again!" is printed
Create Scanner object.
Use charAt() method, in order to get the char value at the specified index.
Example:
-Display prompt: "Enter command:"
input: a -Display prompt: "Your request is being processed"
      */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command: ");
        String command = scanner.next();
        command = String.valueOf(command.charAt(0));
        System.out.println(command);
        if (command.equals("a")){
            System.out.println("Your request is being processed");
        } else if (command.equals("b")){
            System.out.println("Thank you anyway for your consideration");
        } else if (command.equals("c")){
            System.out.println("Sorry, no help is currently available");
        } else {
            System.out.println("Invalid entry, please try again!");
        }

        switch (command) {
            case "a" : System.out.println("Your request is being processed");
            break;
            case "b" : System.out.println("Thank you anyway for your consideration");
            break;
            case "c" : System.out.println("Sorry, no help is currently available");
            break;
            default  : System.out.println("Invalid entry, please try again!");
        }


        /*System.out.println(name);

        if (name.contains("a")){
            System.out.println("Girdiginiz isim A harfi iceriyor");
        }else if (name.contains("z")){
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }else {
            System.out.println("Girdiginiz isimde ikiside yoktur");
        }*/

    }
}

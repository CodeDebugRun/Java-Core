package Assignment02_Methods;

import java.util.Scanner;

public class A04_CheckEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address : ");
        String email = scanner.nextLine();

        System.out.println(checkEmail(email));

    }

    public static String checkEmail(String email) {
        String result = !email.contains("@") ? email + " is not a valid email address" :
                !email.contains("@gmail.com") ? " Enter your email address : " :
                        !email.endsWith("@gmail.com") ? " Wrong spelling check your email address" :
                                " It appears to be a valid email address.";
        return result;


    }
}

    /*public static String checkEmail2(String email) {
        String result = !email.contains("@") ? email+ " is not a valid email address" :
                !email.contains("@gmail.com") ?  checkEmail2(email) :
                        !email.endsWith("@gmail.com") ? " Wrong spelling check your email address" :
                                " It appears to be a valid email address.";
        return result;


    }*/


package Assignment02_Methods;

import java.util.Scanner;

public class A06Regex {
    public static void main(String[] args) {

      Scanner scanner = new Scanner (System.in);
        //System.out.println("enter password");
        //String password = scanner.nextLine();
        String password2 = "ABCabd123!@#$%^";
        String password3 = "ABCabd123!@#$%^";

        password2 = password2.replaceAll("[A-Z]", "a");
        System.out.println(password2);
        password2 = "ABCabd123!@#$%^";
        password2 = password2.replaceAll("[^A-Z]", "a");
        System.out.println(password2);
        password3 = password3.replaceAll("[a-z]", "z");
        System.out.println(password3);
        password3 = password3.replaceAll("[!-z]", "(");
        System.out.println(password3);






            }
        }



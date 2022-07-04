package Assignment02_Methods;

import java.util.Scanner;
import java.util.regex.*;

public class A04_CheckEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address : ");
        String email = scanner.nextLine();

        System.out.println(checkEmail(email));
        // Test Case 1:
        String str1 = "Geeks@portal20";
        System.out.println(isValidPassword(str1));

        // Test Case 2:
        String str2 = "Techpro Education";
        System.out.println(isValidPassword(str2));

        // Test Case 3:
        String str3 = "tech9";
        System.out.println(isValidPassword(str3));

        // Test Case 4:
        String str4 = "1234";
        System.out.println(isValidPassword(str4));

        // Test Case 5:
        String str5 = "tc@20";
        System.out.println(isValidPassword(str5));

        // Test Case 6:
        String str6 = "techs@portal20";
        System.out.println(isValidPassword(str6));


    }

    public static String checkEmail(String email) {
        String result = !email.contains("@") ? email + " is not a valid email address" :
                !email.contains("@gmail.com") ? " Enter your email address : " :
                        !email.endsWith("@gmail.com") ? " Wrong spelling check your email address" :
                                " It appears to be a valid email address.";
        return result;


    }
    public static boolean isValidPassword(String password)
    {

        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        // Return if the password
        // matched the ReGex
        return m.matches();
    }
    // Driver Code.
    //public static void main(String args[])



    }





package Assignment02_Methods;
//AD soyad KK numarasini alin
// ad soyad ilk harfi buyuk
// kk aralarinda bosluk olacak 16 haneli yazin
// duzenlenmis hallerini geri dondurun

import java.util.Scanner;

public class A05_CheckCardNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your second name : ");
        String secondName = scanner.nextLine();

        System.out.print("Enter your credit card number : ");
        String creditCardNumber = scanner.nextLine();

        System.out.println("Welcome " +nameCheck(firstName, secondName));
        System.out.println("Your card number is " +cardNumberCheck(creditCardNumber));



    }

    public static String cardNumberCheck(String creditCardNumber) {
        String result = creditCardNumber.substring(0,4)
                         + " "
                         + creditCardNumber.substring(4,8)
                         + " "
                         + creditCardNumber.substring(8,12)
                         + " "
                         + creditCardNumber.substring(12,16);

        return result;

    }

    public static String nameCheck(String firstName, String secondName) {
        String result = firstName.substring(0,1).toUpperCase() +
                        firstName.substring(1,(firstName.length()-1)).toLowerCase() +
                        " " +
                        secondName.substring(0,1).toUpperCase() +
                        secondName.substring(1,(secondName.length()-1)).toLowerCase()
                        ;
        return result;
    }


}

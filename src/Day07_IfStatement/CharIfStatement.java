package Day07_IfStatement;

import javax.print.DocFlavor;
import java.util.Locale;
import java.util.Scanner;

public class CharIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen istediginiz gun isminin ilk harfini giriniz");

        char letter = scan.next().toLowerCase().charAt(0);

        if(letter=='p') {
            System.out.println("pazartesi, perşembe veya pazar");
        }
        if(letter=='s') {
            System.out.println("sali");
        }
        if(letter=='c') {
            System.out.println("carsamba, cuma veya cumartesi");
        }

        if(letter!='p' && letter!='s'  && letter!='c')
            System.out.println("Lutfen gecerli bir harf giriniz");

        scan = new Scanner(System.in);
        System.out.println("Enter a month");
        String month = scan.next();
        month = (month.toLowerCase(Locale.ROOT).equals("january")) ? "January" : "Other than January";
        System.out.println(month);

        String name = "Erhan";
        String name1 = "Erhan";
        System.out.println(name == name1);
        System.out.println(name.matches(name1));

    }
}

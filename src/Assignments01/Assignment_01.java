package Assignments01;

import java.util.Locale;
import java.util.Scanner;

public class Assignment_01 {
    public static void main(String[] args) {
        /*
         Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
         (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
        Input :
        John White 1234234534561478
        Output :
        Name : J*** W****
        CCN : **** **** **** 1478*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name, Surname and Credit Card Number : ");
        String name = scanner.next();
        String surname = scanner.next();
        String creditCardNumber = scanner.next();
        System.out.println(name + " " + surname + " " + creditCardNumber);

        String nameInit = name.toUpperCase().substring(0,1);
        String surnameInit = surname.toUpperCase(Locale.ROOT).substring(0,1);
        name = name.toUpperCase(Locale.ROOT).replaceAll("\\w" ,"*");
        surname = surname.toUpperCase(Locale.ROOT).replaceAll("\\w" ,"*");
        String creditCardNumberLast4 = creditCardNumber.substring(12);
        creditCardNumber = ("**** **** **** " + creditCardNumberLast4);

        System.out.println("Name : " + nameInit + name + " " + surnameInit + surname);
        System.out.println("CCN  : " + creditCardNumber);

        /* isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        // kredi kartinin ilk 4 rakami gorunsun geriye kalan *
        String isimIlkHarf= isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar= isim.substring(1).replaceAll("\\w","*");
        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w","*");
        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar= " **** **** ****";
        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                           soyisimIlkHarf+soyisimGeriyeKalanlar+ "\n" +
                           kkIlk4+kkGeriyeKalanlar );*/


    }
}

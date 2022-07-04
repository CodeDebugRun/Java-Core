package PracticeElif;

import java.util.Scanner;

import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.D;

public class DoWhileAdd {
    /*Kullancidan ekrana sayi girmesini isteyin toplam 500 e ulasinca
     * calismayi durdurun*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        do {
            System.out.print("Toplam 500 olana kadar sayi giriniz : ");
            int number = scanner.nextInt();
            /*String numberCorrected = "" + number;
            numberCorrected = numberCorrected.replaceAll(("[^0-9]") , "");
            numberCorrected = numberCorrected.replaceAll(("\\D") , "");
            number = Integer.parseInt(numberCorrected);*/
            sum += number;
            System.out.println("yeni toplam : " + sum);
        } while (sum < 500);
        //Sifre isteyin kucuk buyuk harf rakam icermeli en az 8 karakter

        int girisHakki = 5;
        /*do {
            System.out.print("Enter pasword to use : ");
            String password = scanner.nextLine();
            //if (password.contains("[^a-zA-Z0-9]")) {
            if (password.contains("[a-zA-Z0-9]")) {
                System.out.println(password);
                girisHakki = 0;
            } else if (!password.contains("[a-zA-Z0-9]")){
                System.out.println("Yanlis giris kalan giris hakki : "+ girisHakki);
            }girisHakki = girisHakki - 1;}
            while (girisHakki>0) ;*/
        do {
            System.out.print("Enter pasword to use : ");
            String password = scanner.nextLine();
            if (password.contains("A")) {
                System.out.println(password);
                girisHakki = 0;
            } else if (!password.contains("[a-zA-Z0-9]")){
                System.out.println("Yanlis giris kalan giris hakki : "+ girisHakki);
            }girisHakki = girisHakki - 1;}
        while (girisHakki>0) ;


            }
        }

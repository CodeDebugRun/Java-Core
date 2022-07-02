package Day15_Overloading;

import java.util.Scanner;

public class C03_AtmMachine {
    /*While dongusu yardimiyla temel atm islemlerini yapan program yazi
    01 Bakiye ogrenme
    02 Para yatirma
    03 para cekme
    04 cikis
    * */
    public static void main(String[] args) {

        String ekranMetni = (" 01 Bakiye ogrenme \n" +
                           "  02 Para yatirma \n " +
                            " 03 para cekme\n" +
                            "  04 cikis  ");
        System.out.println("**********************");
        System.out.println(ekranMetni);
        System.out.println("**********************");
        int bakiye = 100000;


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Islem numarasini girin ");
            int islemNumarasi = scanner.nextInt();
            if (islemNumarasi == 4) {
                System.out.println("Islemi iptal ettiniz");
                break;
            }
            if (islemNumarasi > 4 || islemNumarasi < 0) {
                System.out.println("gecersiz secim tekrar girin");

            }

            if (islemNumarasi == 1) {
                System.out.println("Bakiyeniz " + bakiye);
            }
            if (islemNumarasi == 2) {
                System.out.println("Yatirmak istediginiz tutari giriniz");
                int yatirilanTutar = scanner.nextInt();
                scanner.nextLine();
                bakiye += yatirilanTutar;
                System.out.println("Yeni bakiyeniz : " + bakiye );
            }
            if (islemNumarasi == 3) {
                System.out.println("Cekmek istediginiz tutari giriniz");
                int cekilenTutar = scanner.nextInt();
                scanner.nextLine();
                bakiye -= cekilenTutar;
                System.out.println("Yeni bakiyeniz : " + bakiye );
            }


        }
    }
}
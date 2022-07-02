package Day15_Overloading;
/* Girilen bir sayinin armstronfg sayisi olup olmadigini bulun
* 4 basamakil bir sayinin armstrong sayisi olmasi icin
* her basamak degerinin basamak sayisi kadar kuvvetini alin
* iki sayi esitse arsmtrong sayisidir*/

import java.util.Scanner;

public class C03_Armstrong_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi girin Armstrong Number  mi bakalim : ");
        int number = scanner.nextInt();
        int basamaksayisi = (""+number).length();
        //System.out.println(basamaksayisi);
        int loopSayisi = number;
        int toplam = 0;
        do {
            toplam += Math.pow((loopSayisi%10), basamaksayisi);
            //System.out.println(toplam);
            loopSayisi/= 10;
        }while(loopSayisi>0);
        //System.out.println(number);
        //System.out.println(toplam);

        if(number == toplam){
            System.out.println("Girdiginiz sayi Armstrong_Number");
        } else System.out.println("Girdiginiz sayi Armstrong_Number degil");


    }
}

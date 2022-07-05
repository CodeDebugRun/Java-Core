package Day15_Overloading;

import static Day16_WhileLoop01.C04_DrawStars.drawStars;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        // verilen iki sayiyi carpip
                // sonucu bize donduren bir method olusturun
                int sayi1=10;
                int sayi2=5;
                int sonuc=carpGetir(sayi1,sayi2);
                System.out.println("Illa da sonucu goreyim diyenlere main method icinde : " + sonuc);

                drawStars(4,10);


            }
            public static int carpGetir(int sayi1, int sayi2) {
                int sonuc=sayi1*sayi2;
                System.out.println("Illa da sonucu goreyim diyenlere diger method icinde : " + sonuc);
                return sonuc;

            }
        }


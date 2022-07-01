package Assignment02_Methods;
 /*Verilen iki sayının sıfırdan buyuk veya esıt toplamını hesaplayan ve yazdıran
 * java programı yazdırın snuc 10 dan fazla basamaklı ise overflow yazdırın*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class A05_AddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        double num1 = scanner.nextDouble();
        System.out.print("Ikinci sayiyi giriniz : ");
        double num2 = scanner.nextDouble();
        addNumbers(num1, num2);

    }
    public static void addNumbers(double num1, double num2) {
        String result = num1<0 && num2<0 ? "Sifirdan buyuk sayi giriniz " :
                        (""+num1+num2).length()>10 ? "Overflow " :
                        (num1+num2+"");
        System.out.println(result);

    }
}

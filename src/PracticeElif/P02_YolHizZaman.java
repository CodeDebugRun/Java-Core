package PracticeElif;

import java.util.Scanner;

public class P02_YolHizZaman {
    public static void main(String[] args) {
        /* Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in KM : ");
        double distance = scanner.nextInt();
        System.out.println("Enter speed in km : ");
        double speed = scanner.nextInt();
        Double totalTime = distance / speed;

        System.out.print("totalTime = " );
        System.out.printf("%.2f", totalTime);
        System.out.println(" hours");
    }
}

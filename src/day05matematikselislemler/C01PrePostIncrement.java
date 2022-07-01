package day05matematikselislemler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01PrePostIncrement {
    public static void main(String[] args) {

       /* int sayi = 10;
        System.out.println("pre increment " + ++sayi);
        System.out.println("post increment " + sayi++);
        System.out.println("post increment sonra " + sayi);*/



      /*  System.out.println(sayi1.toString());
        System.out.println(sayi1.toString().length());*/
       /* for (int i=0; i < sayi1.toString().length(); i++ ){
            System.out.println(sayi1.toString().charAt(i));
            }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");
        Integer sayi1 = scan.nextInt();
        System.out.println(sayi1);


        int sum = 0;
  /*      for (int i = 0; i < sayi1.toString().length(); i++ ){
            int j = sayi1%10;
            sayi1 = sayi1/10;
            sum += j;
        }*/
        for (sum = 0; sayi1 != 0; sayi1 = sayi1/10 ){
          sum = sum + sayi1%10;
            System.out.println(sum);

    }
        System.out.println(sum);
}}

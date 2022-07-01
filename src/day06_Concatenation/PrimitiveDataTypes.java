package day06_Concatenation;

import java.util.Arrays;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        /* Primitive data type
        byte: only takes whole numbers
        short: only takes whole numbers
                int(used more often): only takes whole numbers
        long: only takes whole numbers
        float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
        boolean: true or false boolean expressions
        char: character within single quote ''
        also takes number
                * Range: double > float >long > int >short > byte
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        //long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        //SOUTV class içindeki değişkenlerin tamamını yazdırır.


        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byteMax = " + byteMax);
        System.out.println("byteMin = " + byteMin);

        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;

        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);

        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;

        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);



    }
}

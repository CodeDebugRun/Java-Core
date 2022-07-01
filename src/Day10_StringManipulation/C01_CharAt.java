package Day10_StringManipulation;

import java.util.Locale;

public class C01_CharAt {
    public static void main(String[] args) {
        String str = "Learning jaça is great";

        //Indeks disinda sayi girersek java exception verir
        //CharAT() metodu char doner sonrasinda diger String metodlari kullanilmaz


        System.out.println(str.charAt(5));
        System.out.println(str.toUpperCase(Locale.ROOT).charAt(12));
        System.out.println(str.charAt(20));

        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.ROOT));

    }
}

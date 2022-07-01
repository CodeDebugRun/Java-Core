package Day07_IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
         /*
        Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin
         */

        String p="Pazartesi,Persembe,Pazar";
        String s="Salı";
        String c="Carsamba,Cuma,Cumartesi";

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinin birinin ilk harfini giriniz.");

        String ilkHarf= scan.next();
        //ilkHarf = ilkHarf.toLowerCase(Locale.ROOT);


        if (ilkHarf.equals("p")){
            System.out.println("P harfi ile baslayan gunler : "+p);

        }
        if (ilkHarf.equals("s")){
            System.out.println("S harfi ile baslayan gunler : "+s);

        }
        if (ilkHarf.equals("c")){
            System.out.println("C harfi ile baslayan gunler : "+ c);

        }
        if (ilkHarf.equals("d")){
            System.out.println("bu olur");
        }
    }
    }


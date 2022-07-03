package Day08_IfStatement;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int girisHakki = 10;
        while (true) {

            System.out.println("Lutfen bir gun ismi giriniz... :");
            String girilenGun = scan.next().toLowerCase();
            if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba")
                    || girilenGun.equals("persembe") || girilenGun.equals("cuma") || girilenGun.equals("cumartesi")
                    || girilenGun.equals("pazar"))) {
                System.out.println("gecerli bir gun giriniz");
                girisHakki--;
                System.out.println("Kalan Giris Hakkiniz : " + girisHakki);
            } else {
                String ilkUcHarf = girilenGun.substring(0, 3);
                System.out.println(ilkUcHarf.substring(0, 1).toUpperCase() + ilkUcHarf.substring(1));
                break;
            }
            if(girisHakki==0){
                System.out.println("Hakkiniz doldu");
                break;
            }

        }
    }
}

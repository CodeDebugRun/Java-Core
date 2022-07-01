package Day08_IfStatement;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz... :");
        String girilenGun = scan.next().toLowerCase();
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba")
                || girilenGun.equals("persembe") || girilenGun.equals("cuma") || girilenGun.equals("cumartesi")
                || girilenGun.equals("pazar"))) {
            System.out.println("gecerli bir gun giriniz");
        } else {
            String ilkUcHarf = girilenGun.substring(0, 3);
            System.out.println(ilkUcHarf.substring(0, 1).toUpperCase() + ilkUcHarf.substring(1));

        }
    }
}

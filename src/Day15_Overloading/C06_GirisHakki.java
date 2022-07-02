package Day15_Overloading;

import java.util.Scanner;

public class C06_GirisHakki {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int girisHakki = 3;

        String userName = "Ali Veli";
        String password = "12345678";

        System.out.println("****************************");
        System.out.println("Kullanici Girisine Hosgeldiniz");
        System.out.println("****************************");

        while (true) {
            System.out.print("Kullanici adinizi girin : ");
            String userEntry = scanner.nextLine();
            System.out.print("Sifrenizi girin : ");
            String userPassword = scanner.nextLine();

            if (userName.equals(userEntry) && userPassword.equals(password)) {
                System.out.println("Hosgeldiniz  " + userName);
                break;
            } else if (!userName.equals(userEntry) && !userPassword.equals(password)){
                System.out.println("Adiniz ve parolaniz yanlis");
                girisHakki -= 1;
                System.out.println("Kalan Giris Hakkiniz : " + girisHakki);
            } else if (!userPassword.equals(password)) {
                System.out.println("Parolaniz yanlis");
                girisHakki -= 1;
                System.out.println("Kalan Giris Hakkiniz : " + girisHakki);
            } else {
                System.out.println("Kullanici adiniz yanlis");
                girisHakki -= 1;
                System.out.println("Kalan Giris Hakkiniz : " + girisHakki);
            }
            if (girisHakki == 0){
                //System.out.println("Kalan Giris Hakkiniz : " + girisHakki);
                System.out.println("Giris hakkiniz bitti");
                break;
            }
        }
    }
}

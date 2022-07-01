package PracticeElif;

import java.util.Scanner;

public class P03_Scanner {
    public static void main(String[] args) {
        /*Q09_Scanner02
        kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        ve yasadiklari yeri seviyorlarsa
        bu bilgiyi yazdirin
        next() only can read the first word
        nextLine() can read the whole line*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name : ");
        String name = scanner.nextLine();
        System.out.println("Hometown : ");
        String homeTown = scanner.nextLine();
        System.out.println("Your location : ");
        String location = scanner.nextLine();
        System.out.println("Your age : ");
        int age = scanner.nextInt();
        System.out.println("Your height : ");
        double height = scanner.nextDouble();
        System.out.println("Love " + location + " : True or False");
        boolean doLove = scanner.nextBoolean();
        String love = doLove ? "loves" : "does not love";
        /*if (doLove) {
            love = "loves";
        } else {
            love= "does not love";
        }*/

        System.out.println(name + "was born in " + homeTown + "and living in " + location + "at the age of " + age +
                " and height is " + height + "   " + love + "his country" );

    }

}

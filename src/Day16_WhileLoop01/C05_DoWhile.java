package Day16_WhileLoop01;

import java.util.Scanner;

public class C05_DoWhile {
    public static void main(String[] args) {
        //writeNumbers();
        //writeletters();
        //addNumbers();
        tekrarlananHarf();


    }

    public static void writeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int tillTheNumber = scanner.nextInt();
        int i = 9;
        do {
            if (i % 7 == 0) {
                System.out.println(i + " is divided by 7 with 0 remainder");
            }
            i++;
        } while (i < tillTheNumber);
    }

    public static void writeletters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letter : ");
        char tillTheletter = scanner.next().charAt(0);
        char fromTheLetter = 'm';
        do {
            System.out.println(fromTheLetter);
            fromTheLetter--;
        } while (fromTheLetter > tillTheletter);

    }

    public static void addNumbers() {
        Scanner scanner = new Scanner(System.in);
        int addedNumber = 0;
        int sum = 0, counter = 0;
        do {
            System.out.println("Enter the number : ");
            addedNumber = scanner.nextInt();
            if (addedNumber < 0) {
                System.out.println("You can not enter negative numbers");

            } else {
                sum += addedNumber;
                counter++;
            }
        } while (addedNumber != 0);
        System.out.println("You entered " + counter + " numbers.And the total is " + sum);


    }

    public static void tekrarlananHarf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to find repeated letters : ");
        String str = scanner.nextLine();
        String harfler = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))) {
                if (!harfler.contains(str.substring(i, i + 1))) {
                    harfler += str.substring(i, i + 1) + " ";
                }
            }
        }
        System.out.println(harfler);
        //return harfler;
    }
}

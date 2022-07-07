package Day16_WhileLoop01;

import java.util.Locale;
import java.util.Scanner;

public class C04_DrawStars {
    public static void main(String[] args) {
        //drawStars(4,8);
        //writeNumbers();
        //writeletters();
        //multiplicationTable();
        tamBolenler();



    }
    public static void drawStars(int x, int y) {
        for (int i = x; i > 0; i--) {
            for (int j = y; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void writeNumbers(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number : ");
            double k = scanner.nextInt();
            System.out.print("Enter the second number : ");
            double l = scanner.nextInt();
            k = Math.abs(k);
            l = Math.abs(l);
        System.out.println(Integer.MAX_VALUE);
            while (k<(l+1)){
                    if (k > Integer.MAX_VALUE && l > Integer.MAX_VALUE){
                    System.out.println("Enter a smaller number");}
                    else if (k % 3 == 0 && k % 5 == 0){
                        System.out.println(k + " is divisible of 3 and 5");
                    } else if (k % 5 == 0){
                        System.out.println(k + " is divisible of 5 only");
                    } else if (k % 3 == 0) {
                        System.out.println(k + " is divisible of 3 only");
                    } else System.out.println(k + " is not divisible by 3 and 5");
            k++;
            }

        }
    public static void writeletters (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first letter : ");
        String k = scanner.next();
        char m = k.charAt(0) ;
        System.out.print("Enter the second letter : ");
        String l = scanner.next();
        char n = l.charAt(0);
             while (m<=n){
                 System.out.println(String.valueOf(m).toUpperCase());
                 m++;
        }

    }
    public static void multiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int k = scanner.nextInt();
        while (k<11){
            for (int i = 0; i < 11; i++) {
                System.out.print(k + " X " + i + "\t= " +k * i + "  ");
            }
          k++;
          System.out.println();
        }

    }
    public static void tamBolenler(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int k = scanner.nextInt();
        String tamBolen = "";
        int i = 1;
        while (i<(k+1)){
            if (k%i == 0){
                tamBolen += " " + i;
            }
            i++;
        }
        System.out.println( k + " nin tam bolenleri " + tamBolen);

    }



    }



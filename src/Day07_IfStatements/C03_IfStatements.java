package Day07_IfStatements;

import java.util.Locale;

public class C03_IfStatements {
    public static void main(String[] args) {
    //if statement ilk noktali virgule kadar calisir sonrakiler sartsiz olur
        int a = 10;
        int b = 20;
        int c = 30;

        String d = (a>b) ? "a is bigger than b" : "b is bigger ";
        System.out.println(d.toUpperCase(Locale.ROOT));

        if (a<b){
            System.out.println("a is smaller than b");
        }


    }
}

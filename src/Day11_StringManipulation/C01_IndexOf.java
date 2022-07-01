package Day11_StringManipulation;

import javax.print.DocFlavor;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str = "Learning java is great";

        int i = str.indexOf("g",(str.indexOf("g") +1));
        System.out.println(i);

        for (i = 0; i < str.length(); i++) {
           if (str.charAt(i) == 'g'){
               System.out.print("");;
           } else if(str.charAt(i) != 'g') {
               System.out.println(str.indexOf("g"));
           }
        }

    }
}

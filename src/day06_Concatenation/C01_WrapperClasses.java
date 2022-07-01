package day06_Concatenation;

import java.util.Locale;


public class C01_WrapperClasses {
    public static void main(String[] args) {

        String str = " Java is nice";
        String str1 = "is it nice";
        System.out.println(str+ " " + str1);
        System.out.println(str.concat(str1));

        System.out.println(str.toUpperCase(Locale.ROOT));

        Boolean isBeautiful = true;

        System.out.println( isBeautiful.toString());
        String password = "12345";
        Character [] chars = {'0','1','2','3','4','5','6'};
        Integer intPassword = Integer.valueOf(password);
        System.out.println(intPassword + 5);
        System.out.println(intPassword.intValue());

        StringBuilder strBld = new StringBuilder(("john"));
        strBld.append("Woo ").append("Leo").deleteCharAt(6);
        System.out.println(strBld);






    }
}

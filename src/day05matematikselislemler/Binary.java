package day05matematikselislemler;

public class Binary {
    public static void main(String[] args) {
        Integer num = 131;
        System.out.println(num.toBinaryString(num));

        String binaryString = "1001110";
        int decimal = Integer.parseInt(binaryString,2);
        System.out.println(decimal);

        System.out.println("\"Quotes\"");
        System.out.println("Slashes \\//");
        System.out.println("How '\"confounding' \"\\\" it is!");

        System.out.println("name\tage\theight");
        System.out.println("Archie\t17\t5'9\"");
        System.out.println("Betty\t17\t5'6\"");
        System.out.println("Jughead\t16\t6'");

        System.out.println("Shaq is 7'1");
        System.out.println("The string \"\" is an empty message.");
        System.out.println("\\'\"\"");


    }
}

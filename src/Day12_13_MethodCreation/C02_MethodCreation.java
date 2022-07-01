package Day12_13_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to addDigits");
        int num = scanner.nextInt();
        addDigits(num);


    }
    public static void addDigits (Integer value) {
        int sum = 0;
        String s = value.toString();
        String digitValue = "0";
        sum = Integer.parseInt(digitValue);
        for (int i = s.length()-1; i >= 0; i--){
            sum += s.charAt(i);
            System.out.println(sum);
        }


    }
}

package Day21_Arrays;

import java.util.Arrays;

public class C10_Split {
    public static void main(String[] args) {
        String str = "Learning java is great";
        String[] strArray = str.split("");// regex olmadan calismaz
        System.out.println(Arrays.toString(strArray));
        String strNew = Arrays.toString(strArray);
        System.out.println(strNew.replaceAll("[^A-Za-z]", ""));
        System.out.println(strNew.replaceAll(", ", ""));

    }
}

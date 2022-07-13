package Day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //System.out.println(createArray( ).length);

        String[] names = {"John", "Mark", "Bill", "Michael"};
        System.out.println(Arrays.toString(names));

        System.out.println(Integer.MAX_VALUE);
        //int [] array03 = new int [(Integer.MAX_VALUE) -1 ]; //Max value olusturmuyor
        //System.out.println(array03.length); length ten sonra parantes yok.

    }

    public static void createArray() {
        int[][] array02 = new int[10][10];
        for (int i = 0; i < array02.length; i++) {
            for (int j = 0; j < array02[0].length; j++) {
                array02[i][j] = (j + 1) * (i + 1);
            }
        }
        System.out.println(Arrays.toString(array02));
        for (int i = 0; i < array02.length; i++) {
            System.out.println(Arrays.toString(array02[i]));

        }


    }
}

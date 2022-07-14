package Day22_ArraysTasks;

import java.util.Arrays;

public class C04_ArrayTopla {
    public static void main(String[] args) {

        int[][] arrr = {{2, 3, 3, 8}, {54, 55, 88, 88}, {5656,2,3}, {565, 4656}, {1}};
        int [] newArr  = new int [arrr.length];
        int sum = 0;

        for (int i = 0; i < arrr.length; i++) {
            for (int j = 0; j < arrr[i].length; j++) {
                sum += arrr[i][j];
            }
            newArr[i]=sum;
            sum = 0;
            }
        System.out.println(Arrays.toString(newArr));
        }
}

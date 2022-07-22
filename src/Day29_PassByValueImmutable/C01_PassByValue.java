package Day29_PassByValueImmutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {


        int [] arr = {4,8,12,16};
        newArr(arr);
        System.out.println(String.valueOf(arr));

    }
    public static int[] newArr(int [] arr){
        Random rnd = new Random();
        int num5 = rnd.nextInt(100);
        System.out.println(num5);

        double num1 = Math.random()*100;
        double num2 = Math.random()*100;
        int num3 = (int)num1;
        int num4 = (int)num2;
        arr [1] = num3;
        arr [3] = num4;
        System.out.println(Arrays.toString(arr));
        System.out.println(String.valueOf(arr));
        return arr;
    }
}

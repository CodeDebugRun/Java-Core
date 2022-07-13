package Day21_Arrays;

import java.util.Arrays;

public class C06_ArraySort {
    public static void main(String[] args) {
        int[] numbers = {5,7,9,99,55,44,55,1122,564};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i]*-1;
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i]*-1;
        }
        System.out.println(Arrays.toString(numbers));

    }
}

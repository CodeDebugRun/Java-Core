package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListFindSeven {
    public static void main(String[] args) {

        List <Integer> arr = new ArrayList<>();

        System.out.println(arr.indexOf(7));

        int [] nums = new int[7];

        for (int i = 0; i < nums.length; i++) {
            nums [i] = i*2;
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            arr.add(i, nums[i]);
        }
        System.out.println(arr);
        String result = arr.contains(7) ? "Boom" : "Dizide 7 rakami yok";
        System.out.println(result);
    }
}

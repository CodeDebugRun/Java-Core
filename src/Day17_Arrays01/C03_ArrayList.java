package Day17_Arrays01;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Mark");
        names.add("John");
        names.add("Silverman");
        System.out.println(String.valueOf(names.size()));
        names.add("Johnny");
        System.out.println(names);

        String names1 [] = {"John", "Silverman", "John", "Silverman", "John"};
        System.out.println(Arrays.toString(names1));

        int [] numArray = {2,22,54,1,55,66,44,6666,444,2121};
        //Put the elements in ascending order
        int [] nums = Arrays.copyOf(numArray,5);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println(Arrays.toString(numArray));
        int minOfArray = numArray[0];
        int maxOfArray = numArray[numArray.length-1];
        System.out.println(minOfArray + " " + maxOfArray);

    }
}

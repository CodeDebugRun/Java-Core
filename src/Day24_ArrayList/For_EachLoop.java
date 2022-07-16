package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class For_EachLoop {
    public static void main(String[] args) {

        int [] arr = {5,9,798,4541,544,11515,1212};
        List <Integer> numbers = new ArrayList<>();

        for (int w: arr)
        { if(w % 2 == 0) numbers.add(w);}
        System.out.println(numbers);

        int [] arrr = {5,9,79,45,54,11,12};
        int sum = 0;
        for (int w : arr) {
            sum += w*w;
        }
        System.out.println(sum);
     }
}

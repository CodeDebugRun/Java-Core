package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ForEachString {

    public static void main(String[] args) {


        String[] arr = {"ali", "veli", "can", "hasan"};
        String[] arr1 = {"Vali", "veli", "cani", "hasankeyf"};

        List<String> commonNames = new ArrayList<>();

        for (String w : arr) {
            for (String k : arr1) {
                if (w.equalsIgnoreCase(k)) {
                    commonNames.add(w);
                }
            }
        }
        String result = !commonNames.isEmpty() ? "There are common names" : "There is no common name";
        System.out.println(result);

    }
}

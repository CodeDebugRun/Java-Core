package Day30_Dates;

import java.util.Arrays;

public class Dates {
    public static void main(String[] args) {

        String [] names = {"Ahmet", "Mehmet", "Omer"};
        System.out.println(String.valueOf(names));
        names [0] = "Cuneyt";
        System.out.println(Arrays.toString(names));
        System.out.println(String.valueOf(names));

    }
}

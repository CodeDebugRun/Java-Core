package Day17_Arrays01;

import java.util.Arrays;

public class C01_Arrays {
    //Arrays are containers to store data more than one
    //It is used for large data structures
    //Array can have same data type
    //Arrays can store just primitive data types of references of non-primitive types
    public static void main(String[] args) {
        //Create a new array

        int[] ages = new int[5];
        System.out.println(Arrays.toString(ages));
        ages[0] = 5;
        ages[1] = 2;
        ages[2] = 10;
        ages[3] = 8;
        //Print an array to the console
        System.out.println(Arrays.toString(ages));
        System.out.println((ages[0]));
        //Print the sum of ages
        System.out.println((ages[0]) + (ages[1]) + (ages[3]));
        //Print the sum with for loop
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        //Enhanced for loop
        for (int age : ages) {
            sum += age;
        }
        //Short way of creating a new array with values assigned

        String [] names = {"John", "Mark", "Charlie"};
        System.out.println(Arrays.toString(ages));
        System.out.println(names);
        //Find the total number of caharacter in an array
        int total = 0;
        for (int i = 0; i < names.length; i++) {
            total = total +  names[i].length();

        }

    }
}


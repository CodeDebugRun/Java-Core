package Day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class C03_CopyingAnArray {
    public static char noValue;
    public static void main(String[] args) {


        //Copying with copyForm method
        int [] numbers = {9,11,5,12,45,456};
        int [] numbers2 = new int[6];
        System.out.println(Arrays.toString(numbers2));
        System.arraycopy(numbers, 0 ,numbers2, 0, 6);
        System.out.println(Arrays.toString(numbers2));
        Arrays.fill(numbers, 11); // Fill the array with suggested value
        System.out.println(Arrays.toString(numbers));
        //Binary search
        System.out.println(Arrays.binarySearch(numbers, 11)); //11 ortada oldugu icin 11 i verdi
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.binarySearch(numbers2,11)); //Sort yapmadan once siralamadaki yeri
        Arrays.sort(numbers2);
        System.out.println(Arrays.binarySearch(numbers2,11));//Sort yapinca kendi yerini verdi



        //Copying with array copyOF
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        String [] newArray = java.util.Arrays.copyOfRange(copyFrom,0,13);//o inclusive 13 exclusive
        System.out.println(Arrays.toString(newArray));

        char [] chars = {'4','a','g','5','y'};
        char [] newChars = java.util.Arrays.copyOf(chars, 10);
        System.out.println(Arrays.toString(newChars));




    }

}

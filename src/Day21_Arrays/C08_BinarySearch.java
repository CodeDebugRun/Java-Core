package Day21_Arrays;
//Java da eleman armanin kisa yolu ,ncelikle arrayin sirali hale getirilmesi gerekir
//Siralama yapmadan binary search yanlis sonuc verir
//Binary search aranan elemanin indexini dondurur

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {

        String [] letters = {"v","f","g","h","d","s","a","d","f"};
        String letterSearched = "m";

        Arrays.sort(letters);

        int location = Arrays.binarySearch(letters,letterSearched);
        System.out.println(location);

        //System.out.println("Location of "+ letters[location] + " is at index " + location);

    }
}

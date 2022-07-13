package Day21_Arrays;

public class C01_MaxSayi {
    public static void main(String[] args) {
        int[] numbers = {3,5,9,8,5,1212,14545,211452};
        maxNumber(numbers);
    }
    public static void maxNumber (int [] numbers){
        int maxSayi = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i]>maxSayi){
                maxSayi = numbers[i];
            }
        }
        System.out.println(maxSayi);
    }
}

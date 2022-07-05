package Day17_Arrays01;

public class C02_ArraysForEach {
    public static void main(String[] args) {

        int [] arrray = {20, 30, 4, 5, 6, 7, 8, 250, 9, 10, 11, 12, 13, 14, 15};
        int min = 0;
        arrray [0] = min;

        for (int i = 0; i < arrray.length; i++){
            if (arrray[i]< arrray[i+1]){
                min = arrray[i+1];
            }
            System.out.println(min);

        }
        //Print 0 0
        //      1 1 to the console
        for (int i = 0, j = 0; i < 2; i++, j++) {
            System.out.println(i + " " + j);
        }



    }
}

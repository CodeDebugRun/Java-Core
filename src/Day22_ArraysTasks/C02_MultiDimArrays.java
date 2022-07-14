package Day22_ArraysTasks;

public class C02_MultiDimArrays {
    public static void main(String[] args) {


        int[][] arrr = {{2, 3, 3, 8}, {54, 55, 88, 88}, {5656,2,3}, {565, 4656}, {1}};
        int sum = 0;
        for (int i = 0; i < arrr.length ; i++) {
            for (int j = 0; j < arrr[i].length; j++) {
                if(i == j){
                    sum += arrr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
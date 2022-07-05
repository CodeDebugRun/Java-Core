package Day16_WhileLoop01;

public class C01_ForWhileLoop {
    public static void main(String[] args) {
        //Type code to print integers divisible by 4 an 6 from 13 to 211

        String str = "";

        for (int i = 13; i < 214; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                str += i + "-";

            }
        }
        System.out.println(str.substring(0, str.length() - 1));
        //While loop
        int i = 13;

        while (i < 214) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + "///");
            }
            i++;
        }
        System.out.println();
        i = 13;

        do {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " --- ");
            }  i++;

        } while (i < 214);
    }
}

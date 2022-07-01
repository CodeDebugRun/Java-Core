package Day10_StringManipulation;

public class C04_Length {

    public static void main(String[] args) {
        String str = "Learning java is great";

        System.out.println(str.length());

        for (int i = str.length(); i > 0; i-- ){
            System.out.print(str.charAt(i-1));

        }
    }
}

package Day30_Dates;

public class StringPool {
    public static void main(String[] args) {


        String str1 = "Ali Can";
        String str2 = str1 + "";
        String str3 = new String("Ali Can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str3));
        System.out.println(str1 == str3);

        System.out.println(str2.equals(str4));
        System.out.println(str2 == str4);


    }
}

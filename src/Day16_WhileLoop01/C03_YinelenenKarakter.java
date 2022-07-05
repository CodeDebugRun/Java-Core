package Day16_WhileLoop01;

public class C03_YinelenenKarakter {
    //String içerisinde yinelenen karakteri bul

    public static void main(String[] args) {

        String str = "merhabalar";
        String yinelenenKarakter = "";

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    yinelenenKarakter += (str.charAt(i) + " ");
                }
            }
        }
        System.out.println(yinelenenKarakter);


        String input="Ankara";
        for (int i = 1; i <=input.length() ; i++) {
            System.out.println(input.substring(0, i));
        }
        for (int j = input.length()-1; j > 0; j--) {
            System.out.println(input.substring(0,j));

        }
        System.out.println("");
    }}

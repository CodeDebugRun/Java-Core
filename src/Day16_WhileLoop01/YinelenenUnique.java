package Day16_WhileLoop01;

public class YinelenenUnique {
    public static void main(String[] args) {

        String str = "javaissoeasy";
        String yinelenenKarakter = "";

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    yinelenenKarakter += (str.charAt(i) + " ");
                }
            }
        }
        String yinelenenUnique = yinelenenKarakter.substring(0,1);
        for (int i = 0; i < yinelenenKarakter.length(); i++) {
            if (!yinelenenUnique.contains(String.valueOf(yinelenenKarakter.charAt(i)))){
                yinelenenUnique += String.valueOf(yinelenenKarakter.charAt(i));
            }
        }
        System.out.println(yinelenenUnique);

    }
}

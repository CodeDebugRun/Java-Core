package Day10_StringManipulation;

import java.util.Locale;

public class C02_toLowerCase {
    public static void main(String[] args) {

        String str = "Learningğ jaça is great";

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

    }
}

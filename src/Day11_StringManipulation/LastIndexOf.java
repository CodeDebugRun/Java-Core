package Day11_StringManipulation;

public class LastIndexOf {
    public static void main(String[] args) {
        String sentence = "Java is nice Java is beautiful";
        String word = "Java";

        int firstIndex = sentence.indexOf(word);
        int lastIndex = sentence.lastIndexOf(word);

        String result = firstIndex == -1 ? "Not used" : lastIndex == firstIndex ? "Used once" : "Used more than one";
        System.out.println(result);
    }
}

package Day21_Arrays;

public class C02_LongestWord {
    public static void main(String[] args) {
        String [] names = {"ali", "veli", "tacettin"};
        longestWord(names);
    }
    public static void longestWord  (String [] names){
        String  longest = names[0];
        String shortest = names[0];
         for (int i = 1; i < names.length ; i++) {
            if (names[i].length()>longest.length()){
                longest = names[i];
            }
             if (names[i].length()<shortest.length()){
                 shortest = names[i];
             }
        }
        System.out.println(longest);
        System.out.println(shortest);
    }
}

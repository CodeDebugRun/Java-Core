package Day16_WhileLoop01;

public class C01_UniqueCharacters {
    public static void main(String[] args) {

       String input = "Siradaki siraua eklensIIN";
       uniqueCharacters(input);

    }
    public static void uniqueCharacters(String input){
        String sum = "";
        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for(int i=0; i<=input.length()-1; i++){
            if(!sum.contains(input.substring(i,i+1))) {
                sum += input.charAt(i);
            }
            }
        System.out.println(input);
        System.out.println(sum);
    }
}

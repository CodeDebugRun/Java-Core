package Day28_StaticBlock;

public class StaticBlock {

    static int sayi;
    static{
        System.out.println("Static works first");//main method calismadan once class uyelerinden once
                                                //main dan once calisir
        }


    public static void main(String[] args) {
        System.out.println("Main works");
        System.out.println(sayi);

    }
    static {
        System.out.println("static under main method works before main"); //static olusturmak icin sadece static keyword
    }                                                  //Birden fazla static yukaridan asagi dogru calisir
}

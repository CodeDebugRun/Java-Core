package Day15_Overloading;

public class C05_BasicCalculator {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("******************************** ");
            for (int j = 0; j <= 10; j++) {
                System.out.println("TOPLAMA : \t"+i + "\t+\t" + j + "=\t" + (i+j));
                System.out.println("CIKARMA : \t"+i + "\t-\t" + j + "=\t" + (i-j));
                System.out.println("CARPMA  : \t"+i + "\tX\t" + j + "=\t" + (i*j));
                //System.out.println("BOLME : "+i + "/" + j + "=" + (i/(j+1)));
            }
        }
    }
}

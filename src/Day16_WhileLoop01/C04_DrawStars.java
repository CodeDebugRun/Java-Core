package Day16_WhileLoop01;

public class C04_DrawStars {
    public static void main(String[] args) {
        drawStars(5,4);

    }
    public static void drawStars(int x, int y){
        //x = 5;
        //y = 4;

        for (int i = x; i >0; i--){
            for (int j = y; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

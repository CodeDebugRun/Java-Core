package Day26_Constructor;

public class Rope {
    public static void swing(){
        System.out.println("swing");
    }
    public void climb(){
        System.out.println("climb");
    }
    public static void play(){
        swing();
        //climb(); Non static method static methoddan cagirilamaz
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        System.out.println(rope2);
        rope.play();

    }
}
//Kod climb yorum yapilirsa calisir ve ekrana swing swing yazar
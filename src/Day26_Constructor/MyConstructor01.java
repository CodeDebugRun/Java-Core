package Day26_Constructor;

public class MyConstructor01 {
    int x = 3;
    int y = 5;

    MyConstructor01(){
        x += 1;
        System.out.println("-x" + x);
    }
    MyConstructor01(int i){
        this();

        this.y = i;
        x += y;
        System.out.println("-x" + x);
    }
    MyConstructor01(int i, int i2){
        this(3);
        this.x -= 4;
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        MyConstructor01 mc1 = new MyConstructor01(4,3);
    }
}

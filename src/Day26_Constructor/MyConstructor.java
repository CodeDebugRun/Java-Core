package Day26_Constructor;

public class MyConstructor {
    int x = 5;

    MyConstructor(){
        System.out.println("-x" + x);
    }
    MyConstructor(int x){
        this();
        //this.x = x; this ile gelen x i objecte gondermezsek x 5 olarak devam edecek
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        MyConstructor mc1 = new MyConstructor(4);

        MyConstructor mc2 = new MyConstructor();

        System.out.println(mc1.x);
        System.out.println(mc2.x);
        System.out.println(mc1);
        System.out.println(mc2);

    }
}

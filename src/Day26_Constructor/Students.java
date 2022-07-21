package Day26_Constructor;

public class Students {
    String name;
    int age;
    String phone;

    Students(){
        //this.name = "Enter name";
        //this.age = 1;
        //this.phone = "Enter phone number";//Bu sekilde default degerler atanabilecegi gibi

        this("Enter name",1, "Enter phone number"); //Parametreli constructor cagirilarak default degerler atanabilir


    }
    Students(String name, int age, String phone){
        this.phone = phone;
        this.name = name;
        this.age = 22; //gonderilen degere bakmaksizin iceride bir deger atanmissa onu kullaniyor

    }
    Students(String name, String phone){
        /*this.phone = phone;
        this.name = name; */
        this(name, 1, phone); //bildigimiz degerlere atama yapip bilmediklerimizi varsayilanlari yaziyoruz
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students("John", 25,"029-998877");
        System.out.print(s2.name + ", " + s2.age + "  "+ s2.phone + "\n");
        System.out.println(s1.name + " " + s1.age + " " + s1.phone);
    }
}

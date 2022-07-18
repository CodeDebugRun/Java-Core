package Day25_Constructor;

public class C02_Constructor {
    public static void main(String[] args) {

        C01 newCar = new C01("Civic","Japan","Honda",
                     2005, 199000, false);

        C01 secondCar = new C01("Passat", "German","VolksWagen");
        secondCar.carStarts();

        C01 thirdCar = new C01();
        System.out.println(thirdCar.getBrand());



    }
}

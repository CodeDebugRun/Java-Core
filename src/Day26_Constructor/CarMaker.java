package Day26_Constructor;

public class CarMaker {

    private static String brand = "Marka";
    private String model = "CarModel";
    private int year = 1990;

    public CarMaker(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

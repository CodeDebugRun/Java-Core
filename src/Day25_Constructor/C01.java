package Day25_Constructor;

public class C01 {

    String model = "...model of Car";
    String made;
    private String brand = "...brand of Car";
    int year;
    int km;
    boolean hasAccident;

    public C01() {

    }

    public C01(String model, String made, String brand, int year, int km, boolean hasAccident) {
        this.model = model;
        this.made = made;
        this.brand = brand;
        this.year = year;
        this.km = km;
        this.hasAccident = hasAccident;
    }

    public C01(String model, String made, String brand) {
        this.model = model;
        this.made = made;
        this.brand = brand;
    }

    public void carStarts(){
        System.out.println("The car is running");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.length()>25){
            System.out.println("Long Brand name enter again");
        } else
            return;
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isHasAccident() {
        return hasAccident;
    }

    public void setHasAccident(boolean hasAccident) {
        this.hasAccident = hasAccident;
    }
}

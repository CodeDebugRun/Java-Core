package Assignment02_Methods;

public class A06_AddNumbers {
    public static void main(String[] args) {

                String[] copyFrom = {
                        "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                        "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                        "Marocchino", "Ristretto" };

                String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 3, 9);
                for (String coffee : copyTo) {
                    System.out.print(coffee + " ");
                }
            }
        }



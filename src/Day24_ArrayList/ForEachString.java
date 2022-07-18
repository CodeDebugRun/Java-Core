package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ForEachString {

    public static void main(String[] args) {


        String[] arr = {"ali", "veli", "can", "hasan"};
        String[] arr1 = {"Vali", "veli", "cani", "hasankeyf"};

        listCommonNames(arr, arr1);




    }

    private static void listCommonNames(String[] arr, String[] arr1  ) {
        List<String> commonNames = new ArrayList<>();

        for (String w : arr) {
            for (String k : arr1) {
                if (w.equalsIgnoreCase(k)) {
                    commonNames.add(w);
                }
            }
        }
        String result = !commonNames.isEmpty() ? "There are common names" : "There is no common name";
        System.out.println(result);
    }
    public static void listofMonths() {
        java.util.ArrayList<String> futureMonths = new ArrayList<String>();
        int month = 8;

        switch (month) {
            case 1:
                futureMonths.add("January");
                break;
            case 2:
                futureMonths.add("February");
                break;
            case 3:
                futureMonths.add("March");
                break;
            case 4:
                futureMonths.add("April");
                break;
                case 5:
                futureMonths.add("May");
                break;
            case 6:
                futureMonths.add("June");
                break;
            case 7:
                futureMonths.add("July");
                break;
            case 8:
                futureMonths.add("August");
                break;
            case 9:
                futureMonths.add("September");
                break;
            case 10:
                futureMonths.add("October");
                break;
            case 11:
                futureMonths.add("November");
                break;
            case 12:
                futureMonths.add("December");
                break;
            default:
                break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }

        }
    }
    public static void numberOfDaysInMonth(int month, int year){
       int numDays = 0;
        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                + numDays);
    }
    }



package PracticeElif;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        System.out.println(date.toString().replaceAll("[^0-9]", ""));
        //This is called time stamp

        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1);


    }
}

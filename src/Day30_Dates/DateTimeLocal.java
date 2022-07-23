package Day30_Dates;

import java.text.DateFormat;
import java.text.spi.DateFormatProvider;
import java.time.LocalDateTime;
import java.util.Locale;

import static java.text.DateFormat.getTimeInstance;

public class DateTimeLocal {
    public static void main(String[] args) {

        LocalDateTime whatTime = LocalDateTime.now();
        System.out.println(whatTime);



        DateFormatProvider provider = new DateFormatProvider() {
            @Override
            public DateFormat getTimeInstance(int style, Locale locale) {
                return null;
            }

            @Override
            public DateFormat getDateInstance(int style, Locale locale) {
                return null;
            }

            @Override
            public DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale locale) {
                return null;
            }

            @Override
            public Locale[] getAvailableLocales() {
                return new Locale[0];
            }
        };
    }
}

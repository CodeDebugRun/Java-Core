package Day24_ArrayList;

public class ContiniueStatement {
    public static void main(String[] args) {
        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;
        int numPss = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) == 'p')
            // process p's
            numPss++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
        System.out.println("Found " + numPss + " p's in the string.");

    }
        }

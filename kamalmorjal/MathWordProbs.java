import java.util.*;

public class MathWordProbs {
    private static int MAX_NAMES = 10;
    private static String[] names = 
        { "Ryan", "Mita", "Julie", "Ram", "Madhab", "Inder", "Visha", "Roshan", "Kamal", "QJ" };
    private static String[] fruits = { "banana", "apple", "orange", "avacado", "" }

    
    public static void main(String[] args) {
        // ...
        for(int i = 0; i < 10; i++) {
            System.out.println(getRandomNumInRange(5, 10));
        }
    }

    private static String pluralize(int count, String nama) {
        // return pluralized form of word based on input number
        if(count > 1) {
            return nama + "s";
        } else if(count == 1) {
            return nama;
        } else {
            return nama; // FIXME: manage the case of negative fruit numbers better
        }
    }

    private static String getRandomName() {
        return names[getRandomNum()];
    }

    private static int getRandomNum() {
        // if(min >= max) {
        //    throw new IllegalArgumentException("max must be larger than min");
        // }
        Random r = new Random();
        return r.nextInt(MAX_NAMES);
    }
}

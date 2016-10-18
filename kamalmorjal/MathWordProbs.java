import java.util.*;

public class MathWordProbs {
    private static int MAX_NAMES = 10;
    private static String[] names = 
        { "Ryan", "Mita", "Julie", "Ram", "Madhab",
        "Inder", "Visha", "Roshan", "Kamal", "QJ" };
    private static String[] fruits = 
        { "banana", "apple", "orange", "avacado",
        "lemon", "mango", "pineapple", "strawberry", 
        "jackfruit", "kiwi" };

    
    public static void main(String[] args) {
        // ...
        String name = getRandomElement(names);
        System.out.println(name);
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

    private static String getRandomElement(String [] e) {
        return e[getRandomNum()];
    }

    private static int getRandomNum() {
        Random r = new Random();
        return r.nextInt(MAX_NAMES);
    }
}

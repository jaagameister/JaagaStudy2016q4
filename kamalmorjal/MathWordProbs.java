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
        String q = "%s has %d %s and %s has %d %s. How many %s do they have together?\n\nYour answer: ";
        String name1 = getRandomElement(names);
        String name2 = getRandomElement(names);
        String fruit = getRandomElement(fruits);

        int count1 = getRandomNum();
        int count2 = getRandomNum();

        System.out.printf(q, name1, count1, pluralize(count1, fruit), name2, count2, pluralize(count2, fruit), pluralize(2, fruit));

        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();

        if(answer == (count1 + count2)) {
            System.out.println("BINGO!");
        } else {
            System.out.println("Sorry, that's incorrect.");
        }
    }

    private static String pluralize(int count, String nama) {
        // return pluralized form of word based on input number
        if(count > 1) {
            return nama + "s";
        } else if(count == 1) {
            return nama;
        } else {
            return nama; // this shouldn't happen, but if it does, ignore for now
        }
    }

    private static String getRandomElement(String [] e) {
        return e[getRandomNum()];
    }

    private static int getRandomNum() {
        Random r = new Random();
        return r.nextInt(MAX_NAMES-1) + 1; // add 1 to make sure there are no 0 fruits for now
    }
}

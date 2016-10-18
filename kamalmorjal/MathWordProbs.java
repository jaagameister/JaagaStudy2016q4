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
        String esc = "(Press Ctrl+C to exit)";
        String name1, name2, fruit;
        int count1, count2;

        while(true) {
            name1 = getRandomElement(names);
            name2 = getRandomElement(names);
            fruit = getRandomElement(fruits);

            count1 = getRandomNum() + 1;
            count2 = getRandomNum() + 1;

            System.out.printf(q, name1, count1, pluralize(count1, fruit), 
                        name2, count2, pluralize(count2, fruit), 
                        pluralize(2, fruit));

            Scanner in = new Scanner(System.in);
            int answer = in.nextInt();

            while(answer != (count1 + count2)) {
                System.out.println("Sorry, that's incorrect. Please try again.");
                System.out.println(esc);
                System.out.print("\nYour answer: ");
                answer = in.nextInt();
            }

            System.out.println("BINGO! Let's try one more... \n\n -------------------- \n\n");
        }
    }

    private static String pluralize(int count, String nama) {
        // return pluralized form of word based on input number
        if(count > 1 || count == 0) {
            return nama + "s";
        } else if(count == 1) {
            return nama;
        } else {
            return nama; // this shouldn't happen, but if it does, ignore for now
        }
    }

    private static String getRandomElement(String [] e) {
        return e[(getRandomNum())];
    }

    private static int getRandomNum() {
        Random r = new Random();
        return r.nextInt(MAX_NAMES);
    }
}

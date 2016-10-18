/**
 *
 * @author Rahul Kumar
 */
 
import java.util.HashMap;

public class ProbSet {
    HashMap<String, Integer> addProbSet = new HashMap<>();
    HashMap<String, Integer> subProbSet = new HashMap<>();
    int i, j;
    ProbSet(int lo, int up){
    
        i = ProbSet.ranGen(lo, up);
        j = ProbSet.ranGen(lo, up);
        addProbSet.put("Jason has "+i+" big balls and Gautham has "+j+" small balls. How many balls\n" +
                            " do they have in total?", i+j);
        
        i = ProbSet.ranGen(lo, up);
        j = ProbSet.ranGen(lo, up);
        addProbSet.put("There are "+i+" girls and "+j+" boys in the bus. How many kids are there\n" +
                            " altogether? ", i+j);
        
        i = ProbSet.ranGen(lo, up);
        j = ProbSet.ranGen(lo, up);
        addProbSet.put("There are "+i+" kids playing in the park. "+j+" more kids join them. How\n" +
                            " many  kids are in the park now?", i+j);
        
        i = ProbSet.ranGen(lo, up);
        j = ProbSet.ranGen(lo, up);
        addProbSet.put("There are "+i+" cookies in a jar. "+j+" more are added. How many cookies are\n" +
                            " there? ", i+j);
        
        i = ProbSet.ranGen(lo, up);
        j = ProbSet.ranGen(lo, up);
        if(i<j){
            int temp = j;
            j = i;
            i = temp;
        }
        subProbSet.put(i+" marbles are in the basket. "+j+" marbles are taken out of the\n" + 
                            "basket. How many marbles are in the basket now", i-j);
        
        i = ProbSet.ranGen(lo, up);
        j = ProbSet.ranGen(lo, up);
        if(i<j){
            int temp = j;
            j = i;
            i = temp;
        }
        subProbSet.put(i+" oranges are in the basket. "+j+" are red and the rest are green.\n" + 
                            " How many oranges are green?", i-j);
        
        i = ProbSet.ranGen(lo, up);
        j = ProbSet.ranGen(lo, up);
        if(i<j){
            int temp = j;
            j = i;
            i = temp;
        }
        subProbSet.put(i+" plums are in the basket. "+j+" plums are taken out of the\n" +
                            "basket. How many plums are in the basket now?", i-j);
        
        i = ProbSet.ranGen(lo, up);
        j = ProbSet.ranGen(lo, up);
        if(i<j){
            int temp = j;
            j = i;
            i = temp;
        }
        subProbSet.put("Brian has "+j+" fewer peaches than Paul. Paul has "+i+" peaches.\n" +
                            "How many peaches does Brian have?", i-j);
    }
    
    public static int ranGen(int lower, int upper){
        int range = (upper - lower) + 1;     
        return (int)(Math.random() * range) + lower;
    }
}

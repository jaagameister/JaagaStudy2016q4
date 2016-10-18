/**
 *
 * @author Rahul Kumar
 */

import java.util.Iterator;
import java.util.Scanner;

public class MathProb {
    
    static ProbSet probset;
    static Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hi there...do you want to play some maths game? (Yes/No)?");
        sc = new Scanner(System.in);
        String res =sc.nextLine();
        if(res.equalsIgnoreCase("Yes") || res.equalsIgnoreCase("Y")){
            System.out.println("Okay then...Let's Play");
            int count=0;
            while(true){
                play(count);
                count++;
            }
        }
        else if(res.equalsIgnoreCase("NO") || res.equalsIgnoreCase("N")){
            System.out.println("It's okay...Bye");
        }
    }
    public static void play(int count){
        String problem;
        int ans;
        probset = new ProbSet(count*10, (count*20)+10);
        Iterator addIterator = probset.addProbSet.keySet().iterator();
        while(addIterator.hasNext()) {
            problem=(String)addIterator.next();
            ans = probset.addProbSet.get(problem);
            System.out.println(problem);
            int response;
            do{
                response = sc.nextInt();
                if(response == ans){
                    System.out.println("Hurray...You got it right.");
                }
                else {
                    System.out.println("Oops...try again");
                }
            }while(response!=ans);
        }
    }
}

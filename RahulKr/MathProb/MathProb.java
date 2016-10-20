/**
 *
 * @author Rahul Kumar
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MathProb {
    
    static ProbSet probset;
    static Scanner sc;
    static String[] successMsg = {"Hurray...You got it right.", "Good job!", "Bingo!", "Awesome...Now try this.", "Cool.."};
    static String[] failureMsg = {"Oops..try again..", "Nope..try harder.", "Nice try, but not quite.\ntry again", "Uh-oh, That's not the right answer."};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hi there...do you want to play some maths game? (Yes/No)?");
        sc = new Scanner(System.in);
        String response =sc.nextLine();
        if(response.charAt(0)=='Y'||response.charAt(0)=='y'){
            System.out.println("Okay then...Let's Play");
            int count=0;
            while(true){
                playAdd(count);
                count++;
            }
        }
        else if(response.charAt(0)=='N'||response.charAt(0)=='n'){
            System.out.println("It's okay...You can come again later.");
        }
    }
    public static void playAdd(int count){
        String problem;
        int ans;
        probset = new ProbSet(count*10, (count*20)+10);
        Iterator addIterator = probset.addProbSet.keySet().iterator();
        while(addIterator.hasNext()) {
            problem=(String)addIterator.next();
            ans = probset.addProbSet.get(problem);
            //String value=(String)meMap.get(key);
            System.out.println(problem);
            int response=0;
            do{
                response = sc.nextInt();
                if(response == ans){
                    System.out.println(successMsg[ProbSet.ranGen(0, successMsg.length-1)]);
                }
                else {
                    System.out.println(failureMsg[ProbSet.ranGen(0, failureMsg.length-1)]);
                }
            }while(response!=ans);
        }
        if(count>=0){
            count = 0;
            while(true){
                playSub(count);
                count++;
            }
        }
    }
    public static void playSub(int count){
        String problem;
        int ans;
        probset = new ProbSet(0, (count*5)+10);
        Iterator subIterator = probset.subProbSet.keySet().iterator();
        while(subIterator.hasNext()) {
            problem=(String)subIterator.next();
            ans = probset.subProbSet.get(problem);
            //String value=(String)meMap.get(key);
            System.out.println(problem);
            int response=0;
            do{
                response = sc.nextInt();
                if(response == ans){
                    System.out.println(successMsg[ProbSet.ranGen(0, successMsg.length-1)]);
                }
                else {
                    System.out.println(failureMsg[ProbSet.ranGen(0, failureMsg.length-1)]);
                }
            }while(response!=ans);
        }
    }
    
}

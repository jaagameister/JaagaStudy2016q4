import java.io.*;
import java.util.*;
import java.math.*;

public class Mathw {

    public static void main(String[] args){
        
        String[] fruits = {"apples","oranges","bananas","grapes","guavas","mangos","papayas","apricots","watermelons","pears"};
        String[] names = {"Rahul","Pushp","Abhijit","Poornima","Kamal","Prashant","Dharmesh","Kirti","Sumak","Qj"};
        String[] posresp = {"You are on fire","bullseye","Awesome","So far so good","Thats correct","Yeah Right"};
        String[] negresp ={"Try again","You are close, try again ","I'm sorry this is not the answer I'm looking for"};
        Random rg = new Random();
        boolean flag = true;
        
        while(true){
        
            int fruitsrand1 = new Random().nextInt(fruits.length);
            int fruitsrand2 = new Random().nextInt(fruits.length);
            int namesrand1 = new Random().nextInt(names.length);
            int namesrand2 = new Random().nextInt(names.length);
            int posresprand = new Random().nextInt(posresp.length);
            int negresprand = new Random().nextInt(negresp.length);
            Scanner sc = new Scanner(System.in);
            
            int a = rg.nextInt(51);
            int b = rg.nextInt(51);
            int c = a + b;      
            
            System.out.printf( "%s"+" "+ "has"+" " + "%d"+" "+ "%s"+" " +"and"+" "+ "%s" +" "+ "has"+" " + "%d" + " "+ "%s" +" "+ "how many fruits do they have together?\n",names[namesrand1],a,fruits[fruitsrand1],names[namesrand2],b,fruits[fruitsrand2]);
            
            int d = sc.nextInt();
            
            if (d==c){
                flag = true;
                System.out.printf("%s\n",posresp[posresprand]);
            } else {
                flag = false;
                System.out.printf("%s\n",negresp[negresprand]);

                while(flag==false) {
                    System.out.printf( "%s"+" "+ "has"+" " + "%d"+" "+ "%s"+" " +"and"+" "+ "%s" +" "+ "has"+" " + "%d" + " "+ "%s" +" "+ "how many fruits do they have together?\n",names[namesrand1],a,fruits[fruitsrand1],names[namesrand2],b,fruits[fruitsrand2]);
                    d = sc.nextInt();
                
                    if (d==c) {
                        flag = true;
                        System.out.printf("%s\n",posresp[posresprand]);

                    }
                }
            }
        }
    }
}

import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        //Write your code here
        Arrays.sort(s,0,n, Collections.reverseOrder(new Comparator<String>(){
        public int compare(String s1, String s2){
            BigDecimal a1 = new BigDecimal(s1);
            BigDecimal a2 =  new BigDecimal(s2);
            return a1.compareTo(a2);
        }
    }));
   }
}

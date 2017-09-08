import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        int max_a = 0;
        int min_b = Integer.MAX_VALUE;
        int count = 0;
        for(int i : a){
            if(i>max_a){
                max_a = i;
            }
        }
        for(int j : b){
            if(j < min_b){
                min_b = j;
            }
        }
        for(int k = max_a; k <= min_b; k=k+max_a){
           boolean increment = true;
           outerloop:
           for(int i : a){
                for(int j : b){
                    if(k%i!=0 || j%k!=0 ){
                        increment = false;
                        break outerloop;
                    }
                }
            }
            if(increment)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}

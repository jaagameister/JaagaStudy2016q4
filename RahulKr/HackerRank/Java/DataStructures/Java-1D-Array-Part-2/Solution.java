import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            if(check(0, m, arr)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    
    public static boolean check(int i, int m, int[] arr) {
        if (i < 0 || arr[i] == 1) return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

        arr[i] = 1;
        return check(i+1, m, arr) || check(i-1, m, arr) || check(i+m, m, arr);
    }
}

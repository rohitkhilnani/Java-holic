package hacker_rank;

import java.io.*;
import java.util.*;

/*
    Solution: Sherlock and the array
*/

public class SherlockAndArray {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        // Fro each test case
        for(int t = 0; t<T; t++){
            
            int N = in.nextInt();    // Number of elements
            
            int  A[] = new int[N];   // Array
            
            // Read array
            for(int i=0;i<N;i++)
                A[i] = in.nextInt();
                       
            
            int sumL = 0, sumR = 0;    // Sum of left and right sides
            
            // for index 0, sumR would be sum of indices 1 to N-1
            for(int i=1;i<N;i++)
                sumR+=A[i];
            
            // For index 0 through N-1
            int i=0;
            for(i=0;i<N;i++){
                
                // Break if sumL equals sumR
                if(sumL == sumR)
                    break;
                
                // Otherwise, add current index (i) value  to sumL and subtract (i+1) index value from R
                sumL+=A[i];
                
                if(i+1<A.length)    // Avoid index out of bound exception for boundary case
                   sumR-=A[i+1];
                
            }
            
            // If loop breaks due because of sumL = sumR condition, then i must be less than N.
            if(i<N)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
        
    }
}
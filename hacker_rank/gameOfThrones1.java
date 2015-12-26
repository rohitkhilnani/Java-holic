package hacker_rank;

import java.io.*;
import java.util.*;

class gameOfThrones1 {

    public static void main(String[] args) {
                
        Scanner in = new Scanner(System.in);
        
        // Read a string 
        String str = in.next();
        
        // Define hashset to hold characters of string
        HashSet<Character> chars = new HashSet<Character>(str.length());
        
        // For each character in string        
        for(int i=0;i<str.length();i++){
        
            // if this character is present in chars, remove it    
            if(chars.contains(str.charAt(i)))
                chars.remove(str.charAt(i));
            
            else   // Otherwise, add it to chars
                chars.add(str.charAt(i));
        }
        
        // If any anagram of str can be a palindrome, the size of chars cannot be more than 1
        if (chars.size()>1)
            System.out.println("NO");
        else
            System.out.println("YES");
        
    }
}
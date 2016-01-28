package hacker_rank;
import java.io.*;
import java.util.*;


public class Pangram {

    // Checks whether givent string is a pangram or not
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    // Returns true if sentence is a pangram

    public static boolean isPangram(String sentence){
     // Define hash set to hold characters of sentence
        HashSet<Character> chars = new HashSet<>(26);
        
        // for each character in sentence
        for(int i =0; i<sentence.length();i++){
            
            // if character is alphabetic, add it to 'chars' in lowercase
            if(Character.isAlphabetic(sentence.charAt(i)))
            chars.add( Character.toLowerCase(sentence.charAt(i)));            
        }
    
        // if sentence was a pangram, the size of 'chars' must be 26
        if (chars.size() == 26)
            return true;
        else
            return false;           
        
}
    
    public static void main(String[] args) {
        
        // Create scanner
        Scanner in = new Scanner(System.in);
        
        // Read sentence
        String sentence = in.nextLine();
        
       // Check if it is a pangram        
        if (isPangram(sentence))
            System.out.println("pangram");
        else
            System.out.println("not pangram");
            
      
        
    }
}
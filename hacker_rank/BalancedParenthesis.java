package hacker_rank;

import java.io.*;
import java.util.*;

class BalancedParenthesis {

    public static void main(String[] args) {
        
        // Define scanner
        Scanner in = new Scanner(System.in);            
        
        // No of test cases    
        int T = in.nextInt();
        
        // for each test case
        for(int t = 0; t<T; t++){
            
            // input string
            String s = in.next();
            
            // define stack
            LinkedList<Character> stk = new LinkedList<Character>();    
            
            // assume balanced
            boolean balanced = true;
            
            // for each character
            for(int i=0;i<s.length();i++){
                
                char c = s.charAt(i);
                
                
                switch(c){
                                // Add on stack if opening bracket
                    case '(':
                    case '[':
                    case '{': 
                                stk.addFirst(c);
                                break;
                    
                                // If closing bracket, check if matching opening bracket is on top of stack.
                                // If not, expression is not balanced.
                                // If yes, remove matching opening bracket from stack
                    case ')':   if(stk.peekFirst()==null || stk.peekFirst()!='(')
                                    balanced = false;
                                else
                                    stk.removeFirst();
                                 break;
                    
                    
                    case '}':   if(stk.peekFirst()==null || stk.peekFirst()!='{')
                                    balanced = false;
                                else
                                    stk.removeFirst();
                                break;
                    
                    case ']':
                                if(stk.peekFirst()==null ||stk.peekFirst()!='[')
                                    balanced = false;
                                else
                                    stk.removeFirst();
                                break;
                                                
                    
                    
                    
                }
                
                // If balanced flag was reset, stop checking other characters of this string
                if(!balanced){
                    break;
                }
                    
                
                
            }
            
            // If stack is empty and balanced flag is still set, expression is balanced 
            if(stk.size() == 0 && balanced)
                System.out.println("YES");
            else   // otherwise not balanced
                System.out.println("NO");
            
            
        }
    }
}
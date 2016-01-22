package cracking_the_coding_interview.arrays_and_strings;

import java.util.HashSet;

/*
	This class implements a method to check if all characters contained in a string are unique.
*/

class UniqueChars{


	// Checks if all characters contained in string s are unique
	// Time Complexity: O(N)		N - No. of characters in string s	
	// Space Complexity: O(N)	

	public static boolean check(String s){


		// throw exception if string is empty
		if(s == null){
			throw new NullPointerException("String is empty");
		}

		// Create hashset to hold all characters
		HashSet<Character> chars = new HashSet<Character>(s.length());

		// For each character in s
		for(int i=0;i<s.length();i++){

			// If it is already present in chars, return false
			if(chars.contains(s.charAt(i))){
				return false;
			}	
			else { // otherwise, add this character to chars
				chars.add(s.charAt(i));
			}

		}	

		// if no character was found twice, return true
		return true;
	}


}

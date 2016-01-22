package cracking_the_coding_interview.arrays_and_strings;
import cracking_the_coding_interview.arrays_and_strings.UniqueChars;

/*
	This class tests class UniqueChars
*/

class TestUniqueChars{

	// test method to check if all characters contained in string s are unique

	public static void testString(String s){
		
		if(UniqueChars.check(s))
			System.out.println(s+": has all unique characters");
		else
			System.out.println(s+": does not have all unique characters");
	}


	// Calls testString on several strings

	public static void test(){

		// Define test strings
		String[] strings = {"java","programming","rohit","a","81#&=+-/\\","khilnani","abcdefghijklmno_q","qq","",null,"hey u !"};

		// test each string
		
			for(String s: strings){
				try{
					testString(s);
				}	
				catch(NullPointerException e){
					System.out.println(e);
				}
			}
		


	}


	public static void main(String args[]){

		// test strings
		test();


	}


}
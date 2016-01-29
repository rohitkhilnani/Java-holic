package design_patterns.strategy_design_pattern;
import design_patterns.strategy_design_pattern.PrintNormal; 		// Strategy 1
import design_patterns.strategy_design_pattern.PrintReverse; 	 	// Strategy 2
import design_patterns.strategy_design_pattern.Numbers;

/*
	This class tests class Numbers - To use different print strategies using the Strategy Design Pattern
*/


class TestNumbers{

	// Tests printing

	public static void testPrint(){

		// Define an array
		int[] A = {1,5,10,15,20,25,30,35,40,45,50};

		// Create a numbers object
		Numbers n = new Numbers(A);

		// print using default strategy i.e. PrintNormal
		n.print();

		// Change strategy to PrintReverse
		n.setPrintType(new PrintReverse());

		// print again
		n.print();

		// Change strategy back to PrintNormal
		n.setPrintType(new PrintNormal());

		// print again
		n.print();

	}



	public static void main(String[] args){

		// Test Printing

		testPrint();


	}



}	

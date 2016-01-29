/*
	Class Numbers - holds an array of numbers
*/

package design_patterns.strategy_design_pattern;
import design_patterns.strategy_design_pattern.PrintType;
import design_patterns.strategy_design_pattern.PrintNormal; 		// Strategy 1
import design_patterns.strategy_design_pattern.PrintReverse; 	 	// Strategy 2

class Numbers{

	int[] num;				// Array of numbers
	PrintType printType;	// Reference of type PrintType


	// initializes the array with input array
	// sets print type to PrintNormal

	public Numbers(int[] A){

		num = A;
		printType = new PrintNormal(); 	

	}


	// Prints Array based on selected strategy

	public void print(){
		printType.printArray(num);
	}


	// Sets print type as specified

	public void setPrintType(PrintType p){
		printType = p;
	}

}	

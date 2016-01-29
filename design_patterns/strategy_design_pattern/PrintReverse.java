/*
	Class PrintReverse - Implements PrintType and defines a print strategy
*/

package design_patterns.strategy_design_pattern;
import design_patterns.strategy_design_pattern.PrintType;

class PrintReverse implements PrintType{

	// Prints array elements in descending order of index

	public void printArray(int[] A){

		for(int i=A.length-1;i>=0;i--){

			System.out.print(A[i]+" ");
		}

		System.out.println();	

	}

}	
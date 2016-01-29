/*
	Class PrintNormal - Implements PrintType and defines a print strategy
*/

package design_patterns.strategy_design_pattern;
import design_patterns.strategy_design_pattern.PrintType;

class PrintNormal implements PrintType{

	// Prints array elements in ascending order of index

	public void printArray(int[] A){

		for(int i=0;i<A.length;i++){

			System.out.print(A[i]+" ");
		}

		System.out.println();	

	}

}	
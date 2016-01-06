package arrays.maximum_sub_array;
import arrays.maximum_sub_array.SubArray;	// My implementation of class SubArray to hold result sub array

/*
This class implements Kadane's algorithm to find the maximum sum sub array in a given array.
*/

class MaximumSubArray{

	// Finds maximum sum sub array and returns SubArray object
	// Returns null if array A is null or of length 0

	public static SubArray find(int[] A){

		// Return null if array is null or empty
		if(A == null || A.length < 1)
			return null;	

		SubArray endHere = new SubArray(); 		// Holds maximum sum sub array ending at current index while traversing input array
		SubArray soFar = new SubArray();		// Holds maximum sum sub array encountered so far.

		// Set ending here and so far sub arrays to be the first element of the input array
		endHere.setStart(0);
		endHere.setEnd(0);
		endHere.setSum(A[0]);

		soFar.setStart(0);
		soFar.setEnd(0);
		soFar.setSum(A[0]);


		// for each element from index 1 to A.length -1
		for(int i=1;i<A.length;i++){

			// If sum ending at previous index (i-1) was positive
			if(endHere.getSum() > 0){

				// set sum ending at current index (i) as previous sum + value at current index
				endHere.setSum(endHere.getSum() + A[i]);

				// Update end index to i 
				endHere.setEnd(i);
			}
			else{
	
				// Otherwise, set sum ending at current index as value at current index
				endHere.setSum(A[i]);
				
				// Set start and end index as i
				endHere.setEnd(i);
				endHere.setStart(i);

			}

			// If sum ending at current index is greater than sum encountered until previous index (sofar), 
			// set sum encountered so far to the current sum, and update start and end indices	
			
			if(endHere.getSum() > soFar.getSum()){

				soFar.setSum(endHere.getSum());
				soFar.setEnd(endHere.getEnd());
				soFar.setStart(endHere.getStart());
			}

			
		}

		// Return maximum sub array encoutered 
		return soFar;

	}


}
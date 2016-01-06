package arrays.maximum_sub_array;

/*
	This class encapsulates the result of maximum sub array computation.
	Array Starting index, ending index and sum of elements between those indices
*/

class SubArray{

	private int start = -1; 			// start index of sub array
	private int end = -1; 				// end index of sub array
	private long sum = Long.MIN_VALUE; 	// Sum of sub array 


	// Sets start

	public void setStart(int start){
		this.start = start;
	}

	// Sets end

	public void setEnd(int end){
		this.end = end;
	}


	// Sets sum

	public void setSum(long sum){
		this.sum = sum;
	}


	// Returns start

	public int getStart(){
		return start;
	}


	// Returns end

	public int getEnd(){
		return end;
	}


	// Returns Sum

	public long getSum(){
		return sum;
	}


	// Returns string representation of sub array
	public String toString(){
		return "Sum: "+sum +", Start: "+start +", End: "+end;
	}

}	


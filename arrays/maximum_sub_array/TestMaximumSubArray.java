package arrays.maximum_sub_array;
import arrays.maximum_sub_array.SubArray; 			// My implementation of class SubArray to hold result sub array
import arrays.maximum_sub_array.MaximumSubArray;	// My implementation of Kadane's algorithm to find maximum sub array

/*
	This class tests Kadane's Maximum sub array algorithm
*/

class TestMaximumSubArray{

	// Tests with valid as well as invalid input

	public static void testA(){

		// Define test arrays

		int a1[] = {-2,-3,4,-1,-2,1,5,-3};
		int a2[] = {-5,-4,-7,-6,-3,-2,-1,-9};
		int a3[] = {};
		int a4[] = {10,-15,5,-2,4,19,-30,20,4};
		int a5[] = {1,-1,1,-2,1,1,2,1,4,-4,5};
		int a6[] = null;
		int a7[] = {2,-1,-1,5,-4,9};

		// Find maximum sum sub arrays

		SubArray s1 = MaximumSubArray.find(a1);
		SubArray s2 = MaximumSubArray.find(a2);
		SubArray s3 = MaximumSubArray.find(a3);
		SubArray s4 = MaximumSubArray.find(a4);
		SubArray s5 = MaximumSubArray.find(a5);
		SubArray s6 = MaximumSubArray.find(a6);
		SubArray s7 = MaximumSubArray.find(a7);
		// Display results

		System.out.println(s1);
		System.out.println(s2);
		
		if(s3 == null)
			System.out.println("s3 null");

		System.out.println(s4);
		System.out.println(s5);

		if(s6 == null)
			System.out.println("s6 null");

		System.out.println(s7);

	}


	public static void main(String args[]){

		// Call testA
		testA();
	}

}	
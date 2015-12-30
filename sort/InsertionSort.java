package sort;

/*
	This class implements insertion sort on integer Array.
*/

class InsertionSort{

	// Sorts an array of integer specified as parameter in ascending order.
	// Sorts in place
	// Sort is stable
	// Time Complexity: 
	//					Best Case			: O(n)
	//					Average/ Worst Case : O(n*n)	
	

	public static void sort(int[] A){

	// Dont do anything if A is null	
	if(A == null)
	return;	

	// for elements 1 through n-1
	for(int i=1; i<A.length; i++){

		// Set key = ith element
		int key = A[i];

		// Set j = i-1
		int j = i-1;

		// Shift elements on left of j-1 (including j-1) to right if they are greater than key
		while(j>=0 && A[j] > key){

			A[j+1] = A[j];
			j--;
		}

		// Insert key in appropriate position in shifted array.	
		A[j+1] = key;	

	}



	}

}

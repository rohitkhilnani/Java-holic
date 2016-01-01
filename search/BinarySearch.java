package search;

/*
	This class implements Binary Search on array of integers.
*/

class BinarySearch{

	// Finds specified key in specified array. 
	// Returns index of key in A if search is successful, otherwise returns -1
	// Time complexity: O( log(N) ) 		N - Size of array
	// Input array must be sorted in ascending order.

	public static int find(int[] A, int key){

		if(A == null)
			throw new NullPointerException("Array is empty");

		int beg = 0; 				// Beginning of search space
		int end = A.length - 1;		// End of search space
		int mid = (beg + end)/2;	// Middle element in search space
		boolean successful = false;	// Indicates whether search was successful or not.

		// while beg is less or equal to end (Search space is valid)
		while(beg <= end){

			// If key is equal to middle element, break the loop and set successful flag
			if(key == A[mid]){
				successful = true;
				break;
			}
			// If key lies in lower half, update end
			else if(key < A[mid]){
				end = mid - 1;
			}
			// Otherwise, update beg
			else{
				beg = mid + 1 ;
			}	

			// Update mid
			mid = (beg + end)/2;

		}

		// If found, return index at which key was found
		if(successful)
			return mid;
		// else return -1 to indicate faliure
		else
			return -1;		

	}

}	
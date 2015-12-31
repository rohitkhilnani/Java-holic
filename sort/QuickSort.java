package sort;

/*
	This class implements quick sort on array of integers.
*/

class QuickSort{




	// Partitions array A between index p..r (inclusive) such that all elements 
	// smaller or equal to last element (index r) are on left and all elements
	// greater than it are on right with index r element in middle, called pivot.
	// Pivot element's index is returned.

	protected static int partition(int[] A, int p, int r){

		int pivot = A[r];			// Pivot

		int i = p-1; 			// All elements upto index i would be less than pivot			

		// For each element before pivot
		for(int j=p;j<r;j++){

			// If element is less or equal (should appear on left)
			if(A[j]<=pivot){
				i++;

				// swap elements at index i and j
				int t = A[i];
				A[i] = A[j];
				A[j] = t;
			}

		}

		// Put pivot in its place (swap index i+1 and r)
		int t = A[i+1];
		A[i+1] = A[r];
		A[r] = t;

		// Return pivot index
		return i+1;

	}



	// Sorts array of integers A from index p to index r (inclusive)
	// Time Complexity: 
	//					Average Case: O( N.log(N) ) 	
	// 					Worst Case: O( n*n )

	protected static void quicksort(int[] A, int p, int r){

		// If there are more than one elements in the range p..r
		if (p < r){

			// Partition the range p..r
			int q = partition(A, p, r);

			// Recursively sort two partitions
			quicksort(A, p, q-1);
			quicksort(A, q+1, r);

		}

	}


	// Calls quicksort

	public static void sort(int A[]){

		// If A is null or there are less than 2 elements in A, return
		if (A == null || A.length <2 )
			return;

		// Otherwise, call quicksort
		quicksort(A, 0, A.length-1);


	}



}	
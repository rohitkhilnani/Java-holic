package sort;

import sort.InsertionSort;		// My implementation of insertion sort algorithm in package sort

/*
	This class tests:
						 Insertion Sort
*/

class TestSort{

	// Tests insertion sort

	public static void testInsertionSort(){

		int arr1[] = null;
		int arr2[] = {1};
		int arr3[] = {4,3,1,2,5,6,9,8,7};
		int arr4[] = {9,3,1,2,5,8,0,4,6,7};
		int arr5[] = {1,2,3,4,5,6,7,8,9,10};
		int arr6[] = {10,9,8,7,6,5,4,3,2,1};
		int arr7[] = {1,5,4,2,36,6,5,9,7,9,7,9,8,1,0,49,94,947,1,5,9,33,8,2,28,46,9,22,99,13,53,9,690};
	

		// arr1
		InsertionSort.sort(arr1); 		// Should not throw any exception

		// arr2
		InsertionSort.sort(arr2);
		print(arr2); 					// Should print 1

		// arr3
		InsertionSort.sort(arr3);
		print(arr3); 					// Should print numbers in sorted order

		// arr4
		InsertionSort.sort(arr4);
		print(arr4); 					// Should print numbers in sorted order

		// arr5
		InsertionSort.sort(arr5);
		print(arr5); 					// Should print numbers in sorted order

		// arr6
		InsertionSort.sort(arr6);
		print(arr6); 					// Should print numbers in sorted order

		// arr7
		InsertionSort.sort(arr7);
		print(arr7); 					// Should print numbers in sorted order


	}


	// Displays the array specified as parameter

	public static void print(int A[]){
		for(int i=0; i<A.length; i++ )
			System.out.print(A[i] + " ");

		System.out.println();

	}

	public static void main(String args[]){

		// Call testInsertionSort
		testInsertionSort();

	}

}						 
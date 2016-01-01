package search;

import search.BinarySearch; 		// My implementation of binary search in package search
/*
	This class tests class BinarySearch
*/

class TestSearch{

	// Tests binary search

	public static void testBinarySearch(){

		// Define array reference
		int[] A = null; 
	
		// Should throw NullPointerException
		try{
			BinarySearch.find(A, 50);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}

		// Allocate 100 integers
		A = new int[100];

		// Assiging values
		for(int i=0;i<100;i++)
			A[i] = 2*i;

		// Search for values using binary search
		for(int i=0;i<100;i++){

			// Search for key 2*i
			int index = BinarySearch.find(A, 2*i);

			System.out.println(2*i + " found at: "+index);

		}

		// Search for keys that are not present in array
		System.out.println(250 + " found at: "+BinarySearch.find(A, 250));
		System.out.println((-5) + " found at: "+BinarySearch.find(A, -5));
		System.out.println(53 + " found at: "+BinarySearch.find(A, -53));

	}

	public static void main(String args[]){

		// Call testBinarySearch
		testBinarySearch();

	}

}	

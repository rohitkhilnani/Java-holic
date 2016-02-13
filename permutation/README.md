# Permutation

This class contains methods related to permutation of a sequence represented using an ArrayList.

Methods/ Operations implemented :

	// Returns ArrayList containing kth permutation of the symbols in ArrayList v
	// symbols in v must be sorted in ascending order
	// Time Complexity: O(N*N) where N is the number of symbols in v

	public static ArrayList<Integer> kth_permutation(ArrayList<Integer> v, int k)


	// Converts v to its next permutation, if it exists and returns true.
	// if v is already the last permutation, function returns false and does not change v.
	// Time Complexity: O(N)	N - Number of symbols in v
	
	public static boolean next_permutation(ArrayList<Integer> v)


	// Returns rank of permutation in sequence represented by ArrayList v
	// Time Complexity: O(N*N)	where N is the number of symbols in v

	public static int getRank(ArrayList<Integer> v)


Note: It is assumed that each symbol occurs only once in the sequence
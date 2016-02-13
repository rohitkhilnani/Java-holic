# Permutation

This class contains methods to find the next permutation of a set of symbols and to find nth permutation of a set of symbols efficiently.

Methods/ Operations implemented :

	// Returns ArrayList containing kth permutation of the symbols in ArrayList v
	// symbols in v must be sorted in ascending order
	// Time Complexity: O(n*n) where n is the number of symbols in v

	public static ArrayList<Integer> kth_permutation(ArrayList<Integer> v, int k)


	// Converts v to its next permutation, if it exists and returns true.
	// if v is already the last permutation, function returns false and does not change v.
	// Time Complexity: O(N)	N - Number of symbols in v
	
	public static boolean next_permutation(ArrayList<Integer> v)


	// Returns rank of permutation in sequence represented by ArrayList v
	// Time Complexity: O(N*N)

	public static int getRank(ArrayList<Integer> v)

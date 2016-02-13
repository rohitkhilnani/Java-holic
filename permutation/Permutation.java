package permutation;

import java.util.ArrayList;
import java.util.Collections;
/*
	This class defines method to find kth permutation of a set of symbols
*/

class Permutation{


	// Returns ArrayList containing kth permutation of the ArrayList v
	// symbols in v must be sorted in ascending order
	// Time Complexity: O(n*n) where n is the number of symbols in v

	public static ArrayList<Integer> kth_permutation(ArrayList<Integer> v, int k){

		// If size if less or equal to 1, no permutationis possible. Return v

		if(v.size() <= 1)
			return v;	

		// let size of v be n
		int n = v.size();

		// find n!
		int nfact = getFact(n);

		// make sure k is in range 1 to n!
		k = k % nfact;

		if(k == 0)
			k = nfact;	

	

		// Create ArrayList to hold result
		ArrayList<Integer> result = new ArrayList<Integer>(n);

		// Find first digit in kth permutation out of remaining symbols n-1 times

		for(int i=0;i<n-1;i++){

			k = findfirst(v, result, k);

		}

		// copy remaining single symbol from v to result
		result.add(v.get(0));

		// empty v
		v.clear();

		// return result
		return result;

	}


	// Finds first digit in kth permutation of v, removes that digit and adds at end of res
	// returns modified k for next iteration


	protected static int findfirst(ArrayList<Integer> v, ArrayList<Integer> result, int k){

		// find size of v
		int n = v.size();

		// find (n-1)!
		int fact = getFact(n-1);

		// find the index i of digit that will be first digit in kth permutation of v
		// and find r, the new value of k for next iteration

		int i = k / fact;

		int r = k % fact;

		// make sure r is non-zero
		if(r == 0){

			i--;
			r = fact;
		}


		// add ith value of v at end of result
		result.add(v.get(i));

		// remove ith value from v
		v.remove(i);

		// return new k for next iteration
		return r;

	}


	// finds and returns factorial of integer n

	protected static int getFact(int n){

		int res = 1;

		while(n>=2){

			res = res*n;
			n--;	
		}

		return res;

	}


	// Converts v to its next permutation, if it exists and returns true.
	// if v is already the last permutation, function returns false and does not change v.
	// Time Complexity: O(N)	N - Number of symbols in v
	public static boolean next_permutation(ArrayList<Integer> v){

		// return false if v has 1 or fewer symbols
		if(v.size() <= 1)
			return false;

		// save v's size
		int n = v.size();

		// find highest index i such that v[i] < v[i+1]
		int i = 0;
		for(i=n-2;i>=0;i--){

			if(v.get(i) < v.get(i+1))
				break;
		}	

		// if such i does not exist, return false
		if(i < 0)
			return false;

		// Now find highest index j such that v[i]<v[j]
		int j=0;
		for(j=n-1;j>=0;j--)
			if(v.get(j) > v.get(i))
				break;	

		// exchange v[i] and v[j]
		int t = v.get(i);
		v.set(i, v.get(j));
		v.set(j,t);

		// reverse the order of elements i+1 through end of v

		reverse(v, i+1, n-1);

		return true;

	}


	// Reverse order of elements i through j of array list.
	// Time Complexity: O(N) where N is distance between i and j  ( i <= j)
	protected static void reverse(ArrayList<Integer> v, int i, int j){

		int n = j-i+1;

		for(int k=0;k<(n/2);k++){

			int t = v.get(i);
			v.set(i, v.get(j));
			v.set(j, t);

			i++;
			j--;
		}

	}


}
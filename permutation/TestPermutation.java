/*
	This class tests class Permutation
*/

package permutation;
import java.util.ArrayList;
import permutation.Permutation;
import java.util.Arrays;

class TestPermutation{

	// tests kth_permutation

	public static void testkth(int k){

		System.out.println("Test kth");

		Integer arr[] = {1,2,3,4,5,6,7,8,9};

		ArrayList<Integer> v = new ArrayList<Integer>(Arrays.asList(arr));
		
		ArrayList<Integer> result = Permutation.kth_permutation(v, k);

		for(Integer x: result)
			System.out.print(x+" ");
	}


	// tests next_permutation

	public static void test_next_permutation(){

		System.out.println("Test next permutation for: 1 2 3 4");

		Integer arr[] = {1,2,3,4};

		ArrayList<Integer> v = new ArrayList<Integer>( Arrays.asList(arr) );

		System.out.println("Further permutations: ");

		while(Permutation.next_permutation(v)){
			System.out.println();
			for(Integer x: v)
				System.out.print(x+" ");

		}

	}

	public static void main(String[] args){

		int k = 1;

		if( args.length > 0 )
			k = new Integer(args[0]);

		testkth(k);

		test_next_permutation();

	}



}	
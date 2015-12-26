package binary_search_tree;

import java.util.NoSuchElementException;
import binary_search_tree.Bst;	// My implementation of Binary Search Tree in package binary_search_tree

/*
	Class to test class Bst. (Binary Search Tree)
*/

class TestBst{

			

	// Tests Insertion
	public static void testInsertion(){

		// Create a bst object
		Bst bst = new Bst();

		// Test inorder when tree is empty. Should throw exception
		try{
			bst.inOrder();
		}
		catch(NoSuchElementException e){
			System.out.println(e);
		}


		// Create array of integers to insert
		int[] values = {10, 7, 9, 8, 2, 15, 13, 17};

		// Insert values into bst
		for(int v: values){
			bst.insert(v);
		}

		// Print In Order traversal
		System.out.print("Inorder Traversal:\t ");
		bst.inOrder();

		System.out.println();
		System.out.println("Should be:\t\t 2 7 8 9 10 13 15 17");

	}



	public static void main(String args[]){

		// Test Insertion
		testInsertion();
	}

}

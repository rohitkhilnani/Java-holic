package binary_search_tree;

import java.util.NoSuchElementException;
import binary_search_tree.Bst;	// My implementation of Binary Search Tree in package binary_search_tree

/*
	Class to test class Bst. (Binary Search Tree)
*/

class TestBst{

			

	// Tests Insertion and traversals
	public static void testInsertion(){

		// Create a bst object
		Bst bst = new Bst();

		// Test Pre Order when tree is empty. Should throw exception
		try{
			bst.inOrder();
		}
		catch(NoSuchElementException e){
			System.out.println(e);
		}


		// Test Pre Order when tree is empty. Should throw exception
		try{
			bst.preOrder();
		}
		catch(NoSuchElementException e){
			System.out.println(e);
		}


		// Test Post Order when tree is empty. Should throw exception
		try{
			bst.postOrder();
		}
		catch(NoSuchElementException e){
			System.out.println(e);
		}


		// Test Level Order when tree is empty. Should throw exception
		try{
			bst.levelOrder();
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
		System.out.print("In order Traversal:\t ");
		bst.inOrder();

		System.out.println();
		System.out.println("Should be:\t\t 2 7 8 9 10 13 15 17");


		// Print Pre Order traversal
		System.out.print("Pre order Traversal:\t ");
		bst.preOrder();

		System.out.println();
		System.out.println("Should be:\t\t 10 7 2 9 8 15 13 17");


		// Print Post Order traversal
		System.out.print("Post order Traversal:\t ");
		bst.postOrder();

		System.out.println();
		System.out.println("Should be:\t\t 2 8 9 7 13 17 15 10");


		// Print Level Order traversal
		System.out.print("Level order Traversal:\t ");
		bst.levelOrder();

		System.out.println();
		System.out.println("Should be:\t\t 10 7 15 2 9 13 17 8");

	}




	public static void main(String args[]){

		// Test Insertion
		testInsertion();
	}

}

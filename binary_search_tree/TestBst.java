package binary_search_tree;

import java.util.NoSuchElementException;
import binary_search_tree.Bst;	// My implementation of Binary Search Tree in package binary_search_tree
import binary_search_tree.Node;	// My implementation of Node for BST in package binary_search_tree.
import binary_search_tree.BstIterator;	// My implementation of Iterator for BST in package binary_search_tree.
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


	// Tests Search

	public static void testSearch(){

		// Create a bst object
		Bst bst = new Bst();


		// Test search on empty tree. Should throw exception
		try{

			bst.search(10);	
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

		// Create array of keys to search
		int[] searchKeys = {10,7,15,2,9,13,17,8,1,19,12,5};

		// Search for each key in bst
		for(int s: searchKeys){

			Node n = bst.search(s);

			// Print message based on whether search is successful or unsuccessful.
			if(n!=null)
				System.out.println(s+" Found! Node contents: "+n.getValue());
			else
				System.out.println(s+" Not Found!");
		}



	}


	// Tests Deletion

	public static void testDeletion(){

		// Create a bst object
		Bst bst = new Bst();


		// Test deletion on empty tree. Should throw exception
		try{

			bst.delete(10);	
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


		// Create array of keys to be deleted (contains some keys which are not present in tree)
		int[] deleteKeys = {99, 10, 15, 8, 7, 100, 2, 9, 33, 17, 13};


		// Print level order traversal
		bst.levelOrder();		
		System.out.println();

		// Try to delete each key in deleteKeys
		for(int d: deleteKeys){

			try{
				bst.delete(d);
				System.out.println("Deleted: "+ d);
				bst.levelOrder();
				System.out.println();
			}
			catch(NoSuchElementException e){
				System.out.println(e);
			}

		}



	}


	// tests constructor that creates invalid bst

	public static void testInvalidConstructor(){	

		// Create invalid bst: 1
		Bst bst = new Bst(1);

		// level order traversal
		System.out.println("\nTest 1: ");
		System.out.println("Level order: ");
		bst.levelOrder();


		// Create invalid bst: 2
		bst = new Bst(2);

		// level order traversal
		System.out.println("\nTest 2: ");
		System.out.println("Level order: ");
		bst.levelOrder();


		// Create invalid bst: 3
		bst = new Bst(3);

		// level order traversal
		System.out.println("\nTest 3: ");
		System.out.println("Level order: ");
		bst.levelOrder();


		// Create invalid bst: 4
		bst = new Bst(4);

		// level order traversal
		System.out.println("\nTest 4: ");
		System.out.println("Level order: ");
		bst.levelOrder();

	}


	// tests isValidBst()

	public static void testIsValidBst(){

		System.out.println("\nTesting some invalid bsts");

		// Create invalid bst: 1
		Bst bst = new Bst(1);
		System.out.println("Is valid?: "+ bst.isValidBst());



		// Create invalid bst: 2
		bst = new Bst(2);
		System.out.println("Is valid?: "+ bst.isValidBst());

		// Create invalid bst: 3
		bst = new Bst(3);
		System.out.println("Is valid?: "+ bst.isValidBst());


		// Create invalid bst: 4
		bst = new Bst(4);
		System.out.println("Is valid?: "+ bst.isValidBst());

		System.out.println("Testing some valid bsts");

		bst = new Bst();
		System.out.println("Is valid?: "+ bst.isValidBst());

		bst.insert(10);
		System.out.println("Is valid?: "+ bst.isValidBst());

		bst.insert(5);
		bst.insert(15);
		System.out.println("Is valid?: "+ bst.isValidBst());

		bst.insert(7);
		bst.insert(6);
		bst.insert(100);
		System.out.println("Is valid?: "+ bst.isValidBst());

		bst.insert(80);
		System.out.println("Is valid?: "+ bst.isValidBst());

		bst.insert(95);
		System.out.println("Is valid?: "+ bst.isValidBst());

	}


	// prints whether tree bst is balanced
	// Also prints level order traversal of tree

	public static void testBalanced(Bst bst){

		System.out.print("Level Order: ");
		try{
			bst.levelOrder();
		}
		catch(NoSuchElementException e){
			System.out.print("Tree Empty");
		}

		System.out.println();

		System.out.println("Is Balanced? : " + bst.isBalanced());

	}


	// tests isbalanced 

	public static void testBalanced(){

		System.out.println("Test Balanced\n");

		// Create a bst object
		Bst bst = new Bst();

		// Test on empty tree
		testBalanced(bst);	

		bst.insert(100);

		// Test on one node tree
		testBalanced(bst);	

		// Test on other cases

		bst.insert(50);
		bst.insert(150);
		testBalanced(bst);	

		bst.insert(25);
		testBalanced(bst);	

		bst.insert(20);
		testBalanced(bst);			

		bst.insert(75);
		bst.insert(125);
		testBalanced(bst);				
		
		bst.insert(175);
		bst.insert(110);
		testBalanced(bst);	

		bst.insert(105);
		testBalanced(bst);	

		bst.insert(135);
		bst.insert(140);
		bst.insert(142);
		testBalanced(bst);	



	}	


// Test iterator

public static void testIterator(){

	System.out.println("Testing iterator");

	// Create a bst object
		Bst bst = new Bst();

		// try printing on empty tree
		BstIterator itr = new BstIterator(bst.root);
		System.out.println("Using iterator on empty tree");
		if(itr.hasNext()){
			while(itr.hasNext()){
				System.out.print(itr.next().getValue()+"* ");
			}
		}
		else{
			System.out.println("Tree empty");
		}

	
		// Create array of integers to insert
		int[] values = {100,50,150,40,75,120,180,20,45,55,121,160,52,122,123};
		

		// Insert values into bst
		for(int v: values){
			bst.insert(v);
		}

		// print inorder traversal
		System.out.print("Inorder: \t");
		bst.inOrder();

		// print using iterator
		System.out.print("\nUsing Iterator: ");

		itr = new BstIterator(bst.root);

		while(itr.hasNext()){
			System.out.print(itr.next().getValue()+" ");
		}

		System.out.println();

		System.out.println("Right skewed: ");
		// Test on right skewed tree
		Bst bst2 = new Bst();

		for(int i = 1;i<=10;i++)
			bst2.insert(i);

		itr = new BstIterator(bst2.root);

		while(itr.hasNext()){
			System.out.print(itr.next().getValue()+" ");
		}

	
		System.out.println("\nLeft skewed: ");
		// Test on left skewed tree
		Bst bst3 = new Bst();

		for(int i = 10;i>=1;i--)
			bst3.insert(i);

		itr = new BstIterator(bst3.root);

		while(itr.hasNext()){
			System.out.print(itr.next().getValue()+" ");
		}


}

// Test level order

public static void testLevelOrder(){

	System.out.println("Testing Level Order: ");

	Bst bst = new Bst();

	// check on empty tree
	try{

		bst.levelOrder();
	}
	catch(NoSuchElementException e){
		System.out.println(e);
	}

	bst.insert(100);
	bst.insert(80);
	bst.insert(60);
	bst.insert(40);

	bst.levelOrder();
	System.out.println();

	bst.insert(120);
	bst.insert(140);
	bst.insert(160);
	bst.insert(180);
	
	bst.levelOrder();
	System.out.println();

	bst.insert(85);
	bst.insert(82);
	bst.insert(105);

	bst.levelOrder();
	System.out.println();
}






	public static void main(String args[]){

		// Test Insertion
		testInsertion();

		// Test Search
		testSearch();

		// Test Deletion
		testDeletion();

		// test constructor that creates invalid bst
		testInvalidConstructor();

		// test isValidBst
		testIsValidBst();

		// test isbalanced
		testBalanced();

		// test iterator
		testIterator();

		// test level order
		testLevelOrder();
	}

}

package binary_search_tree;

import java.util.NoSuchElementException;
import binary_search_tree.Node;		// My implementation of Node class present in package binary_search_tree

/*
	This class implements Binary Search Tree. Following algorithms have been implemented: 

						1. Insertion
						2. Deletion
						3. In Order Traversal
						4. Pre Order Traversal
						5. Post Order Traversal
						6. Level Order Traversal
						7. Search for an element

	Note: Duplicate Keys are not allowed.					
*/

class Bst{

	private Node root = null; 		// Root of the tree

	// Constructs bst with default values
	Bst(){
		// Do Nothing.	
	}


	// Inserts a new node with specified value at specifiec node n.
	// Time Complexity: 
	//					Average Case: O(log N)
	//					Worst Case: O(N)		
	// Returns Root of sub tree at which the new node is inserted

	protected Node insert(Node n, int value){

		// If n is null, allocate a new node with specified value at n
		if(n == null){	

			n = new Node(value);

		}
		else if(value < n.getValue()){ 	 // If value is less than the value at n, insert value in left subtree of n 	

			 n.setLeft( insert(n.getLeft(), value) );
		}
		else{

			n.setRight( insert(n.getRight(), value) ); //Otherwise, insert in the right subtree of n
		}

		// Return the root
		return n; 

	}


	// Inserts a new Node with specified value at Root Node. 
	// Calls overloaded insert(Node n, int value)

	public void insert(int value){

		root = insert(root,value);
	}	


	// Visits a Node in In Order fashion

	protected void inOrderVisit(Node n){

		// Return if n is null
		if(n == null)
			return;

		// Otherwise, visit Left subtree
		inOrderVisit(n.getLeft());

		// Print value at node
		System.out.print(n.getValue()+" ");

		// Visit Right subtree
		inOrderVisit(n.getRight());
	}


	// In Order traversal of tree. Calls inOrderVisit on Root
	// Throws NoSuchElementException if root is null i.e. tree is empty.

	public void inOrder(){

		// If tree is empty, throw NoSuchElementException
		if(root == null){
			throw new NoSuchElementException("Tree is empty");	
		}

		// Otherwise, call inOrderVisit on root
		inOrderVisit(root);

	}


	// Visits a Node in Pre Order fashion

	protected void preOrderVisit(Node n){

		// Return if n is null
		if(n == null)
			return;

		// Otherwise, Print value at node
		System.out.print(n.getValue()+" ");

		// Visit Left subtree
		preOrderVisit(n.getLeft());

		// Visit Right subtree
		preOrderVisit(n.getRight());
	}


	// Pre Order traversal of tree. Calls preOrderVisit on Root
	// Throws NoSuchElementException if root is null i.e. tree is empty.

	public void preOrder(){

		// If tree is empty, throw NoSuchElementException
		if(root == null){
			throw new NoSuchElementException("Tree is empty");	
		}

		// Otherwise, call preOrderVisit on root
		preOrderVisit(root);

	}


	// Visits a Node in Post Order fashion

	protected void postOrderVisit(Node n){

		// Return if n is null
		if(n == null)
			return;

		// Otherwise Visit Left subtree
		postOrderVisit(n.getLeft());

		// Visit Right subtree
		postOrderVisit(n.getRight());

		// Print value at node
		System.out.print(n.getValue()+" ");
	}


	// Post Order traversal of tree. Calls postOrderVisit on Root
	// Throws NoSuchElementException if root is null i.e. tree is empty.

	public void postOrder(){

		// If tree is empty, throw NoSuchElementException
		if(root == null){
			throw new NoSuchElementException("Tree is empty");	
		}

		// Otherwise, call postOrderVisit on root
		postOrderVisit(root);

	}

}

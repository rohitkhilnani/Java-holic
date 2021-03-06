package binary_search_tree;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.NoSuchElementException;
import binary_search_tree.Node;		// My implementation of Node class present in package binary_search_tree

/*
	This class implements Binary Search Tree. Following algorithms have been implemented: 

						1. Insertion  				*done*
						2. Deletion 				*done*
						3. In Order Traversal 		*done*
						4. Pre Order Traversal 		*done*
						5. Post Order Traversal 	*done*	
						6. Level Order Traversal 	*done*
						7. Search for an element 	*done*
						8. Validate tree as BST 	*done*

	Note: Duplicate Keys are not allowed.					
*/

class Bst{

	Node root = null; 		// Root of the tree // (made default access to be able to test and use iterator)

	// Constructs bst with default values
	Bst(){
		// Do Nothing.	
	}


	// Constructs an invalid bst - based on id parameter
	// *This constructor is purely for testing purpsose*

	Bst(int id){

		// create invalid bst based on id
		switch(id){

			case 1:{
					
					root = new Node(5);

					root.setLeft(new Node(5));
					root.setRight(new Node(6));
					break;
				}

			case 2:{

					root = new Node(10);
					root.setLeft(new Node(7));
					root.setRight(new Node(9));
					break;
				}

			case 3:{ 
					root = new Node(10);
					root.setLeft(new Node(5));
					root.setRight(new Node(15));

					Node n = root.getLeft();
					n.setLeft(new Node(2));
					n.setRight(new Node(11));

					n = root.getRight();
					n.setLeft(new Node(13));
					n.setRight(new Node(17));	
					break;				
				}
			case 4:{
					root = new Node(10);
					root.setLeft(new Node(5));
					root.setRight(new Node(15));

					Node n = root.getLeft();
					n.setLeft(new Node(2));
					n.setRight(new Node(7));

					n = n.getRight();
					n.setLeft(new Node(1));

					n = root.getRight();
					n.setLeft(new Node(13));
					n.setRight(new Node(17));	
					break;		
				}
		}


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
	// Time Complexity: O(N)

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
	// Time Complexity: O(N)

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
	// Time Complexity: O(N)

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


	// Level Order Traversal
	// Time Complexity: O(N)

	public void levelOrder(){

		// If tree is empty, throw NoSuchElementException
		if(root == null){

			throw new NoSuchElementException("Tree is empty");	
		}

		// Create a queue to hold Nodes
		Queue<Node> queue = new LinkedList<Node>();

		// counters to track number of nodes in current and next level
		int currentLevelNodes = 1;
		int nextLevelNodes = 0;

		// Insert root node in queue
		queue.add(root);

		// while queue is not empty
		while(!queue.isEmpty()){

			// Remove node from queue
			Node n = queue.remove();

			// Decrement current level nodes
			currentLevelNodes--;

			// Print its value
			System.out.print(n.getValue()+" ");

			// Insert its left and right child on queue. Increment next level nodes
			if(n.getLeft()!=null){
				queue.add(n.getLeft());
				nextLevelNodes++; 			
			}	

			if(n.getRight()!=null){
				queue.add(n.getRight());		
				nextLevelNodes++; 
			}	


			// If current level nodes have been printed
			if(currentLevelNodes == 0){

				// set currentLevelNodes = nextLevelNodes
				currentLevelNodes = nextLevelNodes;

				// set nextLevelNodes = 0
				nextLevelNodes = 0;

				// print newline indicating end of current level
				System.out.println();

			}

		}


	}		


	// Searches a Node with specified value in the tree
	// Time Complexity: 
	//					Average Case: O(log N)
	//					Worst Case: O(N)		
	// Returns reference to Node if found. Otherwise, returns null
	// Throws NoSuchElementException if tree is empty

	public Node search(int value){

		// If tree is empty, throw NoSuchElementException
		if(root == null){

			throw new NoSuchElementException("Tree is empty");	
		}

		// Obtain a reference to root
		Node n = root;

		// Repeat until n = null (search unsuccessful) or n.value = value (search successful)
		while(n!=null && n.getValue() != value){

			// If value is smaller than the value at n, set n = n.left
			if(value < n.getValue())
				n = n.getLeft();
			else 						 // Otherwise, set n = n.right
				n = n.getRight();

		}

		// Return n 
		return n;

	}


	// Deletes Node with specified value in tree rooted at node n
	// Time Complexity: 
	//					Average Case: O(log N)
	//					Worst Case: O(N)		
	protected Node delete(Node n, int value){

		// If n is null, throw exception
		if(n==null)
			throw new NoSuchElementException("Node with value: " + value + " does not exit!");

		// If value is less than n, delete in left subtree
		if(value < n.getValue())			
			n.setLeft( delete(n.getLeft(), value)  );
		
		else if(value > n.getValue())  //  If value is greater than n, delete in right subtree
			n.setRight( delete(n.getRight(), value) );
		
		else{   // If n is the node to be deleted


			// If one of the childlren of n is null, assign n as other child

			if(n.getLeft()==null)
				n = n.getRight();
			else
				if(n.getRight()==null)
					n = n.getLeft();
				else {    // If n has two children

						// Find n's in order successor
						Node succ = findSucc(n);	

						// Copy succ's value to n
						n.setValue( succ.getValue() );

						// Delete succ from n's right subtree
						n.setRight( delete(n.getRight(),succ.getValue() ) );

				}



			}			

		// Return n	
		return n;	

	}


	// Delete Node with specified value from tree
	// Calls overloaded delete(Node n, int value)
	// Throws NoSuchElementException if tree is empty

	public void delete(int value){

		if (root == null)
			throw new NoSuchElementException("Tree is empty");

		root = delete(root, value);

	}


	// Returns In Order successor of specified node

	protected Node findSucc(Node n){

		// n is null or n's right sub tree does not exist, throw exception
		if(n == null || n.getRight() == null)
			throw new NoSuchElementException("Inorder Successor does not exist");

		//Obtain a reference to n's right child
		Node ref = n.getRight();

		// set ref = ref's left child while ref's left child is not null
		while(ref.getLeft()!=null)
			ref = ref.getLeft();

		// Return ref, which is the in order successor
		return ref;
	}


	// Returns true if tree is a valid Binary Search Tree. 
	// Returns false otherwise
	// Empty tree (root = null) is assumed to be a valid bst.
	// Time Complexity: O(N)		N - No. of Nodes
	// Space Complexity: O(N)	

	public boolean isValidBst(){

		if(root == null)
			return true;

		// saves last value processed. initially negative infinity
		int last = Integer.MIN_VALUE;

		// Define a dequeue - to be used as a stack
		Deque<Node> stk = new LinkedList<Node>();

		Node n = root;

		// repeat while n is not null or deq is not empty
		while(n!=null || !stk.isEmpty()){

			// if n is not null
			if(n!=null){

				// add n to stack
				stk.push(n);

				// set n as its left child
				n = n.getLeft();
			}
			else {  // if n is null

				// if stack is not empty
				if(stk.size()>0){
						
					// pop from stack
					n = stk.pop();	

					// if this node's value is smaller or equal to last processed value, return false
					if(n.getValue() <= last)
						return false;
					else   // else update last value to current value
						last = n.getValue();

					// set n as its right
					n = n.getRight();

				}


			}



		}

		// Since no bst violation occured above, Return true
		return true;


	}


	// Returns node's height (assuming height of leaf is 1) and checks if tree is balanced
	// Parameters: node, whose height is to be found
	//			   isBalanced (one element boolean array) - initially this flag must be supplied as true. 
	// If the tree is balanced, isBalanced will remain true after execution of this method				
	// Otherwise, isBalanced would be false			 
	// Time Complexity: O(N)
	// Space Complexity: O(N)

	public int getHeight(Node n, boolean[] isBalanced){

		// if n is null, return 0
		if(n == null)
			return 0;

		// Since n is not null,
		// Get height of n's children

		int hLeft = getHeight(n.getLeft(), isBalanced);
		int hRight = getHeight(n.getRight(), isBalanced);

		// if different between heights of left and right subtrees is more than 1, set isBalanced to false
		if (Math.abs(hLeft - hRight) > 1){
			isBalanced[0] = false;
			//System.out.println("found unbalanced");
		}

		
		return 1 + Math.max(hLeft, hRight);
	}


	// Calls getHeight and returns flag indicating whether tree is balanced
	// Returns true if tree is balanced, false otherwise
	// Time Complexity: O(N)
	// Space Complexity: O(N)
	// Prints height of tree
	public boolean isBalanced(){

		//Boolean result = true;
		boolean result[] = new boolean[1];
		result[0] = true;
		int treeHeight = getHeight(root, result);
		System.out.println("Height of tree: " + treeHeight);
		return result[0];
	}	

}

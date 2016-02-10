# Binary Search Tree and Traversals

Class Bst implements Binary Search tree and tree traversal algorithms

Class BstIterator implements an iterator to visit the tree nodes in in-order fashion

Structure of each node is defined in class Node.

Methods/ Operations Implemented:

	public void insert(int value) - Inserts a new Node with specified value in the BST

	public void inOrder() - Prints In Order traversal of tree.

	public void preOrder() - Prints Pre Order traversal of tree.

	public void postOrder() - Prints Post Order traversal of tree.

	public void levelOrder() - Prints Level Order Traversal of tree.

	public Node search(int value) - Searches a Node with specified value in the tree

	public void delete(int value) - Delete Node with specified value from the BST

	protected Node findSucc(Node n) - Returns In Order successor of specified node

	public boolean isValidBst() - Returns true if tree is a valid Binary Search Tree. 
								  Returns false otherwise

	public int getHeight(Node n, boolean[] isBalanced) - Returns node's height (assuming height of leaf is 1) and checks 													  if tree is balanced
	 													 Parameters: node, whose height is to be found
				   										isBalanced (one element boolean array) - initially this flag must be supplied as true. 
	 													If the tree is balanced, isBalanced will remain true after execution of this method. Otherwise, isBalanced would be false			  
	
    public boolean isBalanced() -  Calls getHeight and returns flag indicating whether tree is balanced
								   Returns true if tree is balanced, false otherwise
								   Prints height of tree

Iterator Methods: 								   

	public Node next() - Returns next tree node

	public boolean hasNext() - Returns true if there is at least one more element that has not been visited
							   Returns false otherwise
	


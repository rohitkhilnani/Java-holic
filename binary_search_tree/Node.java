package binary_search_tree;
/*
This class defines a Node of Binary Search Tree
*/

class Node{

	private int value = -1; 	// Data value, default = -1
	private Node left = null; 	// Left sub tree reference, default = null
	private Node right = null;	// Right sub tree reference, default = null

	// Constructs Node with default values

	public Node(){
		// Do Nothing
	}


	// Constructs Node with specified value

	public Node(int value){
		this.value = value;
	}


	// Sets value as specificed

	public void setValue(int value){
		this.value = value;
	}

	
	// Returns value
	public int getValue(){

		return value;
	}


	// Sets left subtree reference as specified

	public void setLeft(Node left){

		this.left = left;	
	}


	// Returns left subtree reference

	public Node getLeft(){

		return left;
	}


	// Sets right subtree reference as specified

	public void setRight(Node right){

		this.right = right;
	}


	// Returns right subtree reference

	public Node getRight(){

		return right;
	}


}
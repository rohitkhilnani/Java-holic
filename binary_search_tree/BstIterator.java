package binary_search_tree;

import java.util.NoSuchElementException;
import binary_search_tree.Bst;	// My implementation of Binary Search Tree in package binary_search_tree
import binary_search_tree.Node;	// My implementation of Node for BST in package binary_search_tree.
import java.util.ArrayDeque;
import java.util.Deque;

/*
	This class implements iterator to visit tree in in-order fashion.
*/

class BstIterator{

	protected Node curr = null;  						// Keep track of current position in traversal
	protected Deque<Node> stk = new ArrayDeque<Node>();	// Stack

	// Initializes iterator with the root of tree to be traversed

	public BstIterator(Node root){

		curr = root;
	}


	/*
		Returns true if there is at least one more element that has not been visited
		Returns false otherwise
		Time Complexity: O(1)
	*/

	public boolean hasNext(){

		if(curr == null && stk.isEmpty()){
			return false;
		}
		else{
			return true;
		}

	}


	/*
		Returns next tree node
		*Amortized* Time Complexity: O(1) 		
		Space Complexity: O(N) where N is the number of nodes in tree
	*/

	public Node next(){

		// if no elements are present, return null
		if(curr == null && stk.isEmpty())
			return null;

		// if curr is not null, push it to stack and set curr as it's left node, until curr is null
		while(curr!=null){
			
			stk.push(curr);
			curr = curr.getLeft();
		}

		// pop from stack and save in res
		Node res = stk.pop();

		// set curr as res's right
		curr = res.getRight();

		// return res
		return res;
	}	




}
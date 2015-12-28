package linked_list;

import java.util.NoSuchElementException;
import linked_list.Node; 	// My implementation of Node class present in package linked_list			
/*
This class implements a Linked List (singly linked).  
*/
class LinkedList{

	private Node head = null; 		// First element in the list		
	private int size = 0;			// Number of nodes in the list

	// Constructs an empty linked List

	public LinkedList(){
		// Do nothing
	}


	// Inserts a new node in the list with specified value at specified index
	// Index should be between: 0 and size (inclusive) 
	// Throws IndexOutOfBoundsException if index is invalid i.e. greater than size of list or negative
	// To insert at beginning - use index = 0
	// To insert at end - use index = size
	//
	// Time complexity:
	// O(1) - If inserting at beginning (index = 0)
	// O(N) - If inserting at other index. N is the number of nodes in the list.
	
	public void insert(int index, int value){

		// If Index = 0 (Inserting at the beginning of list)
		if(index == 0){

			// Create new node with specificed value
			Node newNode = new Node(value);

			// Set next reference of newNode to head
			newNode.setNext(head);

			// Set newNode as the new head
			head = newNode;		

			// Increase size by 1
			size++;
		}

		// If index is out of range, throw exception
		else if(index > size || index < 0){

			throw new IndexOutOfBoundsException("Index specified: "+index+", Max index allowed: "+size+". Cannot be negative");
		}
			
		// If index is valid and not 0
		else{

			// Obtain a reference to first node 
			Node ref = head;

			// Move ref forward (index-1) times
			for(int i=0;i<(index-1);i++)
				ref = ref.getNext();

			//Create new node with specified value
			Node newNode = new Node(value);

			// Point newNode's next to ref's next
			newNode.setNext(ref.getNext());

			// Point ref's next to newNode
			ref.setNext(newNode);	

			// Increase size by 1
			size++;

		}



	}	


	// Returns the number of Nodes in the list

	public int getSize(){
		// Return size		
		return size;
	}	


	// Deletes a node in the list at specified index
	// Index should be between: 0 and size-1 (inclusive)
	// Throws IndexOutOfBoundsException if index is invalid  
	// Throws NoSuchElementExceotion if list is empty
	// Time complexity:
	// O(1) - If deleting first Node (index = 0)
	// O(N) - Otherwise
	

	public int delete(int index){

		// If list is empty, throw exception
		if(size == 0){

			throw new NoSuchElementException("List Empty");
		}


		// If index is out of range, throw exception
		if(index >= size || index < 0){
			throw new IndexOutOfBoundsException("Index specified: "+index+", Max index allowed: "+(size-1)+". Cannot be negative");
		}	

		// If index is valid and index = 0 (Deleting first Node)
		else if(index == 0){

			// Save the value of first node
			int deletedValue = head.getValue();

			// Move head to its next node
			head = head.getNext();

			// Decrease the size by 1
			size--;

			// Return deleted value	
			return deletedValue;
		}

		// If index is valied and not 0
		else {

			// Obtain a reference to first node 
			Node ref = head;

			// Move ref forward (index-1) times
			for(int i=0;i<(index-1);i++)
				ref = ref.getNext();

			// Save the value of the Node to be deleted
			int deletedValue = ref.getNext().getValue();

			// Set ref's next to ref's next's rext (effectively deleting the node at given index )
			ref.setNext(ref.getNext().getNext());

			// Decrease the size by 1
			size--;

			// Return deleted value
			return deletedValue;
		}



	}


	// Returns the value of a node in the list at specified index
	// Index should be between: 0 and size-1 (inclusive)
	// Throws IndexOutOfBoundsException if index is invalid  
	// Throws NoSuchElementExceotion if list is empty
	// Time complexity:
	// O(N) 

	public int get(int index){

		// If list is empty, throw exception
		if(size == 0){

			throw new NoSuchElementException("List Empty");
		}

		// If index is out of range, throw exception
		if(index >= size || index < 0){
			throw new IndexOutOfBoundsException("Index specified: "+index+", Max index allowed: "+(size-1)+". Cannot be negative");
		}

		// If index is valid
		else {

			// Obtain a reference to first node 
			Node ref = head;

			// Move ref forward index times
			for(int i=0;i<index;i++)
				ref = ref.getNext();

			// Return value stored at this index(Node)
			return ref.getValue();

		}

	}

	// Returns a string containing values of all nodes
	// Complexity: O(N)
	public String toString(){

		// Obtain a reference to first node 
			Node ref = head;

		// Initialize a StringBuilder object to hold result
			StringBuilder result = new StringBuilder(2*size); 	// Trying to be as close as possible
 																// to actual requirement based on size of list
		
		//Append '[' to result
			result.append("[ ");

		// Repeat while ref is not null	
		while(ref!=null){

			result.append(ref.getValue()+" "); 		// Append value of Node to result
			ref = ref.getNext(); 					// Move ref ahead

		}	

		//Append ']' to result
			result.append("]");

		// Return string representation of result
		return result.toString();	

	}


	// Reverses linked list
	// Time Complexity: O(N)	N - Number of Nodes in list

	public void reverse(){

		// Return if list has less than 2 Nodes.
		if(head == null || head.getNext() == null){
			return;
		}

		// Create three Node references
		Node p1, p2, p3;

		p1 = null;				// p1 is null
		p2 = head;				// p2 = first node
		p3 = head.getNext();	// p3 = second node

		// Repeat while p2 is not null
		while(p2!=null){

			// set p2's next to p1
			p2.setNext(p1);

			// move p1 to p2
			p1 = p2;

			// move p2 to p3
			p2 = p3;

			// If p3 not null, advance p3
			if( p3!=null)
				p3 = p3.getNext();

		}

		// Set head as p1
		head = p1;	

	}


}


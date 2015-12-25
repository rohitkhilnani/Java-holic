package linked_list;

// This class defines what each node of the linked list contains.
class Node{

	private int value = -1;			// data value (default = -1)
	private Node next = null;		// reference to next Node in the list

	//Constructs Node with default values

	public Node(){
		// Do nothing
	}


	//Constructs Node with specified value

	public Node(int value){

		this.value = value;
	}


	// Returns value

	public int getValue(){
		return value;
	}


	// Sets value as specificed

	public void setValue(int value){
		this.value = value;
	}


	// Returns Next 
	public Node getNext(){
		return next;
	}


	// Sets Next
	public void setNext(Node next){
		this.next = next;		
	}	

}
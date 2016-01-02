package linked_list; 		

import java.util.NoSuchElementException;
import linked_list.LinkedList; 		// My implementation of linked list present in package linked_list
/*
	Class to test the LinkedList class.
	Test cases are not independent and should be called in the following order:

					1. testInsert()
					2. testDelete()
					3. testGet()	
					4. testReverse()    - This method is independent
*/

class TestLinkedList{

	// Create Linked List
	static LinkedList list;

	// Initialize linked list
	static {

		list = new LinkedList();
	}

	// Tests insert method 
	public static void testInsert(){

		// Insert 8 nodes in sequence
		for(int i=1;i<=8;i++)
			list.insert(0,i);

		// Display List
		System.out.println("List is:\t " + list); 	// Calls toString() to display
		System.out.println("Should be:\t [ 8 7 6 5 4 3 2 1 ]" );

		//Insert 50  at end
		list.insert(list.getSize(),50);

		// Display List
		System.out.println("List is:\t " + list); 	// Calls toString() to display
		System.out.println("Should be:\t [ 8 7 6 5 4 3 2 1 50 ]" );

		//Insert 100 at beginning
		list.insert(0,100);

		// Display List
		System.out.println("List is:\t " + list); 	// Calls toString() to display
		System.out.println("Should be:\t [ 100 8 7 6 5 4 3 2 1 50 ]" );

		// Insert 200 at index 5
		list.insert(5,200);

		// Display List
		System.out.println("List is:\t " + list); 	// Calls toString() to display
		System.out.println("Should be:\t [ 100 8 7 6 5 200 4 3 2 1 50 ]" );

		try{
			// Insert at negative index
			list.insert(-5,20);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e);	
		}

		try{
			// Insert at invalid index
			list.insert(list.getSize()+1,20);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e);	
		}


	}


	// Tests delete method
	public static void testDelete(){

		// Delete first node
		list.delete(0);

		// Display List
		System.out.println("List is:\t " + list); 	// Calls toString() to display
		System.out.println("Should be:\t [ 8 7 6 5 200 4 3 2 1 50 ]" );

		// Delete last node
		list.delete(list.getSize()-1);

		// Display List
		System.out.println("List is:\t " + list); 	// Calls toString() to display
		System.out.println("Should be:\t [ 8 7 6 5 200 4 3 2 1 ]" );		

		// Delete Node at index 7
		list.delete(7);

		// Display List
		System.out.println("List is:\t " + list); 	// Calls toString() to display
		System.out.println("Should be:\t [ 8 7 6 5 200 4 3 1 ]" );				


		try{
			// Delete at negative index
			list.delete(-5);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e);	
		}

		try{
			// delete invalid index
			list.delete(list.getSize());
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e);	
		}

		// Delete all remaining elements.
		int size = list.getSize();
		for(int i=0;i<size;i++)
			list.delete(0);

		// Display List
		System.out.println("List is:\t " + list); 	// Calls toString() to display
		System.out.println("Should be:\t [ ]" );				

		try{
		// Delete one more time, should throw exception. (Underflow)
			list.delete(0);

		}
		catch(NoSuchElementException e){
			System.out.println(e);
		}

	}


	// Tests get method
	public static void testGet(){

		try{
		// Should throw exception
		list.get(0);
		}
		catch(NoSuchElementException e){
			System.out.println(e);
		}

		// Insert 5 nodes in sequence
		for(int i=0;i<5;i++)
			list.insert(0,i);

		// Display List
		System.out.println("List is:\t " + list); 	// Calls toString() to display
		System.out.println("Should be:\t [ 4 3 2 1 0 ]" );	

		System.out.println("Value at index 0: "+list.get(0));
		System.out.println("Value at index 4: "+list.get(4));
		System.out.println("Value at index 2: "+list.get(2));

		try{
			// Access invalid element, should throw exception
			System.out.println("Value at index -1: "+list.get(-1));
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}

		try{
			// Access invalid element, should throw exception
			System.out.println("Value at index 11: "+list.get(11));
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}




	}


	// Test reverse

	public static void testReverse(){

		LinkedList ll = new  LinkedList();

		// Test on empty list
		System.out.println("Before: " + ll);
		ll.reverse();
		System.out.println("After: " + ll);


		ll.insert(0,1);

		// Test on list with 1 node
		System.out.println("Before: " + ll);
		ll.reverse();
		System.out.println("After: " + ll);

		ll.insert(0,2);

		// Test on list with 2 nodes
		System.out.println("Before: " + ll);
		ll.reverse();
		System.out.println("After: " + ll);		

		for(int i=3;i<=10;i++)
			ll.insert(0,i);

		// Test on list with 10 nodes
		System.out.println("Before: " + ll);
		ll.reverse();
		System.out.println("After: " + ll);


		for(int i=11;i<=17;i++)
			ll.insert(0,i);

		// Test on list with 17 nodes
		System.out.println("Before: " + ll);
		ll.reverse();
		System.out.println("After: " + ll);		




	}


	// Tests Pairwise Reverse

	public static void testPairwiseReverse(){

		System.out.println("Testing Pairwise Reverse: ");

		LinkedList ll = new  LinkedList();

		// Test on empty list
		System.out.println("Before:\t " + ll);
		ll.pairwiseReverse();
		System.out.println("After:\t " + ll);


		ll.insert(0,1);

		// Test on list with 1 node
		System.out.println("Before:\t " + ll);
		ll.pairwiseReverse();
		System.out.println("After:\t " + ll);

		ll.insert(0,2);

		// Test on list with 2 nodes
		System.out.println("Before:\t " + ll);
		ll.pairwiseReverse();
		System.out.println("After:\t " + ll);		

		for(int i=3;i<=10;i++)
			ll.insert(0,i);

		// Test on list with 10 nodes
		System.out.println("Before:\t " + ll);
		ll.pairwiseReverse();
		System.out.println("After:\t " + ll);


		for(int i=11;i<=17;i++)
			ll.insert(0,i);

		// Test on list with 17 nodes
		System.out.println("Before:\t " + ll);
		ll.pairwiseReverse();
		System.out.println("After:\t " + ll);		




	}


	public static void main(String args[]){

		// Test Insertion in linked list
		testInsert(); 		

		// Test Deletion in linked list
		testDelete();

		// Test Retrieval 
		testGet();

		// Test Reverse
		testReverse();

		// Test Pairwise Reverse
		testPairwiseReverse();
	}

}
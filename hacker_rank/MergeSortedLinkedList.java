/*
	Method to merge two sorted linked lists
	Parameters: Reference to heads of two linked lists
	Returns new head
	Time Complexity: O(N) where N is length of list A + length of list B
*/

/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
    
    // if list A is null, return list B
    if(headA == null)
        return headB;
    
    // if list B is null, return list A
    if(headB == null)
        return headA;
    
    // find new head
    Node head = null;
    
    if(headA.data < headB.data){
        
        head = headA;
        headA = headA.next;
    }
    else{
        head = headB;
        headB = headB.next;
    }
    
    
    // Obtain a pointer to current head
    Node p = head;
    
    // repeat while both headA and headB are not null
    while(headA!=null && headB!=null){
        
        // if element at headA is smaller
        if(headA.data < headB.data){
            
            //point p's next to headA
            p.next = headA;
            
            // set p as headA
            p = headA;
            
            // move headA ahead
            headA = headA.next;
        }
        else {  // if headB is smaller or equal
            
            //point p's next to headB
            p.next = headB;
            
            // set p as headB
            p = headB;
            
            // move headB ahead
            headB = headB.next;
            
        }
               
        
    }
        
    // if headA is null, point p's next to headB
    if(headA == null)
        p.next = headB;
    else    // else point p'snext to headA
        p.next = headA;
    
    // return new head
    return head;
    

}

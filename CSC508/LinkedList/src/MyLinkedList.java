/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hidayah
 */ // Node definition
class Node {
    // package access data so class List can access it directly
   Object data;  //info  
   Node next; // link

   // Constructor: Create a Node that refers to Object o.
   Node( Object obj ) 
   { //this( o, null ); 
       data = obj;
       next = null;
   }

   // Constructor: Create a Node that refers to Object o and
   // to the next Node in the List.
   Node( Object o, Node nextNode )
   {
      data = o;         // this node refers to Object o
      next = nextNode;  // set next to refer to next
   }

   // Return a reference to the Object in this node
   Object getObject() { return data; }

   // Return the next node
   Node getNext() { return next; }
}

// LinkedList definition
public class MyLinkedList{
   private Node head;
   private Node tail;
   private Node newNode; // use to traverse the list
  
   // Constructor: Construct an empty List 
   public MyLinkedList()
   {
      head = tail = newNode = null;
   }

   // Return true if the List is empty
     public boolean isEmpty()
    { return head == null; }

   // Return First element
   public Object getFirst()
   {
       if (isEmpty())
            return null;
       else{
           newNode = head;
           return newNode.data;
        }
    }
    
   // Return next element
     public Object getNext()
   {
         if (newNode != tail)
         {
                newNode = newNode.next;
                return newNode.data;
         }
         else
                return null;
     }
    /* public Object size(Object size) {
        return size;
    }*/
     
     //to return the size of list
     public int size(){
       Node temp = head;
       int count = 0;
       while (temp != null)
       {
           count++;
           temp = temp.next;
       }
       return count;
   }
     
    // Display the content of linked list - traverse the linked list
    public void display()
   {
       if ( isEmpty() ) {
         System.out.println( "The list is Empty ");
        // return;
      } 

      System.out.print( "The contents of the linked list is: " );

      Node current = head;

      while ( current != null ) {
         System.out.print( current.data + " " );
         current = current.next;
      }

      System.out.println( "\n" );
   }
 
    // Insert an Object at the front of the List
   // If List is empty, head and tail will refer to
   // the same object. Otherwise, head refers to new node.
   
   //  public void insertAtFront( Object insertItem )
   // { Write the method definition here }
   public void insertAtFront( Object insertItem )
   {     
      newNode = new Node(insertItem); // create a newnode
      if (head == null)   // List is empty
          head = tail = newNode;
      else{
         newNode.next = head;
         head = newNode;      
      }
   }
   
   // insertAtBack()
  public void insertAtBack(Object insertItem) {
	if (isEmpty())   // List is empty
          head = tail = newNode;
        
        else 
           tail.next = new Node(insertItem,head.next);
    }
  
   //remove FromFront()
  public Object removeFromFront() {
		Object remove = null;

		if (isEmpty())
			System.out.println( "The list is Empty ");

		remove = head;
                
		if (head.equals(tail)) {
			head = tail = null;
		} else {
			head = head.next;
		}

		return remove;
	}
   //removeAtBack()
  public Object removeFromBack() {
		Object remove = null;

		if (isEmpty())
			System.out.println( "The list is Empty ");

		remove = tail.data;
		if (head.equals(tail))
			head = tail = null;
		else {
			newNode = head;

			// Iterate to the node just before the last node
			while (newNode != tail)
				newNode = newNode.next;

			// Reassigned the new lastnode and break next chain of the removed nodes
			tail = newNode;
			newNode.next = null;
		}

		return remove;
	}
}

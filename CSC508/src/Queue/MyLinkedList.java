/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author hidayah
 */
// Node definition
class Node {
    // package access data so class List can access it directly

    Object data;  //info  
    Node next; // link

    // Constructor: Create a Node that refers to Object o.
    Node(Object obj) { //this( o, null ); 
        data = obj;
        next = null;
    }

    // Constructor: Create a Node that refers to Object o and
    // to the next Node in the List.
    Node(Object o, Node nextNode) {
        data = o;         // this node refers to Object o
        next = nextNode;  // set next to refer to next
    }

    // Return a reference to the Object in this node
    Object getObject() {
        return data;
    }

    // Return the next node
    Node getNext() {
        return next;
    }
}

// LinkedList definition
public class MyLinkedList {

    private Node head;
    private Node tail;
    private Node newNode; // use to traverse the list

    // Constructor: Construct an empty List 
    public MyLinkedList() {
        head = tail = newNode = null;
    }

    // Return true if the List is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Return First element
    public Object getFirst() {
        if (isEmpty()) {
            return null;
        } else {
            newNode = head;
            return newNode.data;
        }
    }

    // Return Last element
    public Object getLast() {
        if (isEmpty()) {
            return null;
        } else {
            newNode = tail;
            return newNode.data;
        }
    }

    // Return next element
    public Object getNext() {
        if (newNode != tail) {
            newNode = newNode.next;
            return newNode.data;
        } else {
            return null;
        }
    }

    // Display the content of linked list 
    public void print() {
        if (isEmpty()) {
            System.out.println("The list is Empty ");
            // return;
        }

        System.out.print("The contents of the linked list is: ");

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println("\n");
    }

    // insert item at the back of the list
    public void insertAtBack(Object insertItem) {

        newNode = new Node(insertItem);
        if (head == null) {
            head = tail = newNode; //head,tail and newNode are empty
        } else {
            tail.next = newNode; //access for the next current tail
            tail = newNode;
        }
    }

    // Remove the first node from the List.
    public Object removeAtFront() {
        Object removeItem = null;

        if (isEmpty()) {
            System.err.println(" The list is empty");
        }
        removeItem = head.data;  // retrieve the data

        // reset the head and tail references
        if (head.equals(tail)) {
            head = tail = null;
        } else {
            head = head.next;
        }

        return removeItem;
    }
}

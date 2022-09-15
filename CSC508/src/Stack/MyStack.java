/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author hidayah
 */
class Node{
    Object data;
    Node next;
    
    // Constructor: Create a Node that refers to Object o and to the next Node in the List
    Node(Object obj)
    {
        data = obj;
        next = null;
    }
    
    Node(Object o, Node nextNode){
        data = o; // this node refers to Object o
        next = nextNode; // set next to refer to next
    }
    
    // Return a reference to the Object in this node
    Object getData(){
        return data;
    }
    
    // Return the address of next node
    Node getNext(){
        return next;
    }
    
}


public class MyStack {
    private Node top; // point to the first Node
    private Node newNode; // point to the new Node
    // private Node currNode;
    
    public MyStack(){
        top = null;
    }
    
    public void push(Object item){
        //insertAtFront(item);
        newNode = new Node(item);
        if(top==null)
            top = newNode;
        else
            newNode.next = top;
            top = newNode;
    }
    
    public Object pop(){
        //return removeAtFront();
        Object removeItem = null;
        if(isEmpty()){
            System.out.println("The stack is Empty!");
        }
        
        removeItem = top.data; // retrieve the data
        
        //reset the firstNode  and lastNode references
        if(top.next == null){
            top = null;
        }
        else{
            top = top.next;
        }
        return removeItem;
    }
    
    public Object top(){ //retrieve the top item
        // return getFirst();
        return top.data;
    }
    
    public boolean isEmpty(){
        // return isEmpty();
        return top == null;
    }
    
    public void display(){
        System.out.println("The contents of the stack:");
        Node current =  top;
        while(current!=null){
            
            System.out.println(current.data.toString()+" ");
            current =  current.next;
        }
    }
}

/*
 Name : SITI NURHIDAYAH BINTI HALIZAN
Sid# : 2021477726
Course: CSC508
Group#: CS2304A
Assign#: LAB 2 (ON STACK)
Due Date: 10 JUN 2022
Program Description: MyStack
 */
package assignment2;

public class MyStack {

    private Node stackTop;       //point to first node
    private Node newNode;   // point to the new node
    private Node current;
    int size;
    
    public MyStack() {  //default constructor
        stackTop = null;
        size = 0;
    }

    //insert item onto stack
    public void push(Object item) {
        newNode = new Node(item); //create newNode
        newNode.next = stackTop;
        stackTop = newNode;
        size++;
    }

    //remove item from stack
    public void pop() {
        stackTop = stackTop.next;
        size--;
    }

    //retrieve item top item
    public Object top() {
        if (emptyStack()) {
            return null;
        } else {
            current = stackTop;
            return current.data;
        }
    }

    //return stack size
    public int size() {
        return size;
    }

    public Object getNext() {
        // current = stackTop;
        if (current.next == null) {
            return null;
        } else {
            current = current.next;
            return current.data;
        }
    }

    //check whether the stack is empty
    public boolean emptyStack() {
        return (stackTop == null);
    }

    //display the contenst of list
    public void displayStack() {
        System.out.println("The content of the stack:");
        Node current = stackTop;
        while (current != null) {
            System.out.println(current.data.toString() + " ");
            current = current.next;
        }
    }
}

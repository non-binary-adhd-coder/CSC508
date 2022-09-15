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
public class MyQueue extends MyLinkedList {

    private Node front;
    private Node rear;
    private Node newNode;

    public MyQueue() {
    }

    // Method to enqueue@insert item at the back of the queue
    public void enqueue(Object item) {
        newNode = new Node(item);
        if (rear == null) {
            rear = front = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
        //insertAtBack(item);
    }

    // Method to dequeue@delete first element from the queue
    public Object dequeue() {
        return removeAtFront();
    }

    // Method to return the first element
    public Object getFront() {
        return getFirst();
    }

    // Method to return the last element
    public Object getRear() {
        return getLast();
    }

    public void print() {
        if (isEmpty()) {
            System.out.println(" Queue is Empty ");
            return;
        }

        Node current = front;

        while (current != null) {
            System.out.print(current.data.toString() + " ");
            current = current.next;
        }

        System.out.println("\n");
    }
}

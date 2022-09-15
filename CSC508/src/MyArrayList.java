/*
Name : 
Sid# : 
Course: CSC508
Group#: 
Assign#: LAB 1
Due Date: 29 April 2022
Program Description: MyArrayList
*/

public class MyArrayList {

    // default initial capacity
    private static final int INITIAL_CAPACITY = 50;
    private Object[] theData;   // the array to hold the list elements
    private int size = 0;     // the current size
    private int capacity = 0;   // the current capacity

    //Default constructor
    //Creates an array of size 10
    public MyArrayList() {
        theData = new Object[INITIAL_CAPACITY];
        capacity = INITIAL_CAPACITY;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == INITIAL_CAPACITY;
    }

    /**
     * exercise 3 Get the current size of the array
     *
     * @return The current size of the array
     */
    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        } else {
            return theData[index];
        }
    } //end get

    //exercise 4  
    public void insertAtFront(Object theValue) {
        if (isFull()) {
            System.out.println("Cannot insert in a full list.");
        } else if (isEmpty()) {
            theData[0] = theValue;  //insert the item at front
            size++; //increment the size
        } else {
            for (int i = size; i > 0; i--) {
                theData[i] = theData[i - 1];    // move elements down
            }
            theData[0] = theValue;              //insert the item at front
            size++;                             //increment the size
        }
    }

    // exercise 5   display the elements of the list
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(theData[i]);
            System.out.println();
        }
    }

    //exercise 7
    public void insertAtBack(Object theValue) {
        if (isFull()) //the list is full
        {
            System.err.println("Cannot insert in a full list.");
        } else if (isEmpty()) {
            theData[0] = theValue;
            size++;
        } else {
            theData[size] = theValue;
            size++;
        }
    }

    //exercise 9
    public void insertAtIndex(Object theValue, int index) {
        if (isFull()) //the list is full
        {
            System.err.println("Cannot insert in a full list.");
        } else if (isEmpty()) {
            theData[0] = theValue;
            size++;
        } else {
            for (int i = size; i > index; i--) {
                theData[i] = theData[i - 1];    // move elements down
            }
            theData[index] = theValue;              //insert the item at front
            size++;
        }
    }

    // exercise 11
    public void removeFromFront() {
        if (isEmpty()) {
            System.err.println("No data available");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(theData[i+1]);
                size--;
            }
        }
    }
    // exercise 13
    public void removeFromBack() {
        if (isEmpty()) {
            System.err.println("No data available");
        } else {
            size--;
        }
    }

}

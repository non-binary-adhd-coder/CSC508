/*
 Name : SITI NURHIDAYAH BINTI HALIZAN
Sid# : 2021477726
Course: CSC508
Group#: CS2304A
Assign#: LAB 2 (ON STACK)
Due Date: 10 JUN 2022
Program Description: node
 */
package assignment2;

class Node {

    Object data; //store date
    Node next;  //stor address of the next node

    //constructor
    Node(Object obj) {
        data = obj;
        next = null;
    }

    Node(Object o, Node nextNode) {
        data = o;         //this node refers to Object o
        next = nextNode;  //set next to refer to next
    }
   
    Object getData() {  
        return data;    //return references
    }

    Node getNext() {    
        return next;    //return address of the next node
    }

}

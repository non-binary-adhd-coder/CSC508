/*
Name : SITI NURHIDAYAH BINTI HALIZAN
Sid# : 2021477726
Course: CSC508
Group#: CS2304A
Assign#: LAB 3 (ON BST)
Due Date: 15 JULAI 2022
Program Description: BSTNotebook
 */
package assignment3;

/**
 *
 * @author hidayah
 */

import javax.swing.*;
import java.util.Scanner;

public class BSTNotebook {

    TreeNode root;
    
    public BSTNotebook()
    {
       root = null;
    }
    
    // Insert a new node in the binary search tree.
    // If the root node is null, create the root node here.
    // Otherwise, call the insert method of class TreeNode.
    public void insertNode (Notebook d)
    {
        if(root == null)
            root = new TreeNode(d);
        else
            root.insert(d);
    }
    
    // Method that calls the recursive method
    public void display() {
        displayAll(root); // recursive method
    }   
        
    public void displayAll(TreeNode node) { //INORDER
        if (node == null) // base case
        {
            return;
        }

        displayAll(node.left); // node.left - L N R
        System.out.println(node.data.toString()  + "\n"); // display all details
        //System.out.println(node.data.getName()());
        displayAll(node.right);
    }
    
    // countN()to count the number of HP notebooks with price greater than RM5,000.
     public void count(){
        System.out.println("\nThe number of HP notebooks with price greater than RM5,000: " + countN(root));
    }
     
    public int countN(TreeNode node) {
        if (node == null) // base case - empty tree
        {
            return 0;
        }
        
        if(node.data.getPrice() > 5000 && node.data.getBrand().equalsIgnoreCase("HP"))
            return 1 + countN(node.left) + countN(node.right);      
        else {
            return 0 + countN(node.left) + countN(node.right);
        }
    }  
    
    //to display the total price of notebooks based on the brand of notebooks.
    public double totalPriceTypePrint(String brand)
    {
        return totalPriceType(root,brand);
    }
    
    // to calculate the total price of notebooks based on the brand of notebooks.
    public double totalPriceType(TreeNode node, String brand)
    {
       if (node == null)
            return 0;
            
       if (node.data.getBrand().equalsIgnoreCase(brand))
           return node.data.getPrice() + totalPriceType(node.left,brand) + totalPriceType(node.right,brand);
        else 
           return 0 + totalPriceType(node.left, brand) + totalPriceType(node.right, brand);
    } 
    
    // to find the most expensive notebook.
    public double maxPrice(TreeNode node) {
       if (node==null)
            return 0;
        else{
             double maxVal = node.data.getPrice();
             if (node.left != null)
                maxVal=Math.max(maxVal,maxPrice(node.left));
                
             if (node.right != null)
                maxVal = Math.max(maxVal,maxPrice(node.right));
                
             return maxVal;
            }
    }
    
    public void displaymaxPrice() {
        System.out.println("\nThe most expensive notebook : RM " + maxPrice(root));
    }
    
    //searchSerial(String)to search for a notebook based on the serial no of the notebook.
    public void searchSerial(String s)
    {
       searchBy(root,s);
    }  
   
    public void searchBy(TreeNode node, String serialNo)
    {
        if(node == null )
        return;
        
        if (node.data.getSN().equalsIgnoreCase(serialNo))
           {
             System.out.println("\nSearch Result..."); 
             System.out.println(node.data.toString());
           }
        
        searchBy(node.left,serialNo);
        searchBy(node.right,serialNo);
    }
}

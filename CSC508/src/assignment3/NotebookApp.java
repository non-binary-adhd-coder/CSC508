/*
Name : 
Sid# : 
Course: CSC508
Group#: 
Assign#: LAB 3 (ON BST)
Due Date: 15 JULAI 2022
Program Description: NotebookApp (main)
 */
package assignment3;

/**
 *
 * @author hidayah
 */
import java.util.*;
import java.text.*;
import java.util.Scanner;

public class NotebookApp {
    public static void main (String[] args)
    {
        BSTNotebook nbList = new BSTNotebook();
        Notebook notebook;
        Scanner inStringScanner = new Scanner(System.in); 
        //.useDelimiter("")
        Scanner inDblScanner = new Scanner(System.in);       
                
        String sNo, sBrand, sModel="";
        double price=0.0;
        
        for (int i = 0; i < 3;i++)
        {
            // input data for the notebook here
            System.out.print("\nNotebook Serial No : ") ;
            sNo = inStringScanner.nextLine();
        
            System.out.print("Notebook Brand : ") ;
            sBrand = inStringScanner.nextLine() ;
        
            System.out.print("Notebook Price : ") ;
            price = inDblScanner.nextDouble() ;
        
            System.out.print("Notebook Model : ") ;
            sModel = inStringScanner.nextLine();
        
            // create the Notebook objects here
            notebook = new Notebook(sNo,sBrand,price,sModel) ;
            nbList.insertNode(notebook);
           
        }
        
        //display all notebook details in ascending order
        System.out.println("\nDetails of all notebooks:");
        nbList.display();
        
        //Count and display the number of HP notebooks with price greater than RM5,000.
        nbList.count();
        
        // Calculate and display the total price of notebooks based on the brand of notebooks in the binary search tree
        System.out.println("\nPlease enter the brand to count the total price: ");
        String brandsearch = inStringScanner.next();
        System.out.println("The total price for product " + brandsearch+ " : RM" + nbList.totalPriceTypePrint(brandsearch));
    
        //display highest price
        nbList.displaymaxPrice();
            
        //search for notebook by serialNo
        System.out.print("\nNotebook serial no : ") ;
        String serialNo = inStringScanner.next();
        nbList.searchSerial(serialNo);
    
    }    
}

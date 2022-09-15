/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BST2;

/**
 *
 * @author hidayah
 */
import javax.swing.*;
import java.util.Scanner;

public class EmpApp {

    public static void main(String[] args) {
        EmpTree tree = new EmpTree(); //declare the BST object

        Scanner in = new Scanner(System.in);

        System.out.print("Number of employee:");
        int n = in.nextInt();

        //declare array of Employee objects named emp here 
        Employee[] emp = new Employee[n];

        String aName;
        long anId;
        double aBase, anAllow, salary;

        for (int i = 0; i < emp.length; i++) {
            // input data for the employees here
            System.out.print("\nEmployee name : ");
            aName = in.next();

            System.out.print("Employee id : ");
            anId = in.nextLong();

            System.out.print("Employee base salary : ");
            aBase = in.nextDouble();

            System.out.print("Employee allowance : ");
            anAllow = in.nextDouble();

            // create the Employee objects here
            emp[i] = new Employee(aName, anId, aBase, anAllow);
            tree.insertNode(emp[i]);
        }

        // display the tree
        System.out.println("\nUsing inorder traversal");
        tree.displayAll(); // inorder
        //display preorder

        //display postorder
        tree.countE();
        tree.total();

        // search for an employee by name
        System.out.print("\nEmployee name : ");
        String name = in.next();
        tree.search(name);
    }

}

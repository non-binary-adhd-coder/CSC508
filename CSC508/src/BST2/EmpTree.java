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
public class EmpTree {

    private TreeNode2 root;

    // Construct an empty Tree of integers
    public EmpTree() {
        root = null;
    }

    // Insert a new node in the binary search tree.
    // If the root node is null, create the root node here.
    // Otherwise, call the insert method of class TreeNode.
    public void insertNode(Employee d) {
        if (root == null) {
            root = new TreeNode2(d);
        } else {
            root.insert(d);
        }
    }

    // Method that calls the recursive method
    public void displayAll() {
        display(root); // recursive method
    }

    // Recursive method to display the details of Employee using inorder traversal
    private void display(TreeNode2 node) { //insert
        if (node == null) // base case
        {
            return;
        }

        display(node.left); // node.left - L N R
        System.out.println(node.data.toString()); // display all details
        //System.out.println(node.data.getName()());
        display(node.right);
    }

    // Write method to display using preorder traversal  
    private void preorder(TreeNode2 node) {
        if (node == null) //base case
        {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    //Postorder Traversal
    private void postorder(TreeNode2 node) {
        if (node == null) //base case
        {
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.data + " ");
    }

    // Write method to count number of employees @ nodes in the BST
    public void countE() {
        System.out.println(" Number of employee: " + count(root));
    }

    // Method to count the number of nodes/employees
    private int count(TreeNode2 node) {
        if (node == null) // base case - empty tree
        {
            return 0;
        }
        return 1 + count(node.left) + count(node.right);
    }

    // Write method to calculate the total salary
    public void total() {
        System.out.println(" Total salary: " + totalSalary(root));
    }

    private double totalSalary(TreeNode2 node) {
        if (node == null) // base case - empty tree
        {
            return 0;
        }

        return node.data.calSalary() + totalSalary(node.left) + totalSalary(node.right);
    }

    // Write method to count employee with salary > 3000
    public void salarymorethan3000() {
        System.out.println("\nEmployee with salary more than 3000: " + countSal(root));
    }

    private int countSal(TreeNode2 node) {
        if (node == null) //base case
        {
            return 0;
        }
        if (node.data.calSalary() > 3000) {
            return 1 + countSal(node.left) + countSal(node.right);
        } else {
            return 0 + countSal(node.left) + countSal(node.right);
        }

    }

    // Write method to search for an employee by name entered by the user
    public void search(String name) {
        searchData(root, name);
    }

    public void searchData(TreeNode2 node, String name) {
        if (node == null) {
            return;
        } else if (node.data.getName().equalsIgnoreCase(name)) {
            System.out.println(node.data.toString());
        }

        searchData(node.left, name);

        searchData(node.right, name);
    }

   

}

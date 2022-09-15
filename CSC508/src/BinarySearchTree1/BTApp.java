package BinarySearchTree1;

/**
 *
 * @author hidayah 
 * Objective: Writing Program for Tree Application - print
 * inorder, preorder, postorder  *
 * References: - Java: How to Program by Deitel & Deitel - Asas Struktur Data
 * dengan C++ by Mazidah Puteh
 */
// Java application program of Binary Search Tree
public class BTApp {

    public static void main(String args[]) {
        BSTree tree = new BSTree();
        int intVal;

        System.out.println("Random generation - Values inserted are: ");

        for (int i = 1; i <= 10; i++) {
            intVal = (int) (Math.random() * 100);
            System.out.print(intVal + " ");
            tree.insertNode(intVal);
        }
        
        //call preorderTraversal 
        System.out.println("\n\nPreorder traversal");
        tree.preorderTraversal();
        System.out.println();

        //call postorderTraversal        
        System.out.println("\n\nPostorder traversal");
        tree.postorderTraversal();
        System.out.println();
        
        //call inorderTraversal
        System.out.println("\n\nInorder traversal");
        tree.inorderTraversal();
        System.out.println();
    }
}

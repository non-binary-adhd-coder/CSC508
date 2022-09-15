/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree1;

// Class Tree definition
public class BSTree {

    private TreeNode root;

    // Construct an empty Tree of integers
    public BSTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // Insert a new node in the binary search tree.
    // If the root node is null, create the root node here.
    // Otherwise, call the insert method of class TreeNode.
    public void insertNode(int d) {
        if (root == null) {
            root = new TreeNode(d);
        } else {
            root.insert(d);
        }
    }

    // Preorder Traversal
    public void preorderTraversal() {
        preorder(root);
    } // call recursive method- preorder

    public void inorderTraversal() {
        inorder(root);
    }   // call recursive method- inorder

    public void postorderTraversal() {
        postorder(root);
    }   // call recursive method- postorder

    // Recursive method to perform preorder traversal
    private void preorder(TreeNode node) {
        if (node == null) //base case
        {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    //Postorder Traversal
    private void postorder(TreeNode node) {
        if (node == null) //base case
        {
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.data + " ");
    }
    
    //Inorder Traversal
    private void inorder(TreeNode node) {
        if (node == null) //base case
        {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
}

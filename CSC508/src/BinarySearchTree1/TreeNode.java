/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree1;

// Class TreeNode definition
public class TreeNode {
    // package access members

    TreeNode left;   // left node
    int data;        // data item
    TreeNode right;  // right node

    // Constructor: initialize data to d and make this a leaf node
    public TreeNode(int d) {
        data = d;
        left = right = null;  // this node has no children
    }

    // Insert a TreeNode into a Tree that contains nodes.
    // Ignore duplicate values.
    public void insert(int d) {
        // if ( d == data ) {
        if (d < data) {
            if (left == null) {
                left = new TreeNode(d);
            } else {
                left.insert(d);
            }
        } else if (d > data) {
            if (right == null) {
                right = new TreeNode(d);
            } else {
                right.insert(d);
            }
        }
    }
}

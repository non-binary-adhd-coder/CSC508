/*
Name : 
Sid# : 
Course: CSC508
Group#: 
Assign#: LAB 3 (ON BST)
Due Date: 15 JULAI 2022
Program Description: TreeNode
 */
package assignment3;

/**
 *
 * @author hidayah
 */
public class TreeNode {
    // package access members

    TreeNode left;   // left node
    Notebook data;   // data item
    TreeNode right;  // right node

    // Constructor: initialize data to d and make this a leaf node
    public TreeNode(Notebook d) {
        data = d;
        left = right = null;  // this node has no children
    }

    // Insert a TreeNode into a Tree that contains nodes.
    // Ignore duplicate values.
    public void insert(Notebook d) {
        if (d.getSN().compareTo(data.getSN())<0) {
            if (left == null) {
                left = new TreeNode(d);
            } else {
                left.insert(d);
            }
        } 
        else if (d.getSN().compareTo(data.getSN())>0) {
            if (right == null) {
                right = new TreeNode(d);
            } else {
                right.insert(d);
            }
        }
    }//end of class
}

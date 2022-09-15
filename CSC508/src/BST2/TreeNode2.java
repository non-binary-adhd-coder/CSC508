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
public class TreeNode2 {
    // package access members

    TreeNode2 left;   // left node
    Employee data;        // data item
    TreeNode2 right;  // right node

    // Constructor: initialize data to d and make this a leaf node
    public TreeNode2(Employee d) {
        data = d;
        left = right = null;  // this node has no children
    }

    // Insert a TreeNode into a Tree that contains nodes.
    // Ignore duplicate values.
    public void insert(Employee d) {
        if (d.getId() < data.getId()) {
            if (left == null) {
                left = new TreeNode2(d);
            } else {
                left.insert(d);
            }
        } else if (d.getId() > data.getId()) {
            if (right == null) {
                right = new TreeNode2(d);
            } else {
                right.insert(d);
            }
        }
    }
    

}// end class

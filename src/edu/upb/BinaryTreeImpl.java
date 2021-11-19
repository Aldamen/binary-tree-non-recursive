/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb;

public class BinaryTreeImpl implements IBinaryTree {

    private TreeNode root;

    @Override
    public TreeNode getRoot() {
        return root;
    }

    @Override
    public void insertTreeNode(int newItem) {
        
        if (root == null) {
            root = new TreeNode(newItem);  // The tree is empty.  Set root to point to a new node
            return;
        }
        
        TreeNode current = root;   // Start at the root.
        
        // while ( COMPARACIÓN LÓGICA ) romper false; break; return; error;
        
        while (true) {
            
            if(newItem == current.getValue()){
                return;
            }
            
            if ( newItem < current.getValue()) {
                
                if (current.getLeft() == null) {
                    current.setLeft(new TreeNode(newItem));
                    return;  //breaks the while and ends the method
                } else {
                    current = current.getLeft();
                }
                
                
            } else {
                
                if (current.getRight() == null) {
                    current.setRight(  new TreeNode(newItem) );
                    return;  // New item has been added to the tree.
                } else {
                    current = current.getRight();
                }
            }
            
        } // end while
        
    }  // end treeInsert()
    
    
    @Override
    public boolean contains(int item) {
        TreeNode current = root;    // Start at the root node.
        
        while (true) {
            
            if (current == null) {
                return false;   // Stop when null
            } else if ( item == current.getValue() ) {
                return true;    // But if we find the item
            } else if ( item < current.getValue() ) {
                current = current.getLeft();
            } else {
                current = current.getRight() ;
            }
        }  // end while
        
    } 

    
    

}

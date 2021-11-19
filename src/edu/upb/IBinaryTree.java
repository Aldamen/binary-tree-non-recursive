/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb;

/**
 *
 * @author Carlos Humberto
 */
public interface IBinaryTree<T> {

    public TreeNode getRoot();
    
    public void insertTreeNode(int value);
    
    public boolean contains(int value);
    

}

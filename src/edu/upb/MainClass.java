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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        BinaryTreeImpl bt = new BinaryTreeImpl();

        bt.insertTreeNode(6);
        bt.insertTreeNode(4);
        bt.insertTreeNode(8);
        bt.insertTreeNode(3);
        bt.insertTreeNode(5);
        bt.insertTreeNode(7);
        bt.insertTreeNode(9);
        
        TreeIterator.traversePreOrder(bt.getRoot());
        
    }
    
}

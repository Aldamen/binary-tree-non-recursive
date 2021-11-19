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
class TreeNode {

    private int value;
    private TreeNode left;
    private TreeNode right;
    private int height;
    private int size;

    public TreeNode(int value) {
        this(value, null, null);
    }

    public TreeNode(int value ,TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.height = 1;
        calculateSize();
    }

    public int getValue() {
        return value;
    }

    public int setValue(int value) {
        return this.value = value;
    }
    
    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public int getHeight() {
        return height;
    }

    public void setElement(int value) {
        this.value = value;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSize() {
        return size;
    }

    public void calculateSize() {
        this.size = 1;
        if (left != null) {
            size += left.getSize();
        }
        if (right != null) {
            size += right.getSize();
        }
    }

}

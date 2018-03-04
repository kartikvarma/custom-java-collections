package com.kbv.advanced.collections;

public class TreeNode<T> {

  private T t;

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public TreeNode<T> getLeft() {
    return left;
  }

  public void setLeft(TreeNode<T> left) {
    this.left = left;
  }

  public TreeNode<T> getRight() {
    return right;
  }

  public void setRight(TreeNode<T> right) {
    this.right = right;
  }

  private TreeNode<T> left;
  private TreeNode<T> right;

  public TreeNode(T t){
    this.t = t;
    left = null;
    right = null;
  }

  public TreeNode(T t, TreeNode<T> left, TreeNode<T> right){
    this.t = t;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return this.t.toString()+ " ";
  }
}

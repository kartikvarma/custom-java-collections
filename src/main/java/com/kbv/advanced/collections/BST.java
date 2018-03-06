package com.kbv.advanced.collections;

public class BST<T extends Comparable<T>> extends BinarySearchTreeImpl<T> {


  private TreeNode<T> root;

  public void insert(T t) {
    this.root = super.insert(t, this.root);
  }

  public void delete(T t){
    super.delete(t, this.root);
  }

  public boolean search(T t) {
    return super.search(t, this.root);
  }


  public long height() {
    return super.height(this.root);
  }


  public boolean isEmpty() {
    return super.isEmpty(this.root);
  }

  public void print() {
     super.prettyPrint(this.root, 0, System.out);
  }
}

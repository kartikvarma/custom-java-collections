package com.kbv.advanced.collections;

public class BinarySearchTreeImpl<T extends Comparable<T>> implements BinarySearchTree<T> {

  private TreeNode<T> root;

  @Override
  public void insert(T t) {
    if(root == null) {
      root = new TreeNode<>(t, null, null);
    }
    else if (t.compareTo(root.getT()) < 0){
      TreeNode<T> left = new TreeNode<>(t, null, null);
      root.setLeft(left);
    }
    else{
      TreeNode<T> right = new TreeNode<>(t, null, null);
      root.setRight(right);
    }

  }

  @Override
  public void delete(T t) {



  }

  @Override
  public boolean search(T t) {
    return false;
  }

  @Override
  public long height() {
    return heightOfTree(root);
  }

  private long heightOfTree(TreeNode<T> root){

    if(root == null){
      return 0;
    }

    long leftHeight = heightOfTree(root.getLeft());
    long rightHeight = heightOfTree(root.getRight());

    return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;

  }


}

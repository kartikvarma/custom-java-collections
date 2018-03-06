package com.kbv.advanced.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintStream;

public class BinarySearchTreeImpl<T extends Comparable<T>> implements BinarySearchTree<T> {

  private final static Logger LOG = LoggerFactory.getLogger(BinarySearchTreeImpl.class);

  @Override
  public TreeNode<T> insert(T t, TreeNode<T> root) {
    if (root == null) {
       return new TreeNode<>(t, null, null);
    } else if (t.compareTo(root.getT()) < 0) {
      root.setLeft(insert(t, root.getLeft()));
    } else if (t.compareTo(root.getT()) > 0) {
      root.setRight(insert(t, root.getRight()));
    }
    return root;
  }


  @Override
  public void delete(T t, TreeNode<T> root){
    if (isEmpty(root)) {
      LOG.error("Empty Tree");
    }

    if (t.compareTo(root.getT()) < 0) {
      delete(t, root.getLeft());
    } else if (t.compareTo(root.getT()) > 0) {
      delete(t, root.getRight());
    } else {

    }

  }


  @Override
  public boolean search(T t, TreeNode<T> root) {
    return false;
  }

  @Override
  public long height(TreeNode<T> root) {

    if (root == null) {
      return 0;
    }

    long leftHeight = height(root.getLeft());
    long rightHeight = height(root.getRight());

    return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;

  }

  @Override
  public boolean isEmpty(TreeNode<T> root) {
    return root == null;
  }

  @Override
  public void prettyPrint(TreeNode<T> root, int indent, PrintStream out) {
    if(root != null){

      if(root.getRight() != null){
        prettyPrint(root.getRight(), indent+2, out);
      }

      if(indent > 0){
        out.print(String.format("%s ",setTabWidth(indent)));
      }

      if(root.getRight() != null){
        out.print(String.format("\t/\n%s ",setTabWidth(indent)));
      }

      out.print(root.getT()+"\n");

      if(root.getLeft() != null){
        out.print(String.format("%s\t\\\n",setTabWidth(indent)));
        prettyPrint(root.getLeft(), indent+2, out);
      }
    }
  }

  private String setTabWidth(int width){
    StringBuilder tabWidth = new StringBuilder();
    for (int i = 0; i < width; i++) {
      tabWidth.append('\t');
    }
    return tabWidth.toString();
  }


}

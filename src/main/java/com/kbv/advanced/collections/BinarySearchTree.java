package com.kbv.advanced.collections;

import java.io.PrintStream;

public interface BinarySearchTree<T> {
  /**
   * insert function will insert the element into the Binary Tree based on the values
   * when the value is less than root the values are inserted to left
   * when the value is greater than root then the values are inserted to right
   *
   * @param t - Generic Type
   */
  TreeNode<T> insert(T t, TreeNode<T> root);

  /**
   * @param t - Generic Type
   * @throws Exception
   */
  void delete(T t, TreeNode<T> root) throws Exception;

  boolean search(T t, TreeNode<T> root);

  long height(TreeNode<T> root);

  boolean isEmpty(TreeNode<T> root);

  void prettyPrint(TreeNode<T> root, int indent, PrintStream stream);
}

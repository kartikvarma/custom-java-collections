package com.kbv.advanced.collections;

public interface BinarySearchTree<T> {
  /**
   * insert function will insert the element into the Binary Tree based on the values
   * when the value is less than root the values are inserted to left
   * when the value is greater than root then the values are inserted to right
   * @param t - Generic Type
   */
  void insert(T t);
  void delete(T t);
  boolean search(T t);
  long height();
}

package com.kbv.advanced.collections;

import com.kbv.advanced.collections.BinarySearchTreeImpl;

public class BST<T extends Comparable<T>> extends BinarySearchTreeImpl<T> {

  public void insert(T t){
    super.insert(t);
  }
  public void delete(T t){
    super.delete(t);
  }
  public boolean search(T t){
    return super.search(t);
  }
  public long height(){
    return super.height();
  }
}

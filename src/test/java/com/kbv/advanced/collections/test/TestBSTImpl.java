package com.kbv.advanced.collections.test;

import com.kbv.advanced.collections.BST;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestBSTImpl {

  private static BST<Integer> fullBST;
  private static BST<Integer> genericBST;


  @BeforeAll
  public static void setUp(){
    fullBST = new BST<>();

    fullBST.insert(5);
    fullBST.insert(10);
    fullBST.insert(3);
    fullBST.insert(4);
    fullBST.insert(1);
    fullBST.insert(11);
    fullBST.insert(8);

    genericBST = new BST<>();
    genericBST.insert(15);
    genericBST.insert(10);
    genericBST.insert(20);
    genericBST.insert(25);
    genericBST.insert(8);
    genericBST.insert(12);
    genericBST.insert(30);

  }

  @Test
  public void test_bst() {
    genericBST.print();
    System.out.println("\n\nHeight of binary tree : " + genericBST.height()+"\n\n");
  }


  @Test
  public void test_bst_random() {

    BST<Integer> bst = new BST<>();

    for(int i = 0; i < 10; i++){
      int min = 1; int max = 20;
      int value = (int)(Math.random()*(max - min)) + min;
      bst.insert(value);
    }
    bst.print();
    System.out.println("\n\nHeight of binary tree : " + bst.height()+"\n\n");

  }

  @Test
  public void test_print_full_bst() {
    fullBST.print();
    System.out.println("\n\nHeight of binary tree : " + fullBST.height()+"\n\n");
  }

  @Test
  public void test_find_min() {
    System.out.println("Minimum value in Full BST : "+fullBST.findMinValue()+"\n");
    System.out.println("Minimum value in Generic BST : "+genericBST.findMinValue()+"\n");
  }

  @Test
  public void test_delete_node_fullBST(){
    fullBST.delete(1);
    System.out.println("Minimum value in Full BST : "+fullBST.findMinValue());
  }

  @Test
  public void test_delete_node_with_1_child_strictBST(){
    genericBST.delete(20);
    System.out.println("Minimum value in BST : "+genericBST.findMinValue());
  }

  @Test
  public void test_delete_node_with_2_children_strictBST(){
    genericBST.delete(10);
    genericBST.print();
    System.out.println("Minimum value in BST : "+genericBST.findMinValue());
  }



}

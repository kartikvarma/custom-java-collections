package om.kbv.advanced.collections;


import com.kbv.advanced.collections.BST;
import org.junit.Test;

import java.util.Random;

public class TestBSTImpl {

  @Test
  public void test_bst() {

    BST<Integer> bst = new BST<>();

    bst.insert(15);
    bst.insert(10);
    bst.insert(20);
    bst.insert(25);
    bst.insert(8);
    bst.insert(12);
    bst.insert(30);

    bst.print();

    System.out.println("\nHeight of binary tree : " + bst.height());

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

    System.out.println("\nHeight of binary tree : " + bst.height());

  }

  @Test
  public void test_print_full_bst() {

    BST<Integer> bst = new BST<>();

    bst.insert(5);
    bst.insert(10);
    bst.insert(3);
    bst.insert(4);
    bst.insert(1);
    bst.insert(11);
    bst.insert(8);

    bst.print();

    System.out.println("\nHeight of binary tree : " + bst.height());

  }

}

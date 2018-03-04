package om.kbv.advanced.collections;


import com.kbv.advanced.collections.BST;
import org.junit.Test;

public class TestBSTImpl {

  @Test
  public void test_bst(){

    BST<Integer> bst = new BST<>();

    bst.insert(15);
    bst.insert(10);
    bst.insert(20);
    bst.insert(25);
    bst.insert(8);
    bst.insert(12);
    bst.insert(30);

    System.out.println("Height of binary tree : "+bst.height());

  }

}

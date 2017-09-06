package org.water.practice.gohigher.algorithm;

import org.junit.Test;
import org.water.practice.gohigher.BaseTest;
import org.water.practice.gohigher.algorithm.leetcode.TreeNode;

import static org.junit.Assert.*;

/**
 * Created by water on 9/5/17.
 */
public class TreeTraversalTest extends BaseTest {



  @Test
  public void testTraversal() {
    TreeTraversal treeTraversal = new TreeTraversal();

    TreeNode treenode1 =new TreeNode(1);

    TreeNode treenode2 =new TreeNode(2);

    TreeNode treenode3 =new TreeNode(3);
    TreeNode treenode4 =new TreeNode(4);
    TreeNode treenode5 =new TreeNode(5);

    treenode1.left = treenode2;
    treenode1.right = treenode3;

    treenode2.left = treenode4;
    treenode3.right = treenode5;

    System.out.println();

    System.out.println("********");
    treeTraversal.preOrderTraversal(treenode1);


  }

  @Test
  public void testInOrder() {
    TreeTraversal treeTraversal = new TreeTraversal();

    TreeNode treenode1 =new TreeNode(1);

    TreeNode treenode2 =new TreeNode(2);

    TreeNode treenode3 =new TreeNode(3);
    TreeNode treenode4 =new TreeNode(4);
    TreeNode treenode5 =new TreeNode(5);
    treenode1.left = treenode2;
    treenode1.right = treenode3;

    treenode2.left = treenode4;
    treenode3.right = treenode5;



    System.out.println("********");
    treeTraversal.inOrderTraversal(treenode1);


  }

  @Test
  public void testPostOrder() {
    TreeTraversal treeTraversal = new TreeTraversal();

    TreeNode treenode1 =new TreeNode(1);

    TreeNode treenode2 =new TreeNode(2);

    TreeNode treenode3 =new TreeNode(3);
    TreeNode treenode4 =new TreeNode(4);
    TreeNode treenode5 =new TreeNode(5);
    treenode1.left = treenode2;
    treenode1.right = treenode3;

    treenode2.left = treenode4;
    treenode3.right = treenode5;

    System.out.println("********");
    treeTraversal.postOrderTraversal(treenode1);

  }




}
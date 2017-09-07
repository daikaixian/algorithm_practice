package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;
import org.water.practice.gohigher.algorithm.TreeTraversal;

import static org.junit.Assert.*;

/**
 * Created by water on 9/6/17.
 */
public class InvertBinaryTreeTest {

  @Test
  public void testInvertTree() throws Exception {

    InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

    TreeNode treeNode1 = new TreeNode(4);
    TreeNode treeNode2 = new TreeNode(2);
    TreeNode treeNode3 = new TreeNode(7);
    TreeNode treeNode4 = new TreeNode(1);
    TreeNode treeNode5 = new TreeNode(3);
    TreeNode treeNode6 = new TreeNode(6);
    TreeNode treeNode7 = new TreeNode(9);

    treeNode1.left = treeNode2;
    treeNode1.right =treeNode3;

    treeNode2.left=treeNode4;
    treeNode2.right=treeNode5;

    treeNode3.left=treeNode6;
    treeNode3.right=treeNode7;



    TreeNode result = invertBinaryTree.invertTree(treeNode1);

    TreeTraversal treeTraversal = new TreeTraversal();
    treeTraversal.preOrderTraversal(result);




  }
}
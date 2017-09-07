package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by water on 9/6/17.
 */
public class ValidateBinarySearchTreeTest {

  @Test
  public void testIsValidBST() throws Exception {

    ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

    TreeNode treeNode1 = new TreeNode(2);
    TreeNode treeNode2 = new TreeNode(1);
    TreeNode treeNode3 = new TreeNode(3);

    treeNode1.left = treeNode2;
    treeNode1.right = treeNode3;


    Assert.assertTrue(validateBinarySearchTree.isValidBST(treeNode1));


    TreeNode treeNode4 = new TreeNode(2);
    TreeNode treeNode5 = new TreeNode(1);
    TreeNode treeNode6 = new TreeNode(3);

    treeNode5.left = treeNode4;
    treeNode5.right = treeNode6;

    Assert.assertFalse(validateBinarySearchTree.isValidBST(treeNode5));

  }
}
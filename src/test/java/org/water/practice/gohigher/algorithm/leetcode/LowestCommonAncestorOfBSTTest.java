package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;

/**
 * Created by water on 9/11/17.
 */
public class LowestCommonAncestorOfBSTTest {

  @Test
  public void testLowestCommonAncestor() throws Exception {

    LowestCommonAncestorOfBST lowestCommonAncestorOfBST = new LowestCommonAncestorOfBST();

    TreeNode treeNode1 =new TreeNode(1);
    TreeNode treeNode2 =new TreeNode(2);
    TreeNode treeNode3 =new TreeNode(3);

    treeNode1.left = treeNode2;
    treeNode1.right =treeNode3;

    TreeNode treeNode = lowestCommonAncestorOfBST.lowestCommonAncestorOfBST(treeNode1, treeNode2, treeNode3);

    System.out.println(treeNode.val);

  }
}
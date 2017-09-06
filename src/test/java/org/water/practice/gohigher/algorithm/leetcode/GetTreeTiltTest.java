package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 9/5/17.
 */
public class GetTreeTiltTest {

  @Test
  public void testFindTilt() throws Exception {

    TreeNode treeNode1 = new TreeNode(1);

    TreeNode treeNode2 = new TreeNode(2);
    TreeNode treeNode3 = new TreeNode(3);

    treeNode1.left = treeNode2;
    treeNode1.right = treeNode3;

    GetTreeTilt getTreeTilt = new GetTreeTilt();
    System.out.println("*********");
    System.out.println(getTreeTilt.findTilt(treeNode1));




  }
}
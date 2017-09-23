package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 9/10/17.
 */
public class BreadthFirstTraversalOfBinaryTreeTest {

  @Test
  public void testBreadthFirstTraversal() throws Exception {

    BreadthFirstTraversalOfBinaryTree breadthFirstTraversalOfBinaryTree =
        new BreadthFirstTraversalOfBinaryTree();

    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    TreeNode node6 = new TreeNode(6);
    TreeNode node7 = new TreeNode(7);

    node1.left= node2;
    node1.right= node3;

    node2.left= node4;
    node3.left= node5;
    node3.right = node7;
    node4.left= node6;


    // 应该是1,2,3,4,5,7,6,

    breadthFirstTraversalOfBinaryTree.breadthFirstTraversal(node1);


    System.out.println("*********************");
    //深度遍历?
    //应该是1,2,4,6,3,5,7
    breadthFirstTraversalOfBinaryTree.depthFirstTraversal(node1);

  }
}
package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/6/17.
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 *
 *
 *
 *
 */
public class MaximumDepthOfBinaryTree {


  /**
   * 1.最大深度,是空就为0.
   *
   * 2.思路 1:dfs 求出所有节点深度?放在数组中?排序?
   *       2. 递归,求出左右子数的最大深度,+1
   *
   *
   *
   *
   */
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

  }









}

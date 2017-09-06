package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/5/17.
 */
public class GetTreeTilt {


  /**
   * 1.找出左节点的总和和右节点的总和.求差的绝对值值. -- >题意没有弄清楚额.
   *
   *
   * 2. 思路 ,一.从root节点开始遍历.
   *         二. 递归?  得用递归.
   *
   *
   */
  public int findTilt(TreeNode root) {
    int tilt = 0;
    int leftSumCount = 0;
    int rightSumCount = 0;

    tilt = Math.abs(sum(root.left) - sum(root.right)) + root.val;

    return tilt;
  }

  private int sum(TreeNode node) {
    int result = 0;

    if (node !=null) {
      result += node.val + sum(node.left) + sum(node.right);
    }
    return result;

  }


}

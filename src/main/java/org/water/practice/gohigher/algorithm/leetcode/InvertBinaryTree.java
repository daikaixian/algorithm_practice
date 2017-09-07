package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/6/17.
 */
public class InvertBinaryTree {


  /**
   * 1.翻转一棵二叉树.
   *
   * 2. 思路,递归.
   *
   * 3. 时间复杂度? O(n) + O(Log N)
   *
   *
   *
   */
  public TreeNode invertTree(TreeNode root) {


    //recursion terminator

    //current level processing

    //drill down.

    //如何得到链表的中间节点?


    // 判断异常
    if (root == null) {
      return null;
    }

    //每一次要做的操作.
    if (root.left != null || root.right !=null) {
      TreeNode temp = root.left;
      root.left = root.right;
      root.right = temp;
    }

    //递归?
    invertTree(root.left);
    invertTree(root.right);

    return root;


  }

  /**
   * leetcode上别人的版本.高.
   *
   * @param root
   * @return
   */
  public TreeNode invertTree2(TreeNode root) {
    if(root == null){
      return null;
    }
    TreeNode temp = root.left;
    root.left = invertTree(root.right);
    root.right = invertTree(temp);

    return root;
  }
}

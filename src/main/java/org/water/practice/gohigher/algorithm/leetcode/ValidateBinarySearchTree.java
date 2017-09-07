package org.water.practice.gohigher.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by water on 9/6/17.
 *
 *
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {


  /**
   * 1.二叉搜索树, 一定要是全序有序.不能只单独判断每个节点的左孩子节点小于自己,右孩子节点大于自己.
   *
   * 2. 思路一:中序遍历 ,然后记录每一次遍历的值,对比上一次,是否是增加的.如果是, 就return true, 如果不是,就return false;
   *    思路二:?
   *
   * 3. 时间复杂度. O(n).
   *
   *
   *
   *
   */
  List<Integer> list = new ArrayList<>();
  boolean flag = true;
  public boolean isValidBST(TreeNode root) {
    inOrderTraversal(root);
    return flag;
  }

  private void inOrderTraversal(TreeNode root) {

    if (root == null) {
      return;
    }
    inOrderTraversal(root.left);

    if (list.size() > 0) {
      if (list.get(list.size() -1) >= root.val) {
        flag = false;
        return;
      }
      list.add(root.val);
    } else {
      list.add(root.val);
    }

    inOrderTraversal(root.right);

  }












}

package org.water.practice.gohigher.algorithm;

import org.water.practice.gohigher.algorithm.leetcode.TreeNode;

/**
 * Created by water on 9/5/17.
 */
public class TreeTraversal {


  //前序遍历
  public void preOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.println(root.val);
    preOrderTraversal(root.left);
    preOrderTraversal(root.right);


  }

  //中序遍历
  public void inOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrderTraversal(root.left);
    System.out.println(root.val);
    inOrderTraversal(root.right);


  }


  public void postOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }

    postOrderTraversal(root.left);
    postOrderTraversal(root.right);
    System.out.println(root.val);
  }



}

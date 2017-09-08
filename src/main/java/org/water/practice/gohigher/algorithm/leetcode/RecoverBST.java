package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/8/17.
 *
 *
 *
 *
 *
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * Recover the tree without changing its structure.
 * Note:
 * A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */




public class RecoverBST {


  TreeNode one = null;
  TreeNode two = null;
  TreeNode pre = new TreeNode(Integer.MIN_VALUE);

  public void recoverTree(TreeNode root) {

    //1.一颗二叉搜索树上有连个元素被交换了位置。修复它。

    //2.两个节点的值交换一下，就ok了。问题在于，怎么找到两个节点？ --》 中序遍历找到两个节点，一个是第一个比后面元素大的， 一个最后一个比前面元素小的。

    // 不会做。。。  -- >看了最高票答案，居然和我的思路一模一样。

    if(root == null) {
      return;
    }

    findWrongNode(root);

    if (one !=null && two !=null) {
      int tmp = one.val;
      one.val = two.val;
      two.val = tmp;
    }
  }

  private void findWrongNode(TreeNode root) {
    if (root == null) {
      return ;
    }
    findWrongNode(root.left);
    // 当前节点比上一个节点的值小，就找到了。

    if (one == null && pre.val > root.val) {
      one = pre;
    }
    if(one != null && pre.val> root.val){
      two = root; //two应该会被赋值两次
    }

    pre = root;

    findWrongNode(root.right);
    return ;
  }








}

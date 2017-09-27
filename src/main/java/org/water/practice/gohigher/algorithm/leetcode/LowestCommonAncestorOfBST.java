package org.water.practice.gohigher.algorithm.leetcode;


/**
 * Created by water on 9/7/17.
 */
public class LowestCommonAncestorOfBST {

  public TreeNode lowestCommonAncestorOfBST(TreeNode root, TreeNode p, TreeNode q) {

    // 思路1. 找出从root到p 和 q 全路径，然后求交集中最下的节点。
    // 思路2。上述的方式不管是不是二叉搜索树，都可以用上面的方法。现在既然是一颗二叉搜索树，就有一些特点可以用起来。
    //      如果两个节点都比根节点小，则在根节点的左子树上找.如果都比根节点大，则在右子树上找。
    //   如果一个大一个小，则就是这个节点。

    //递归  时间复杂度 ?

    if (root == null) {
      return null;
    }

    if (p.val > root.val && q.val < root.val) {
      return root;
    }
    if (p.val > root.val && q.val >root.val) {
      return lowestCommonAncestorOfBST(root.right, p, q);
    }
    if (p.val < root.val && q.val< root.val) {
      return lowestCommonAncestorOfBST(root.left, p, q);
    }
    // 剩下的情况 可能是q是p的父节点或者p是q的父节点。直接返回当前root就对了。
    return root;

  }


//  public TreeNode lowestCommonANCESTOROfBT(TreeNode root, TreeNode p, TreeNode q) {
//
//
//    //  现在不是平衡二叉树了.
//    // 只是颗普通的二叉树.
//
//  }

}

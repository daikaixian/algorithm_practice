package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/7/17.
 */
public class MinimunDepthOfBinaryTree {


  public int minDepth(TreeNode root) {
    // 1.如果给null 返回0？如果还有一层，返回1？

    // 2.遍历所有叶子节点，求出depth。取最小值
    //或者用递归的方式, 求出左子树的最小深度，求出右子树的最小深度。取最小的再加1.

    //第一次提交错误了，[1,2]应该输出2.
    // 所以首先一定得找出子节点。

    if(root == null) {
      return 0;
    }
    if(root.left != null && root.right == null) {
      return minDepth(root.left) + 1;
    }
    if(root.right != null && root.left == null) {
      return minDepth(root.right) + 1;
    }

    if(root.left != null && root.right!=null) {
      return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
    return 1;

//         if(root == null) {
//             return 0;
//         }
//         if(root.left == null && root.right==null) {
//             return 1;
//         }

//         int a = 0;
//         if(root.left != null) {
//            a = minDepth(root.left);
//         }
//         int b = 0;
//         if(root.right != null) {
//             b = minDepth(root.right);
//         }

//         if (a > 0&& b>0) {
//             return Math.min(a,b) + 1;
//         }

//         if(a == 0 && b>0) {
//             return b;
//         }
//         if(a>0 && b==0) {
//             return a;
//         }




  }


}

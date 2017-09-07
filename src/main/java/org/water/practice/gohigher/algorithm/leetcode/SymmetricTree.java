package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/7/17.
 */
public class SymmetricTree {
  public boolean isSymmetric(TreeNode root) {

    //  1.判断是否对称的标准是什么？ 子树是对称的，自己不一定是的。   中序遍历之后的数组是对称的。就是一颗对称树！ -->错误！

    // 2.思路 一。 中序遍历。然后检查数组对称性？
    //   思路二 ?  暂时没想到。
//         boolean ret = true;
//         inOrderTraversal(root);
//         int length = list.size();
//         for (int i =0; i<length; i ++) {
//             TreeNode a = list.get(i);
//             TreeNode b = list.get(length- 1 - i);
//             if(a !=null && b != null){
//                 if(a.val != b.val) {
//                     ret = false;
//                 }
//             }
//             if(a != null ||b !=null) {
//                 ret = false;
//             }

//         }
//         return ret;


    //上面的思路都错了，现在还是回到递归。
    //一棵树是否对称，关键看两颗子树是否对称。 然后两颗数的root节点的值是否相等。

    return isSymmertricNodes(root, root);

  }

  private boolean isSymmertricNodes(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null) {
      return true;
    }
    if (root1 ==null || root2 == null) {
      return false;
    }
    return (root1.val == root2.val) && isSymmertricNodes(root1.left, root2.right) && isSymmertricNodes(root1.right, root2.left);


  }


  // private void inOrderTraversal(TreeNode root) {
  //     if (root == null) {
  //         list.add(null);
  //         return ;
  //     }
  //     inOrderTraversal(root.left);
  //     list.add(root);
  //     inOrderTraversal(root.right);
  //     return;
  // }

}
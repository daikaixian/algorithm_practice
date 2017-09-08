package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/8/17.
 */
public class FlattenBinaryTreeToLinkedList {


  // 前序遍历该树，每个新的node作为上一个node的右子树。

  // in-place是个什么要求？ 有点难。先用简单的做出来。 -- > 如果是in-place的，即使我改变了root的指向，可能也不会有效？

  // 所以必须应该是inplace的。


  public void flatten(TreeNode root) {
  if (root == null) return;

  TreeNode left = root.left;
  TreeNode right = root.right;

  root.left = null;  //设置左孩子为null

  flatten(left);
  flatten(right);

  root.right = left; // 右孩子为左子树
  TreeNode cur = root;
  while (cur.right != null) cur = cur.right;   //遍历找到左子树的最后一个节点。
  cur.right = right;  //连接子树。

//         if (root == null) {
//             return ;
//         }

//         TreeNode dummyNode = new TreeNode(0);

//         preOrderTraversal(root, dummyNode);

//         root = dummyNode.right;

}

//     private void preOrderTraversal(TreeNode root,TreeNode linkedNode ) {

//         if(root == null) {
//             return ;
//         }
//         TreeNode tmp = new TreeNode(root.val);
//         linkedNode.left = null;
//         linkedNode.right = tmp;
//         linkedNode = tmp;
//         preOrderTraversal(root.left, linkedNode);
//         preOrderTraversal(root.right, linkedNode);


// }

}

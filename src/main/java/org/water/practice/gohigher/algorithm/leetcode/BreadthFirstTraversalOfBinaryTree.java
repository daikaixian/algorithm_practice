package org.water.practice.gohigher.algorithm.leetcode;

import java.util.*;

/**
 * Created by water on 9/10/17.
 */
public class BreadthFirstTraversalOfBinaryTree {

  public void breadthFirstTraversal(TreeNode root) {

    //天呐,linkedlist 居然是个queue.
    Queue<TreeNode> queue = new LinkedList<>();

    queue.add(root);
//    queue.offer()  //在某些情况下比add好.
    List list = new ArrayList<>();
    list.add(0,1);
    while (!queue.isEmpty()) {

      TreeNode node = queue.poll();  // 精彩.
      System.out.println(node.val);

      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }

    }

  }


  // 深度优先遍历 非递归.  前序
  // 啊...居然不会做.
  // 要加深印象了.
  public void depthFirstTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();

    stack.push(root);

    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      System.out.println(node.val);

      if (node.right !=null) {
        stack.push(node.right);
      }

      if (node.left !=null) {
        stack.push(node.left);
      }
    }

    // 核心思想,借助stack实现,首先将root 节点推进树中,  然后循环调用, 当栈不为空时,弹出栈中顶端节点,
    // 再将当前节点的右孩子节点推进树种,然后将左孩子节点推进树中.




  }


}

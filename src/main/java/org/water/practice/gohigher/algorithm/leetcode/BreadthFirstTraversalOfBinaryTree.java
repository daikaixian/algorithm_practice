package org.water.practice.gohigher.algorithm.leetcode;

import java.util.*;

/**
 * Created by water on 9/10/17.
 */
public class BreadthFirstTraversalOfBinaryTree {

  /**
   * 非递归实现.
   * @param root
   */
  public void breadthFirstTraversal(TreeNode root) {

    //天呐,linkedlist 居然是个queue.
    Queue<TreeNode> queue = new LinkedList<>();

    queue.add(root);
//    queue.offer()  //在某些情况下比add好.
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

  /**
   * 可否递归实现bfs? //我觉得好像不能递归实现广度优先遍历.
   * @param root
   * 应该是确实不存在,递归版本的广度优先遍历.
   */
  public void breadthFirstTraversal2(TreeNode root) {

  }


  /**
   * 前序遍历 算是非递归遍历中 最简单的.
   * @param root
   */
  public void preOrderDepthFirstTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();

    stack.push(root);

    while (!stack.isEmpty()) {   ///前序,更换一下push的顺序,就会变成不同顺序的遍历.
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

  /**
   * 非递归版,中序遍历. 比起前序遍历,理解起来要复杂一些了.
   *
   */
  public void inOrderDepthFirstTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode tmp = root;

    while (!stack.isEmpty() || tmp != null) {   //试试中序遍历
      while(tmp != null){
        stack.push(tmp);
        tmp =tmp.left;
      }

      tmp = stack.pop();
      System.out.println(tmp.val); //打印.

      tmp= tmp.right;
    }
  }


  /**
   * 非递归版. 后序遍历.
   *
   */
  public void postOrderDepthFirstTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode tmp = root;
    TreeNode lastVisit = root;

    while (!stack.isEmpty() || tmp != null) {
      while (tmp !=null) {
        stack.push(tmp);
        tmp = tmp.left;
      }

      tmp = stack.peek();

      if (tmp.right == null || tmp.right == lastVisit) {  //说明没有右子树了 或者右子树已经访问过了.

        System.out.println(tmp.val);  //可以访问了
        lastVisit = stack.pop();
        tmp =null;

      } else {
        tmp = tmp.right;
      }

    }



  }

}

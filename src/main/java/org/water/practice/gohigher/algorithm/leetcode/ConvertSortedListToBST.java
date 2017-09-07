package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/7/17.
 *
 * 写了一个小时....
 *
 */
public class ConvertSortedListToBST {

  public TreeNode sortedListToBST(ListNode head) {

    // 递归解决。
    if (head == null) {
      return null;
    }
    if (head.next == null) {
      return new TreeNode(head.val);
    }

    return toBST(head, null);

  }

  private TreeNode toBST(ListNode head, ListNode tail) {

    //1.递归终止条件，
    if (head == tail) {
      return null;
    }

    //2.当前层要做的事: 找到中间node, 当作root,  再从剩下的元素中 ，找到当前树的左右孩子节点。
    ListNode walker = head;
    ListNode runner = head;

    while (runner != tail && runner.next != tail) {
      walker = walker.next;
      runner = runner.next.next;
    }
    TreeNode rootTreeNode = new TreeNode(walker.val);

    //3.往下走.
    rootTreeNode.left = toBST(head, walker);
    rootTreeNode.right = toBST(walker.next, tail);
    return rootTreeNode;

  }


}

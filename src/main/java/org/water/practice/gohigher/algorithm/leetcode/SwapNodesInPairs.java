package org.water.practice.gohigher.algorithm.leetcode;

import java.util.List;

/**
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * 两两翻转,不可以改变node的值.
 *
 *
 *  1.阐述清楚题目的意思, 链表长度为奇数怎么办?
 *
 *  2.最直接的想法,两两一处理.   -->时间复杂度 O(n).
 *
 *  3.coding
 *
 *  4. ut
 *
 *
 *
 *
 */
public class SwapNodesInPairs {

  public ListNode swapPairs(ListNode head) {
    ListNode ret = head;
    if (head == null || head.next == null) {
      return ret;
    }

    ListNode first = head;

    ListNode second = first.next;
    ret = second;
    ListNode pre = new ListNode(0); //辅助

    while (first != null && second != null) {

      ListNode tmp = second.next;
      second.next = first;
      first.next = tmp;


      pre.next = second;
      pre = first;



      first = first.next;
      if (first != null) {
        second = first.next;
      } else {
        second = null;
      }


    }


    return ret;

  }


}

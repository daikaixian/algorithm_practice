package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/1/17.
 */
public class ReverseSinglyLinkedList {

  /**
   * 1.
   *
   * 2. 直接暴力翻转.  时间复杂度 O(n)
   *
   * 3.
   *
   *
   * @param head
   * @return
   */

  public ListNode reverseList(ListNode head) {

    ListNode pre = null;

    while(head != null) {    //防御空链表.

      if (head.next == null) {    //到底了
        head.next = pre;
        break;
      }
      ListNode tmp = head.next;
      head.next = pre;
      pre = head;
      head = tmp;

    }
    return head;
  }

}



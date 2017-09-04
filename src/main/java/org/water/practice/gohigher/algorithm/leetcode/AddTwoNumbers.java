package org.water.practice.gohigher.algorithm.leetcode;


/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * 243 + 564 = 807

*/
 public class AddTwoNumbers {


  /**
   * 1.理清楚问题:两个非负数,  都不是以0开头的,除了0本身.数据存放方向与正常相反,比如例子中, 2-4-3 = 342. 5-6-4=465.
   *
   *
   *   其实输入的是两个linklist 的头结点,然后返回也要返回头结点.
   *
   *
   *
   *
   * 2.  思路一: 相加 进1, 生产新的节点,加在后面.
   *     思路二: 借鉴别人的,
   *
   * 3. 时间复杂度:    O(max(m,n)) -- >O(n).   m和n分别是l1和l2的长度.  空间复杂度也是O(max(m,n)) --> O(n)
   * 4.
   *
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode current = dummyHead;

    int plus = 0;
    while (l1 != null || l2!= null) {
      int sum = 0;

      if (l1 != null) {
        sum += l1.val;
      }

      if (l2 != null){
        sum += l2.val;
      }
      sum = sum + plus;
      plus = sum / 10;  //下一轮的plus.
      sum = sum % 10;   // 余数.

      ListNode newNode = new ListNode(sum);
      current.next = newNode;
      current = newNode;

      l1 = (l1 == null ? l1: l1.next);
      l2 = (l2 == null ? l2: l2.next);

    }
    if (plus > 0 ){
      ListNode newNode = new ListNode(plus);
      current.next = newNode;
    }



    return dummyHead.next;
  }



}




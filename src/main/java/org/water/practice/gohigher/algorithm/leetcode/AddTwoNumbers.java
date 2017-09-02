package org.water.practice.gohigher.algorithm.leetcode;


/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * 243 + 465 = 708

*/
 public class AddTwoNumbers {


  /**
   * 1.理清楚问题:两个非负数,  数据存的是相反的方向,那是第二个数组和第一个数组是反向咯.以第一个数组为正向.
   *   然后,都不是以0开头的,除了0本身.
   *
   *   其实输入的是两个linklist 的头结点,然后返回也要返回头结点.
   *
   *
   * 2.  思路: 把第一个listNode转换为整数, 把第二个list反转之后,再转换换成整数,相加后,转换成listNode,然后返回head节点.
   *
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {



      return new ListNode(3);
  }



}




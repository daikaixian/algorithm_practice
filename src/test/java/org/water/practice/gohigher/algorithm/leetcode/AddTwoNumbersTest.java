package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 9/3/17.
 */
public class AddTwoNumbersTest {

  /**
   *
   * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
   * Output: 7 -> 0 -> 8
   *
   * @throws Exception
   */
  @Test
  public void testAddTwoNumbers() throws Exception {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(4);
    ListNode node3 = new ListNode(3);

    node1.next = node2;
    node2.next = node3;


    ListNode node4 = new ListNode(5);
    ListNode node5 = new ListNode(6);
    ListNode node6 = new ListNode(4);
    node4.next =node5;
    node5.next=node6;

    ListNode result = addTwoNumbers.addTwoNumbers(node1, node4);
    System.out.println(result.val);
    System.out.println(result.next.val);
    System.out.println(result.next.next.val);

  }


  @Test
  public void testAddTwoNumbers2() throws Exception {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(4);
    ListNode node3 = new ListNode(3);

    node1.next = node2;
    node2.next = node3;


    ListNode node4 = new ListNode(5);
    ListNode node5 = new ListNode(6);
    ListNode node6 = new ListNode(4);
    ListNode node7 = new ListNode(8);
    node4.next =node5;
    node5.next=node6;
    node6.next=node7;

    ListNode result = addTwoNumbers.addTwoNumbers(node1, node4);
    System.out.println(result.val);
    System.out.println(result.next.val);
    System.out.println(result.next.next.val);
    System.out.println(result.next.next.next.val);

  }


  @Test
  public void testAddTwoNumbers3() throws Exception {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    ListNode node1 = new ListNode(5);



    ListNode node4 = new ListNode(5);


    ListNode result = addTwoNumbers.addTwoNumbers(node1, node4);
    System.out.println(result.val);
    System.out.println(result.next.val);


  }


}
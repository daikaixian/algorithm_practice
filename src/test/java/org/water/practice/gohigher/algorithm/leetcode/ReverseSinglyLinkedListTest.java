package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 9/1/17.
 */
public class ReverseSinglyLinkedListTest {

  ListNode head = new ListNode(1);

  @Before
  public void setUp() throws Exception {
    ListNode second = new ListNode(2);
    head.next = second;

    ListNode third = new ListNode(3);
    second.next = third;


  }

  @Test
  public void testReverseList() throws Exception {

    ReverseSinglyLinkedList reverseSinglyLinkedList = new ReverseSinglyLinkedList();


    ListNode node = reverseSinglyLinkedList.reverseList(head);

    System.out.println("*****************");
    System.out.println(node.val);
    System.out.println(node.next.val);
    System.out.println(node.next.next.val);

    head.next =null;

    ListNode node1 = reverseSinglyLinkedList.reverseList(head);

    System.out.println("*****************");
    System.out.println(node1.val);


    ListNode node2 = reverseSinglyLinkedList.reverseList(null);
    System.out.println("*****************");
    System.out.println(node2);



    ListNode listNode = new ListNode(99);
    head.next = listNode;
    ListNode node3 = reverseSinglyLinkedList.reverseList(head);
    System.out.println("*****************");
    System.out.println(node3.val);
    System.out.println(node3.next.val);






  }
}
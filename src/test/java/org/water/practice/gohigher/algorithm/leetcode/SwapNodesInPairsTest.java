package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 9/2/17.
 */
public class SwapNodesInPairsTest {

  @Before
  public void setUp() {


  }

  @Test
  public void testSwapPairs() throws Exception {

    SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();


    ListNode head = null;
    Assert.assertNull(swapNodesInPairs.swapPairs(head));

    ListNode head2 = new ListNode(1);
    Assert.assertEquals(1, swapNodesInPairs.swapPairs(head2).val);



    ListNode head3= new ListNode(1);
    ListNode second= new ListNode(2);
    head3.next = second;
    second.next = null;

    Assert.assertEquals(2, swapNodesInPairs.swapPairs(head3).val);

    ListNode head4= new ListNode(1);
    ListNode second2= new ListNode(2);
    head4.next = second2;
    ListNode third = new ListNode(3);
    second2.next = third;
    third.next = null;

    Assert.assertEquals(2, swapNodesInPairs.swapPairs(head4).val);


    ListNode head5= new ListNode(1);
    ListNode second3= new ListNode(2);
    head5.next = second3;
    ListNode third2 = new ListNode(3);
    second3.next = third2;
    ListNode forth = new ListNode(4);
    third2.next = forth;

    ListNode result = swapNodesInPairs.swapPairs(head5);
    System.out.println("*************");
    System.out.println(result.val);
    System.out.println(result.next.val);
    System.out.println(result.next.next.val);
    System.out.println(result.next.next.next.val);







  }
}
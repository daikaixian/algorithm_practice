package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/9/17.
 */
public class MergeKSortedList {

  public ListNode mergeKLists(ListNode[] lists) {
    //合并k个。
    //思路 ： 两两合并。  或者分治，从中间切开，两个list合并，最后返回一个合好的Node.

    // 时间复杂度可能有点高.?怎么分析?

    if(lists == null || lists.length ==0 ) {
      return null;
    }

    if(lists.length == 1) {
      return lists[0];
    }

    if (lists.length == 2) {
      return mergeTwoLists(lists[0], lists[1]);
    }
    int l = lists.length;
    ListNode[] partOne = new ListNode[l / 2 ] ;
    ListNode[] partTwo = new ListNode[l - l / 2] ;

    for(int i = 0; i<l; i++) {
      if( i< l/2) {
        partOne[i] = lists[i];
      } else {
        partTwo[i-l/2] = lists[i];
      }
    }

    return mergeTwoLists(mergeKLists(partOne), mergeKLists(partTwo));

  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //1. 两个有序列表，合并成一个有序列表。

    // 2. 思路 1.丢进堆里，排好序了，一个个吐出来。
    // 思路 2.拿两个链表最小的元素 做比较，用更小的当链表的头，一个个遍历完两个List. --> 就是他了。

    // 时间复杂度, 递归和迭代的怎么算? 迭代的   是O(m+n).

    ListNode dummyNode;

    ListNode point = new ListNode(0);
    dummyNode = point;

    if (l1 == null && l2 == null) {
      return null;
    }
    while(l1 !=null || l2 !=null) {

      if(l1 == null) {
        point.next = l2;
        break;
      }
      if(l2 ==null){
        point.next = l1;
        break;
      }

      if (l1.val <= l2.val) {
        point.next = l1;
        point = l1;

        l1 = l1.next;
      } else {
        point.next = l2;
        point = l2;

        l2 = l2.next;
      }
    }

    return dummyNode.next;
  }

}

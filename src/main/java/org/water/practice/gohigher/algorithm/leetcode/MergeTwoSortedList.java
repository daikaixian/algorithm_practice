package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/9/17.
 */
public class MergeTwoSortedList {

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


  /**
   * 递归的写法,也是超级精彩.
   * @param l1
   * @param l2
   * @return
   */
  public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

    if (l1 == null){
      return l2;
    }

    if (l2 == null){
      return l1;
    }

    if (l1.val < l2.val){
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    }

    l2.next = mergeTwoLists(l1, l2.next);
    return l2;


  }

}

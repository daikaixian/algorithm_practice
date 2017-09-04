package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/4/17.
 *
 * Follow up for "Remove Duplicates":
 What if duplicates are allowed at most twice?

 For example,
 Given sorted array nums = [1,1,1,2,2,3],

 Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3.
 It doesn't matter what you leave beyond the new length.
 *
 *
 */
public class RemoveDuplicates {

  /**
   * 1.没什么不清楚的. 但是 It doesn't matter what you leave beyond the new length.这句话不懂.
   *  2. 思路一,丢进hashmap. value为key , count 为 value. 最后遍历map, count>2的按两次算,遍历map之后,得出总的length.  --> O(n)
   *     思路二, 利用已经排好序了的数组的什么特性?
   *
   */

  public int removeDuplicates(int[] nums) {
    // 运用了有序数组中,最多重复k次,则num(n) > num(n-k)  [在n>k的情况下.]
    int i = 0;
    for (int n : nums)
      if (i < 2 || n > nums[i-2])
        nums[i++] = n;
    return i;

  }



}

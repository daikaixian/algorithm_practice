package org.water.practice.gohigher.algorithm.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by water on 8/31/17.
 */
public class FirstMissingPositive {


  /**
   * 找到第一个缺失的正整数.
   * 1.一个int 数组,找到缺失的最小的正整数.
   *
   * 2.思路 一.粗暴的,找出数组中最大的值.如果小于1, 则返回1. 如果大于1 ,则在1到max中间,找出不在该数组中的值就ok. O(n^2)
   *   思路 二. n+1个数的数组中,找出第一个正整数,O(n^2)
   *   思路三, 用hashset 替换 for循环查找,可以变成O(1). 然后整个就变成O(n)了.
   *
   * 3.
   *
   * 4.
   */
  public int getFirstMissingPositive(int[] nums) {


    for (int i = 1; i <= nums.length + 1; i++) {
      boolean flag = true;
      for (int j = 0; j < nums.length; j++) {

        if (i == nums[j]) {
          flag = false;
        }

      }
      if (flag) {
        return i;
      }

    }

    return 1;
  }

  public int getFirstMissingPositiveWithHashSet(int[] nums) {

    HashSet<Integer> mySet = new HashSet();
    for (int i :nums) {
      mySet.add(i);
    }


    for (int i = 1; i <= nums.length + 1; i++) {
      boolean flag = true;
      for (int j = 0; j < nums.length; j++) {
        if (mySet.contains(i)) {
          flag = false;
        }
      }
      if (flag) {
        return i;
      }
    }

    return 1;
  }

}

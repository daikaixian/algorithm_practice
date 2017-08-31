package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 8/31/17.
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    int n = nums.length;

    for (int i =0; i < n; i++) {
      int a = nums[i];
      int b = target - a;

      for (int j = i+1;j <n ; j++ ){
        if (b == nums[j]) {
          return new int [] {i, j};
        }

      }

    }

    return new int[2] ;

  }

}

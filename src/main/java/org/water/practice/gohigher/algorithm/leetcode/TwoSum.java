package org.water.practice.gohigher.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;

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


  /**
   * 更高效的方式.  O(n)
   *
   * 下面这个不能反悔index.只能反悔值啊.
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSum2(int[] nums, int target) {

    Arrays.sort(nums);

    int l = nums.length;
    int low = 0;
    int high = l -1;

    while (low < high) {

      if ((nums[low] + nums[high]) == target) {

        // 满足条件,记住答案

        while (low < high) {
          if (nums[low+1] == nums[low]) {
            low ++ ;
          }
        }
        while (low < high) {
          if (nums[high -1] == nums[high]) {
            high -- ;
          }
        }
        low ++;
        high--;

      } else if ((nums[low] + nums[high]) > target) {
        high --;
      } else {
        low++;
      }

    }

    return null;

  }


  /**
   * HASHMAP  o(N).
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSum3(int[] nums, int target) {

    HashMap map = new HashMap();

    for (int i =0; i< nums.length; i++) {

      map.put(nums[i], i);

    }

    for (int i =0; i< nums.length; i++) {

      int key = target - nums[i];

      int index = map.get(key) == null ? -1: (int) map.get(key);

      if (index > i) {
        return new int[]{i, index};
      }

    }

    return new int[2] ;

  }


}

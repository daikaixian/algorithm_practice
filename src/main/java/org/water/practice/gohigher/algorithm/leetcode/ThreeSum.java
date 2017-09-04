package org.water.practice.gohigher.algorithm.leetcode;

import com.sun.org.apache.regexp.internal.RE;

import java.util.*;

/**
 * Created by water on 9/3/17.
 *
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * Note: The solution set must not contain duplicate triplets.


 *
 */
public class ThreeSum {

  /**
   * 1.每个元素只能用一次.
   *
   * 2.思路一 :多层遍, 暴力解决. 估计复杂度是O(n^3);  --> 虽然能跑,但是被leetcode给标记为timeout了.
   *   思路二:  借鉴其他人的答案了.
   *
   * @param nums
   * @return
   */
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> retList = new ArrayList<>();
    int l = nums.length;

    Arrays.sort(nums);

    for (int i =0; i < l;i++ ) {

      for (int j =i+1; j<l; j++) {

        for (int k = j + 1; k < l; k++) {
          if (nums[i] + nums[j] +nums[k] == 0) {
            List<Integer> candidate = Arrays.asList(nums[i], nums[j], nums[k]);
            //todo 判断不为重复的?写起来很蛋疼啊.
            retList.add(candidate);

          }

        }

      }

    }

    // 添加好了之后,每个数组再拿出来 sort一次.
    // 然后用hashset去排除相同元素.

    HashSet<List<Integer>> hashSet =  new HashSet<>();
    for (List<Integer> list : retList) {
      Collections.sort(list);
      hashSet.add(list);
    }

    retList = new ArrayList<>(hashSet);


    return retList;
  }



  public List<List<Integer>> threeSum2(int[] nums) {

    Arrays.sort(nums);
    List<List<Integer>> res = new LinkedList<>();
    for (int i = 0; i < nums.length-2; i++) {
      if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
        int lo = i+1, hi = nums.length-1, sum = 0 - nums[i];
        while (lo < hi) {
          if (nums[lo] + nums[hi] == sum) {
            res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
            while (lo < hi && nums[lo] == nums[lo+1]) lo++;
            while (lo < hi && nums[hi] == nums[hi-1]) hi--;
            lo++; hi--;
          } else if (nums[lo] + nums[hi] < sum) lo++;
          else hi--;
        }
      }
    }
    return res;
  }




}



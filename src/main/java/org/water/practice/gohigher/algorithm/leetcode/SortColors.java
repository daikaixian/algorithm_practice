package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/3/17.
 *
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent,
 * with the colors in the order red, white and blue.

    Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 *
 *
 *
 */
public class SortColors {


  /**
   * 1. 可以用额外的空间?
   *
   * 2.  冒泡排序不就搞定了? 虽然用了O(n^2).  要扫两遍.
   *     再简单点,扫一遍,每种颜色计个数,然后重新写一个数组出来.
   *     题目好像要求扫描一遍,然后还要用常数的space.  -- > 想不出来.
   *     参考了别人的答案,就是 一遍扫描,然后把0放左边,2 放右边. 来自己写一下.
   *
   *
   *
   *
   * @param nums
   */
  public void sortColors(int[] nums) {

    int low=0;
    int high= nums.length -1;


    for (int i=0; i<= high;i++) {

      if (nums[i] == 0) {
        //红色
        int tmp = nums[low];
        nums[low] = 0;
        nums[i] = tmp;

        low ++;
      } else if (nums[i] == 1) {
        //白色

      } else {
        // 蓝色.

        int tmp = nums[high];
        nums[high] = 2;
        nums[i] = tmp;
        high--;
        i--;  //换回来的元素要check.
      }



    }



  }


}

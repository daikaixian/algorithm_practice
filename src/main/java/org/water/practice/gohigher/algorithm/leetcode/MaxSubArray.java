package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/21/17.
 */
public class MaxSubArray {

  public int maxSubArray(int[] nums) {

    // 返回最大值
    // 从所有的正数开始遍历，找到触发点。 在下一个正数到达之前，如果和已经小于0了，就肯定不是当前这个正数了。
    // 如果全都是负数的话？好奇怪。。

    //看答案，看看别人的解法。

    int n = nums.length;
    int[] dp = new int[n];  //dp[i] means the maximum subarray ending with A[i];
    dp[0] = nums[0];
    int max = dp[0];

    for(int i = 1; i < n; i++){
      dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);  //括号在内部啊.
      max = Math.max(max, dp[i]);
    }

    return max;

  }
}

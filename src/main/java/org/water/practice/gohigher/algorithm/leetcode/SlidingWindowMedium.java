package org.water.practice.gohigher.algorithm.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by water on 9/10/17.
 */
public class SlidingWindowMedium {

  public double[] medianSlidingWindow(int[] nums, int k) {

    // 做过sliding window max之后，这题好像就变成了，给一个数组，求出中值。

    // 如何用优先队列求中值？

    if (nums == null) {
      return null;
    }

    int l = nums.length;
    // if (l<=1) {
    //     return nums;
    // }
    double[] ret = new double[l - k + 1];

    for (int i = 0; i < ret.length; i++) {
      ret[i] = findMidium(nums, i, k);
    }
    return ret;
  }

  private double findMidium(int[] nums, int i, int k) {
    int medium = 0;
    Queue<Integer> minHeap = new PriorityQueue<Integer>(k, Collections.reverseOrder());

    Queue<Integer> maxHeap = new PriorityQueue<Integer>(k);

    for (int j = i; j < i + k ; j++) {
      if (j == i) {
        medium = nums[j];
        continue;
      }
      if (nums[j] >= medium) {
        maxHeap.add(nums[j]);
      }
      if (nums[j] < medium) {
        minHeap.add(nums[j]);
      }

      if (minHeap.size() - maxHeap.size() > 1) {
        maxHeap.add(medium);
        medium = minHeap.remove();
      }
      if (maxHeap.size() - minHeap.size() > 1) {
        minHeap.add(medium);
        medium = maxHeap.remove();
      }

    }
    System.out.println(minHeap.size());
    System.out.println(maxHeap.size());

    if (k % 2 == 1) {
      System.out.println(medium);
      return (double) medium;
    } else {
      if (minHeap.size() > maxHeap.size()) {
        return ((double) (minHeap.peek()) + medium) / 2;
      } else {
        return ((double) (maxHeap.peek()) + medium) / 2;
      }

    }
  }
}

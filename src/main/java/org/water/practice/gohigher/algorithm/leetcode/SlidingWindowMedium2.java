package org.water.practice.gohigher.algorithm.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by water on 9/10/17.
 */
public class SlidingWindowMedium2 {

  Queue<Integer> minHeap;

  Queue<Integer> maxHeap;

  int medium = Integer.MIN_VALUE;

  public double[] medianSlidingWindow(int[] nums, int k) {

    // 做过sliding window max之后，这题好像就变成了，给一个数组，求出中值。

    // 如何用优先队列求中值？

    // 下面的方法超时了。。 只能再优化下， 把优先级队列全局化。

    if(nums == null) {
      return null;
    }
    if (nums.length == 0){
      return new double[0];
    }

    minHeap = new PriorityQueue<Integer>(k, Collections.reverseOrder());

    maxHeap = new PriorityQueue<Integer>(k);

    int l = nums.length;

    double[] ret = new double[l-k+1];

    medium = nums[0];
    for(int i=1;i<k; i++) {
      addNewElement(nums, i);
    }


    for (int i = 0; i< ret.length ;i++) {
      ret[i] = findMidium(nums, i, k);
      // 移除旧元素
      if(medium > nums[i]) {
        minHeap.remove(nums[i]);
      } else if (medium < nums[i]) {
        maxHeap.remove(nums[i]);
      } else if(medium == nums[i]) {
        medium = maxHeap.remove();
      }

      //加入新元素
      if(i+k < l) {
        addNewElement(nums, i + k);
      }
    }
    return ret;
  }

  private void addNewElement(int[] nums, int i) {

    if (nums[i] >= medium) {
      maxHeap.add(nums[i]);
    }
    if (nums[i] < medium) {
      minHeap.add(nums[i]);
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


  private double findMidium(int[] nums, int i, int k) {

    if (k % 2 == 1) {
      return (double) medium;
    } else {
      if (minHeap.size() > maxHeap.size()) {
        return ((double)minHeap.peek() + (double)medium) / 2;
      } else {
        return ((double)maxHeap.peek() + (double)medium) / 2;
      }

    }

  }
}

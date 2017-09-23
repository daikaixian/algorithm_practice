package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 9/21/17.
 */
public class MaxSubArrayTest {

  @Test
  public void testMaxSubArray() throws Exception {

    MaxSubArray maxSubArray = new MaxSubArray();
    int[] array = new int[]{-2,-1,-3,-4,-1,-2,-1,-5,-4};
    int ret = maxSubArray.maxSubArray(array);


    System.out.println(ret);




  }



}
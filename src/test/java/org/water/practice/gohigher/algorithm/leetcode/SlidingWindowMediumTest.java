package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 9/10/17.
 */
public class SlidingWindowMediumTest {

  @Test
  public void testMedianSlidingWindow() throws Exception {


    SlidingWindowMedium slidingWindowMedium = new SlidingWindowMedium();


    slidingWindowMedium.medianSlidingWindow(new int[]{2147483647,2147483647}, 2);

    System.out.printf("***");

  }
}
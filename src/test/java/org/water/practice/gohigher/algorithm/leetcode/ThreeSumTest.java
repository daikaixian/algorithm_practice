package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by water on 9/3/17.
 */
public class ThreeSumTest {

  @Test
  public void testThreeSum() throws Exception {

    ThreeSum threeSumer = new ThreeSum();


    List<List<Integer>> result = threeSumer.threeSum(new int[] {-1, 0, 1, 2, -1, -4});

    System.out.println(result.size());




  }
}
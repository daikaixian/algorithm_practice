package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;
import org.water.practice.gohigher.BaseTest;

import static org.junit.Assert.*;

/**
 * Created by water on 8/31/17.
 */
public class TwoSumTest extends BaseTest{

  @Test
  public void testTwoSum() throws Exception {

    TwoSum ts = new TwoSum();
    System.out.println(ts.twoSum(new int[] {2, 7, 11, 15}, 9));

  }
}
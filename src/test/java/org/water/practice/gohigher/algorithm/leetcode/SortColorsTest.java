package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 9/3/17.
 */
public class SortColorsTest {

  @Test
  public void testSortColors() throws Exception {

    SortColors sortColors = new SortColors();

    int [] nums = new int[]{2,1,2,1,2,1,2,1,2,1,0,2,0};
    sortColors.sortColors(nums);

    for (int i : nums) {
      System.out.println(i);
    }

  }
}
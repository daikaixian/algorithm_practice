package org.water.practice.gohigher.algorithm.leetcode;

import java.util.Collections;
import java.util.List;

/**
 * Created by water on 9/4/17.
 *
 * Given a triangle, find the minimum path sum from top to bottom.
 * Each step you may move to adjacent numbers on the row below.
 * For example, given the following triangle
 *
 *  todo  这一题有点难度啊.
 *  后面再来理解.
 *
 */
public class Triangle {


  /**
   * 1.其实就是求解每一个子list中最小的元素. 然后相加. -- >题目理解错了啊.要相邻.
   *
   * 2.实现思路1: 遍历,找最小,相加.   关键在找最小上,怎么使用最小的空间?
   *
   * @param triangle
   * @return
   *
   *
   * what? [[-1],[2,3],[1,-1,-3]] Output: -2  Expected:-1
   */
  public int minimumTotal(List<List<Integer>> triangle) {
    int sum  = 0;

    for (List<Integer> list : triangle) {
      Collections.sort(list);
      sum += list.get(0);
    }
    return sum;


  }

}

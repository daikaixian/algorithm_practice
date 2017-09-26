package org.water.practice.gohigher.algorithm.sort;

/**
 * Created by water on 9/26/17.
 */
public class SelectSort {

  public void sort(int[] nums) {

    // 每次选择最大(小)的,放在已排好序的地方.再在剩余的队列里做同样的操作.是为:选择排序.
    // 平均和最坏时间复杂度都是O(n^2), 空间复杂度 O(1).

    for(int i = 0; i < nums.length-1; i++) {
      int max = i;
      for(int j =1; j< nums.length; j++) {
        if (nums[j] > nums[max]) {
          max = j; // 选出最大的
        }
      }
      // 交换.
      int temp = nums[i];
      nums[i] = nums[max];
      nums[max] = temp;
    }

  }

  public static void main(String[] args) {

    SelectSort selectSort = new SelectSort();
    int []array = new int[]{1,2,3,4,5};
    selectSort.sort(array);
    for (int a: array ){
      System.out.println(a);
    }
  }


}

package org.water.practice.gohigher.algorithm.sort;

/**
 * Created by water on 9/26/17.
 */
public class InsertionSort {
  // 插入排序.

  // 时间复杂度 平均最坏都是 O(n^2), 空间复杂度为O(1).
  public void sort(int[] nums) {

    for(int i=0; i< nums.length-1; i++) {
      for(int j=i+1; j>0; j--) {
        if(nums[j -1] <= nums[j]) {
          break; // 顺序就对了
        }
        int temp = nums[j-1];
        nums[j-1] = nums[j];
        nums[j] = temp;
      }
    }

  }


  public static void main(String[] args) {

    InsertionSort insertionSort = new InsertionSort();
    int[] array = new int[]{5,2,3,4,1};
    insertionSort.sort(array);

    for (int a : array) {
      System.out.println(a);
    }

  }


}

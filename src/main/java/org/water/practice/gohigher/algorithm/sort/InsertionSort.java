package org.water.practice.gohigher.algorithm.sort;

/**
 *
 *
 * 关于排序算法,常见的比如冒泡,选择和插入排序,这三者的时间复杂度都是O(n*2),基本思路也相差不大,都是遍历两次数组,
 *
 * 冒泡的话主要是两两比较,然后交换位置,每轮循环保证最大或者最小的值 被放到了已排序区中.
 *
 * 选择排序 是在每轮的遍历中,记录最大的值的下标 ,然后做一次位置的交换,把本轮的最大值放到已排序区中.
 *
 * 插入排序则是,在每轮的遍历中,把未排序中的一个元素往已排序区中插入,插入的过程其实就是个遍历查找的过程,
 *   如果是按升序排列,则找到第一个比自己小的值,该值的下一位即为要插入的位置.
 *
 * 堆排序则是利用里大顶堆这个数据结构, 每次取堆顶的元素都是当前堆中最大的值. 时间复杂度O(nlogN)
 *
 * 然后归并排序和快排的话,都是运用了divide and conquer 分治的算法. 时间复杂度为O(nlogN).
 * 归并算法的核心思想就是把大数组递归的divide成小数组,然后对两个小数组 进行合并排序.
 * 快排则是 随机的选择一个pivot, 然后将所有比pivot小的数和比pivot大的数放在pivot的两边.递归的执行下去,一直到所有的数都排好序.
 *
 * 除了快排,空间复杂度为O(logN), 其余的都为O(1).
 *
 *
 * 快, 选, 堆都是不稳定的排序.
 * 冒泡,插入,归并是稳定的.
 * 稳定与不稳定,就是,相等键值的记录经过排序后,是否维持与排序前同样的次序.
 *
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

  public void sort2(int[] nums) {

    for(int i=1; i< nums.length; i++) {
      for(int j=i; j>0; j--) {
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

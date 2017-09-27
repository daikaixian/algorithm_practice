package org.water.practice.gohigher.algorithm.sort;

/**
 * Created by water on 9/27/17.
 */
public class QuickSort {


  // 有两种方式实现快排.
  // 1,是按照下面这种,把pivot两边的 数进行交换.
  // 2.填坑法.  参见KthLargestElementInArray.java

  public static void quickSort(int []nums) {
    int len = nums.length;

    quickSort(nums, 0, len-1);

  }

  private static  void quickSort(int[] nums, int low, int high){


    int i = low;
    int j = high;
    int pivot = nums[(low + high)/2];
    while (i <= j) {

      while (nums[i] < pivot) {
        i++;
      }

      while (nums[j] > pivot){
        j--;
      }

      if (i<=j){
        // swap
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

        // go on
        i++;
        j--;
      }

    }

    if( i< high) {
      quickSort(nums, i, high);
    }
    if (low < j) {
      quickSort(nums, low, j);
    }

  }

  public static void main(String[] args) {

    int[] arr = new int[]{7,1,2,3,4,5,4,6};

    quickSort(arr);


    for (int a: arr) {
      System.out.println(a);

    }
  }





//填坑法.


  public static void quickSort2(int[] array, int low, int high){
    if (low < high) {
      int mid = findMid(array, low, high);//将第一个数作为基准，将数组分成前后两部分
      quickSort2(array, low, mid - 1);//递归调用将左半部分再一次往下分，直至左半部分完成排序
      quickSort2(array, mid + 1, high);//递归调用将右半部分再一次往下分，直至右半部分完成排序
    }
  }

  //将第一个数作为基准，将数组分成前后两部分--填坑法
  public static int findMid(int[] array, int low, int high){
    int temp = array[low];//将第一个数作为基准拿出,拿出留下一个坑
    while (low < high) {
      while (low < high && temp <= array[high]) {//从右开始找
        high --;
      }
      if (low < high) {//发现比基准数字小的，就把它填到之前基准数字留下的坑里
        array[low ++] = array[high];
      }

      while (low < high && temp >= array[low]) {//从左开始找
        low ++;
      }
      if (low < high) {//发现比基准数字大的，就把它填到之前被拿出数字留下的坑里
        array[high --] = array[low];
      }
    }
    array[low] = temp;//将基准数字放到中间将左右分成两部分
    return low;//返回基准数字的下标
  }



}

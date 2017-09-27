package org.water.practice.gohigher.algorithm.sort;

/**
 * Created by water on 9/26/17.
 */
public class MergeSort {

  //归并排序怎么写?

  //归并排序和快速排序 都属于divide and conquer.
  // 时间复杂度都是O(n*log(n))

  static void merge_sort_recursive(int[] arr, int[] result, int start, int end) {
    if (start >= end)  // start==end的时候,说明只有一个元素了.不需要再排了.
      return;
    int len = end - start, mid = (len >> 1) + start;  // len >> 1 = len / 2.
    int start1 = start, end1 = mid;
    int start2 = mid + 1, end2 = end;
    merge_sort_recursive(arr, result, start1, end1);  // 拆成两个数组去排序
    merge_sort_recursive(arr, result, start2, end2);
    int k = start;
    while (start1 <= end1 && start2 <= end2)
      result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++]; //对两个数组进行合并.
    while (start1 <= end1)
      result[k++] = arr[start1++];
    while (start2 <= end2)
      result[k++] = arr[start2++];
    for (k = start; k <= end; k++)
      arr[k] = result[k];
  }
  public static void merge_sort(int[] arr) {
    int len = arr.length;
    int[] result = new int[len];
    merge_sort_recursive(arr, result, 0, len - 1);
  }

  public static void main(String[] args) {

    int[] arr = new int[]{10,3,5,7,9};
    merge_sort(arr);

    for(int a : arr) {

      System.out.println(a);
    }

  }


  // 以上是递归版本, 以下是迭代版本.  --> 递归版本比较好理解.
  public static void merge_sort2(int[] arr) {
    int len = arr.length;
    int[] result = new int[len];
    int block, start;

    // 原版代码的迭代次数少了一次，没有考虑到奇数列数组的情况
    for(block = 1; block < len*2; block *= 2) {
      for(start = 0; start <len; start += 2 * block) {
        int low = start;
        int mid = (start + block) < len ? (start + block) : len;
        int high = (start + 2 * block) < len ? (start + 2 * block) : len;
        //两个块的起始下标及结束下标
        int start1 = low, end1 = mid;
        int start2 = mid, end2 = high;
        //开始对两个block进行归并排序
        while (start1 < end1 && start2 < end2) {
          result[low++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }
        while(start1 < end1) {
          result[low++] = arr[start1++];
        }
        while(start2 < end2) {
          result[low++] = arr[start2++];
        }
      }
      int[] temp = arr;
      arr = result;
      result = temp;
    }
    result = arr;
  }


}

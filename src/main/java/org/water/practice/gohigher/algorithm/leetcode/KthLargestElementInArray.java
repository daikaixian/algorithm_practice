package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/27/17.
 */
public class KthLargestElementInArray {

  public int findKthLargest(int[] nums, int k) {
    //对时间复杂度有何要求？如果nums输入非法，int返回什么？
    //思路一 brute force. 暴力排序，然后找第k大的元素，快排的话，O(nlogn);
    //思路二 构建一个大顶堆，remove堆顶元素k 次。  O（N） + O（k*log n）
    //思路三 divide and conquer? pivot? 快速排序？ 可以达到O（n）?
    // Discard half each time: n+(n/2)+(n/4)..1 = n + (n-1) = O(2n-1) = O(n), because n/2+n/4+n/8+..1=n-1.

    if(nums == null) {
      return 0; //怎么决定返回什么？
    }

    int l = 0 ;
    int h = nums.length -1;
    k = nums.length - k;  //从小到大的排序，第k大，就是num[length - k].

    //shuffle --> 降低快排的最坏输入可能性。

    return findKthLargest(nums, l, h, k);

  }

  private int findKthLargest(int[]nums,int low, int high, int k) {

    int pivot = low;
    int x = nums[pivot];
    // 分两拨。

    int l = low;
    int h = high;

    while (l < h)
    {
      while(l < h && nums[h] >= x) { // 从右向左找第一个小于x的数
        h--;
      }
      if(l < h) {
        nums[l] = nums[h];
        l++;
      }

      // 从左向右找大于或等于x的数来填s[j]
      while (l < h && nums[l] < x){
        l++;
      }
      if(l < h)
      {
        nums[h] = nums[l]; //将s[i]填到s[j]中，s[i]就形成了一个新的坑
        h--;
      }
    }
    //退出时，l等于h。将x填到这个坑中。
    nums[l] = x;
    pivot = l;

    //找到枢纽。
    if (pivot == k) {
      return nums[pivot];
    }
    if(pivot < k) {
      return findKthLargest(nums, pivot+1, high, k);
    } else {
      return findKthLargest(nums, low, pivot-1, k);
    }


  }

}

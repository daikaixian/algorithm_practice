package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 8/31/17.
 */
public class MergeAndSortArrays {

  /**
   * 1. 从小到大的数组,两个合并成一个,不限制nums1的空间.
   * 2. 思路1,合并后,再排序.合并是O(n)的操作.冒泡排序O(n^2),所以粗暴的方法是O(n^2)的.
   *    思路2, 直接把num2和num1 的最大元素相比较.最大的直接放到m+n-1的地方去. 这样的话,复杂度是多少?写完代码再看.
   * 3. coding 实现.
   * 4. feedback: 时间复杂度?  O(n)
   *
   *
   *
   */
  public int[] merge(int[] nums1, int m, int[] nums2, int n) {

    int p =0;
    int q=0;

    int k =m+n-1;

    for (int i  = 0 ;i <m+n; i++) {

      if (p<m && q<n) {
        if (nums1[m-1 - p] >= nums2[n-1 - q]) {
          nums1[k- i] = nums1[m-1 - p];
          p++;
          continue;
        } else {
          nums1[k - i] = nums2[n -1- q];
          q++;
          continue;
        }
      }

      if (p>=m) {
        nums1[k - i] = nums2[n -1- q];
        q++;

      }

    }



    return nums1;

  }


  /**
   *  膜拜大神写的代码.
    public void merge(int A[], int m, int B[], int n) {
   int i=m-1, j=n-1, k=m+n-1;
   while (i>-1 && j>-1) A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
   while (j>-1)         A[k--]=B[j--];
   }
   *
   */


}

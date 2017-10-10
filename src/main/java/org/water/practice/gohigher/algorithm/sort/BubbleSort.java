package org.water.practice.gohigher.algorithm.sort;

/**
 * Created by water on 10/10/17.
 */
public class BubbleSort {

  public void sort(int arrays[]) {

    for (int i=arrays.length - 1;i>0 ; i--) {
      for (int j=0; j<i; j++) {
        if(arrays[j]>arrays[j+1]) {
          int tmp = arrays[j];
          arrays[j] = arrays[j+1];
          arrays[j+1] = tmp;
        }
      }
    }

  }

  public static void main(String[] args) {

    int array[] = new int[]{5,4,3,2,1};
    new BubbleSort().sort(array);

    for (int a : array) {
      System.out.println(a);
    }


  }




}

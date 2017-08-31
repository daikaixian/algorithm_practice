package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 8/31/17.
 */
public class MergeAndSortArraysTest {

  @Test
  public void testMerge() throws Exception {

    MergeAndSortArrays mergeAndSortArrays = new MergeAndSortArrays();

    int [] ret =  mergeAndSortArrays.merge(new int[]{1,2,3,0,0,0,0}, 3, new int[]{2,3,4}, 3);

    for (int i: ret){
      System.out.println(i + " ");
    }
    System.out.println("*******************");

    int [] ret1 =  mergeAndSortArrays.merge(new int[]{1,2,0,0,0,0,0}, 2, new int[]{2,3,4}, 3);

    for (int i: ret1){
      System.out.println(i + " ");
    }

    System.out.println("*******************");


    int [] ret2 =  mergeAndSortArrays.merge(new int[]{1,2,5,7,9,0,0,0,0,0}, 5, new int[]{2,3,4}, 3);
    for (int i: ret2){
      System.out.println(i + " ");
    }
    System.out.println("*******************");

    int [] ret3 =  mergeAndSortArrays.merge(new int[]{6,0,0,0,0,0,0}, 1, new int[]{2,3,4}, 3);

    for (int i: ret3){
      System.out.println(i + " ");
    }


  }
}
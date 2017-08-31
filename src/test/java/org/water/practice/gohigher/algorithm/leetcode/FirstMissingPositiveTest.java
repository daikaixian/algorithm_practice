package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 8/31/17.
 */
public class FirstMissingPositiveTest {

  @Test
  public void testGetFirstMissingPositive() throws Exception {

    FirstMissingPositive firstMissingPositive = new FirstMissingPositive();

    System.out.println(firstMissingPositive.getFirstMissingPositive(new int []{1,2,3,6,7,8}));

    System.out.println("*****************");



    System.out.println(firstMissingPositive.getFirstMissingPositive(new int []{-1,-2,-3,-6,-7,-8}));

    System.out.println("*****************");



    System.out.println(firstMissingPositive.getFirstMissingPositive(new int []{-1,-2,3,6,7,8}));

    System.out.println("*****************");


    System.out.println(firstMissingPositive.getFirstMissingPositive(new int []{1,2,3,-6,-7,-8}));

    System.out.println("*****************");



    System.out.println(firstMissingPositive.getFirstMissingPositiveWithHashSet(new int []{1,2,3,-6,-7,-8}));

    System.out.println("*****************");

  }
}
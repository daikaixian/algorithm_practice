package org.water.practice.gohigher.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by water on 8/31/17.
 */
public class FizzBuzz {

  public List<String> fizzBuzz(int n) {
    //1. 阐述清楚题意.   输入n, 返回一个字符串list. n 应该是大于1的. 小于或等于1的应该直接返回空字符串?

    List<String> result = new ArrayList<String>();

    if (n >= 1) {
      for (int i=1; i<=n; i++) {
        String element = getElementByI(i);
        result.add(element);
      }

    } else {
      //just return empty

//      for (int i=n; i<=1; i++) {
//        String element = getElementByI(i);
//        result.add(element);
//      }

    }


    return result;

  }

  private String getElementByI(int i) {
    String element = String.valueOf(i);
    if (i % 3 == 0) {
      element = "Fizz";
    }
    if (i % 5 == 0){
      element = "Buzz";
    }
    if (i % 15 == 0) {
      element = "FizzBuzz";
    }

    return element;
  }



}

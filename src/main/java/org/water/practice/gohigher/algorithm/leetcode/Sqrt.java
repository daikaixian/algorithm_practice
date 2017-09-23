package org.water.practice.gohigher.algorithm.leetcode;

/**
 * Created by water on 9/23/17.
 */
public class Sqrt {

  //二分法,迭代紧逼.精确到0.1

  public float sqrt(float nums) {

    float low= 0;
    float high = nums;
    float ret = 0;

    while(high - low > 0.1) {
      ret = (low + (high -low)/2);

      if(ret == nums/ret) {
        return ret;
      }
      if (ret > nums /ret) {
        high = ret;
      } else {
        low = ret;
      }
    }
    return (float)(Math.round(low*10))/10;

  }

}

package org.water.practice.gohigher.contest;

/**
 * Created by water on 10/8/17.
 */
public class AlternatingBits {

  public boolean hasAlternatingBits(int n) {

    int last = n & 1;
    n = n>>1;
    while(n>0){
      int now = (n&1);
      if((now ^ last) != 1) {
        return false;
      }
      n = n >> 1;
    }
    return true;

  }

  public static void main(String[] args) {



  }
}

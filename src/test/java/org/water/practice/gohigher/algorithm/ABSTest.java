package org.water.practice.gohigher.algorithm;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by water on 8/27/17.
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ABSTest {

  @Test
  public void testPlaceHolder() {

    System.out.println(Math.rint(12.5));  //最近的偶数
    System.out.println(Math.rint(11.5));  //最近的偶数.


    // StringBuffer.

    StringBuffer stringBuffer = new StringBuffer("ABC");
    stringBuffer.append("D");
    System.out.println(stringBuffer);


  }



}
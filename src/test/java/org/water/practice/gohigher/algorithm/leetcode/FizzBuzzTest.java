package org.water.practice.gohigher.algorithm.leetcode;

import org.junit.Test;
import org.water.practice.gohigher.BaseTest;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by water on 8/31/17.
 */
public class FizzBuzzTest extends BaseTest{

  @Test
  public void testFizzBuzz() throws Exception {

    FizzBuzz fizzBuzz = new FizzBuzz();

    List<String> result = fizzBuzz.fizzBuzz(-1);
    for (String s : result) {
      System.out.println(s);

    }

    List<String> result2 = fizzBuzz.fizzBuzz(15);
    for (String s : result2) {
      System.out.println(s);

    }




  }
}
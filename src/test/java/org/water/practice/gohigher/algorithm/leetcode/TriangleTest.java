package org.water.practice.gohigher.algorithm.leetcode;

import junit.framework.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by water on 9/11/17.
 */
public class TriangleTest {

  @Test
  public void testMinimumTotal() throws Exception {

    Triangle triangle = new Triangle();

    List<Integer>  list1 = new ArrayList<>(Arrays.asList(-1));
    List<Integer>  list2 = new ArrayList<>(Arrays.asList(2,3));
    List<Integer>  list3 = new ArrayList<>(Arrays.asList(1,-1,-3));


    List<List<Integer>> triangleList = new ArrayList<>();
    triangleList.add(list1);
    triangleList.add(list2);
    triangleList.add(list3);


    int sum = triangle.minimumTotal(triangleList);

    System.out.println(sum);





  }

  @Test
  public void testShuffle() {
    final Random random = new Random();
    int a = random.nextInt(5);
    System.out.println(a);


  }

  @Test
  public void testSubString() {
    String abc = "abc";
    String b = abc.substring(0, 1);
    String c = abc.substring(3);

    System.out.println(b);
    System.out.println(c);

    Assert.assertTrue(c.length() == 0);



  }



}
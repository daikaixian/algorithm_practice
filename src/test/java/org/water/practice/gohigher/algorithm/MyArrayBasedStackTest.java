package org.water.practice.gohigher.algorithm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by water on 8/27/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyArrayBasedStackTest {



  @Test
  public void  testMyStack() {
    MyArrayBasedStack myArrayBasedStack = new MyArrayBasedStack(10);

    Assert.assertEquals(0, myArrayBasedStack.getSize());

    Assert.assertTrue(myArrayBasedStack.isEmpty());

    myArrayBasedStack.push("dai");
    myArrayBasedStack.push(1);
    myArrayBasedStack.push(new Date());

    Assert.assertEquals(3, myArrayBasedStack.getSize());
    Assert.assertFalse(myArrayBasedStack.isEmpty());
    myArrayBasedStack.push("kai");
    myArrayBasedStack.push(2);

    Assert.assertTrue(myArrayBasedStack.top().equals(2));

    myArrayBasedStack.pop();
    Assert.assertTrue(myArrayBasedStack.top().equals("kai"));


  }

  @Test
  public void testReverseArrayByStack() {

    int [] a = new int[] {1,2,3,4,5};

    int []b = reverse(a);

    for (int i= 0; i< b.length; i++) {
      System.out.println(b[i]);
    }

  }

  /**
   * nice job.
   * @param a
   * @return
   */
  private int[] reverse(int[] a) {
    MyArrayBasedStack myArrayBasedStack = new MyArrayBasedStack(a.length);
    int[] b = new int[a.length];

    for (int i = 0; i < a.length; i++) {
      myArrayBasedStack.push(a[i]);
    }
    for (int i = 0; i < a.length; i++) {
      b[i] = (Integer) myArrayBasedStack.pop();
    }

    return b;
  }

}
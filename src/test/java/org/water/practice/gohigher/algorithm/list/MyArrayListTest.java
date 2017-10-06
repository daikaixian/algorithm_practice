package org.water.practice.gohigher.algorithm.list;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 10/5/17.
 */
public class MyArrayListTest {


  @Test
  public void testMyList(){

    MyArrayList list = new MyArrayList();

    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list.size());
    System.out.println(list.get(1));

    list.removeAt(0);
    System.out.println(list.get(0));


    list.clear();
    System.out.println(list.size());

  }

}
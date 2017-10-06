package org.water.practice.gohigher.algorithm.list;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by water on 10/5/17.
 */
public class MyLinkedListTest {


  @Test
  public void testMyLinkedList(){
    MyLinkedList myLinkedList = new MyLinkedList();


    myLinkedList.add(3);
    myLinkedList.add(4);
    myLinkedList.add(5);

    System.out.println(myLinkedList.get(1));
    System.out.println(myLinkedList.get(2));

    myLinkedList.set(2, 9);
    System.out.println(myLinkedList.size());
    myLinkedList.removeAt(1);
    myLinkedList.removeAt(1);

    myLinkedList.removeAt(1);

    System.out.println(myLinkedList.size);
    myLinkedList.clear();
    System.out.println(myLinkedList.size);




  }

}
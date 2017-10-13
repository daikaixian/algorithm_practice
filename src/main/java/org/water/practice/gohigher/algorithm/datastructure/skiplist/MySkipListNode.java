package org.water.practice.gohigher.algorithm.datastructure.skiplist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by water on 10/13/17.
 */
public class MySkipListNode <E> {

  private E value;
  public List<MySkipListNode<E> > nextNodes;  //多层,每一层有一个nextNode.

  public E getValue() {
    return value;
  }

  public MySkipListNode(E value) {
    this.value = value;
    nextNodes = new ArrayList<>();
  }

  public int level() {
    return nextNodes.size()-1;
  }

  public String toString() {
    return "SLN: " + value;
  }
}


  



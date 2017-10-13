package org.water.practice.gohigher.algorithm.datastructure.skiplist;

import java.util.Iterator;

/**
 * Created by water on 10/13/17.
 */
public class MySkipListIterator <E extends Comparable<E>> implements Iterator<E> {

  MySkipList<E> list;
  MySkipListNode<E> current;

  public MySkipListIterator(MySkipList<E> list) {
    this.list = list;
    this.current = list.getHead();
  }


  @Override
  public boolean hasNext() {

    return current.nextNodes.get(0) != null;
  }

  @Override
  public E next() {
    current = (MySkipListNode<E>) current.nextNodes.get(0);
    return (E)current.getValue();
  }


  public void remove() throws UnsupportedOperationException {
    // 可能因为太复杂了吧,所以决定不实现了.
    throw new UnsupportedOperationException();
  }


}
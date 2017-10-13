package org.water.practice.gohigher.algorithm.datastructure.skiplist;

import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/**
 * Created by water on 10/13/17.
 */
abstract class MyAbstractSortedSet<E> extends AbstractSet<E> implements SortedSet<E> {


  @Override
  public Iterator<E> iterator() {
    return null;
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public Comparator<? super E> comparator() {
    return null;
  }

  @Override
  public SortedSet<E> subSet(E fromElement, E toElement) {
    return null;
  }

  @Override
  public SortedSet<E> headSet(E toElement) {
    return null;
  }

  @Override
  public SortedSet<E> tailSet(E fromElement) {
    return null;
  }

  @Override
  public E first() {
    return null;
  }

  @Override
  public E last() {
    return null;
  }

}

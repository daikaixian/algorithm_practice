package org.water.practice.gohigher.algorithm.datastructure.skiplist;

import java.util.Iterator;

/**
 * Created by water on 10/13/17.
 *
 * 数据结构很好玩,
 */
public class MySkipList<E extends Comparable<E>> extends MyAbstractSortedSet<E> {

  private MySkipListNode<E> head;
  private int maxLevel;
  private int size;

  private static final double PROBABILITY = 0.5;

  public MySkipList(){
    size = 0;
    maxLevel = 0;

    // a MySkipListNode with value null marks the beginning. DummyNode.

    head = new MySkipListNode<E>(null);
    head.nextNodes.add(null);



  }
  public MySkipListNode getHead() {
    return head;
  }


  // Adds e to the skiplist.
  // Returns false if already in skiplist, true otherwise.
  public boolean add(E e) {

    if(contains(e)) {
      return false;
    }

    size++;

    // random number from 0 to maxLevel+1 (inclusive)
    int level = 0;
    while (Math.random() < PROBABILITY) {  //level越高, 概率越小.
      level++;
    }

    while(level > maxLevel) {   // should only happen once. ? 什么时候会出现这种情况
      head.nextNodes.add(null);
      maxLevel++;
    }

    MySkipListNode newNode = new MySkipListNode<E>(e);
    MySkipListNode current = head;

    do {  // 这里得搞清楚.  // 这里的level是要插入的节点随机出来的值, 所以和这个level同级的前后节点要和它建立链接关系.
      current = findNext(e,current,level);  // 要好好理解一下.--> 找到要插入的节点的位置的前一个节点.
      newNode.nextNodes.add(0,current.nextNodes.get(level));  //level是递减的,所以每次在list的前面插入下个节点的相同level的节点.
      current.nextNodes.set(level,newNode);  // 插入第一次的时候,应该就会更新head的next了.
    } while (level-- > 0);

    return true;
  }

  // Returns the skiplist node with greatest value <= e
  // 找到比e小的最大值.
  private MySkipListNode find(E e) {
    return find(e, head, maxLevel);
  }

  // Returns the skiplist node with greatest value <= e
  // Starts at node current and level.
  // 这个方法是干什么吃的.
  private MySkipListNode find(E e, MySkipListNode current, int level) {
    do {
      current = findNext(e,current,level);
    } while(level-- > 0);
    return current;
  }

  // Returns the node at a given level with highest value less than e
  // 返回在指定level上 比当前值小的最大节点?
  // 为什么会需要这些方法.

  private MySkipListNode findNext(E e, MySkipListNode current, int level) {
    MySkipListNode next = (MySkipListNode)current.nextNodes.get(level);  //head的max level节点很有可能指向null啊.
    while(next != null) {
      E value = (E)next.getValue();
      if(lessThan(e,value)) // e < value
        break;
      current = next;
      next = (MySkipListNode) current.nextNodes.get(level);
    }
    return current;
  }

  public int size() {
    return size;
  }

  public boolean contains(Object o) {
    E e = (E)o;
    MySkipListNode node = find(e);
    return node != null &&
        node.getValue() != null &&
        equalTo((E)node.getValue(),e);
  }

  public Iterator<E> iterator() {
    return new MySkipListIterator(this);
  }


  /******************************************************************************
   * Utility Functions        工具方法.                                          *
   ******************************************************************************/

  private boolean lessThan(E a, E b) {
    return a.compareTo(b) < 0;
  }

  private boolean equalTo(E a, E b) {
    return a.compareTo(b) == 0;
  }

  private boolean greaterThan(E a, E b) {
    return a.compareTo(b) > 0;
  }

  public String toString() {
    String s = "MySkipList: ";
    for(Object o : this) {
      s += o + ", ";
    }
    return s.substring(0,s.length()-2);
  }


  /******************************************************************************
   * Testing                                                                     *
   ******************************************************************************/

  public static void main(String[] args) {
    MySkipList testList = new MySkipList<Integer>();
    System.out.println(testList);
    testList.add(4);
    System.out.println(testList);
    testList.add(1);
    System.out.println(testList);
    testList.add(2);
    System.out.println(testList);

    testList = new MySkipList<String>();
    System.out.println(testList);
    testList.add("hello");
    System.out.println(testList);
    testList.add("beautiful");
    System.out.println(testList);
    testList.add("world");
    System.out.println(testList);
  }

}

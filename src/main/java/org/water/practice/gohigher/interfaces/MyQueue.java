package org.water.practice.gohigher.interfaces;

import org.water.practice.gohigher.exception.QueueEmptyException;
import org.water.practice.gohigher.exception.QueueFullException;

/**
 * Created by water on 8/27/17.
 */
public interface MyQueue {

  int getSize();//返回队列中元素数目

  boolean isEmpty();//判断队列是否为空

  Object front() throws QueueEmptyException;//取队首元素(但不删除)

  void enqueue (Object obj) throws QueueFullException;

  Object dequeue() throws QueueEmptyException; //出队

  void traversal();//遍历
}

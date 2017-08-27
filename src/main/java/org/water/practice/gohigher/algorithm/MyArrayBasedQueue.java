package org.water.practice.gohigher.algorithm;

import org.water.practice.gohigher.exception.QueueEmptyException;
import org.water.practice.gohigher.exception.QueueFullException;
import org.water.practice.gohigher.interfaces.MyQueue;

/**
 * Created by water on 8/27/17.
 */
public class MyArrayBasedQueue implements MyQueue{


  public static final int DEFAULT_CAPACITY = 1000;//数组的默认容量
  protected int reallyCapacity;//数组的实际容量

  protected Object[] objectArray;//对象数组

  protected int front = 0;//队首元素的位置  front.
  protected int rear = 0;//队尾元素的位置   rear.

  public MyArrayBasedQueue() {
    this(DEFAULT_CAPACITY);
  }

  public MyArrayBasedQueue(int cap) {
    this.reallyCapacity = cap;
    objectArray = new Object[cap];
  }

  @Override
  public int getSize() {
    return (reallyCapacity - front + rear) % reallyCapacity;
  }

  @Override
  public boolean isEmpty() {
    return (front == rear);
  }

  @Override
  public Object front() throws QueueEmptyException {
    if (isEmpty()) {
      throw new QueueEmptyException("empty queue");
    } else {
      return objectArray[front];
    }
  }

  // 入队列.
  @Override
  public void enqueue(Object obj) throws QueueFullException {
    if (getSize() == reallyCapacity - 1) {
      throw new QueueFullException("full queue");
    } else {
      objectArray[rear] = obj;
      rear = (rear + 1) % reallyCapacity;

    }

  }

  @Override
  public Object dequeue() throws QueueEmptyException {

    if (isEmpty()) {
      throw new QueueEmptyException("empty queue");
    } else {
      Object object = objectArray[front];
      objectArray[front] = null;
      front = (front + 1) % reallyCapacity;
      return object;
    }

  }

  @Override
  public void traversal() {

    for (int i = front; i < rear; i++) {
      System.out.print(objectArray[i] + " ");
    }
    System.out.println();

  }
}

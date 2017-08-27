package org.water.practice.gohigher.algorithm;

import org.water.practice.gohigher.exception.StackEmptyException;
import org.water.practice.gohigher.exception.StackFullException;
import org.water.practice.gohigher.interfaces.MyStack;

/**
 * Created by water on 8/27/17.
 */
public class MyArrayBasedStack implements MyStack{

  public static final int DEFAULT_CAPACITY = 1024;//数组的默认容量

  protected int reallyCapacity;

  protected int top = -1;//栈顶元素的位置

  protected Object[] objectArray;//对象数组


  public MyArrayBasedStack() {
    this(DEFAULT_CAPACITY);
  }

  public MyArrayBasedStack(int cap) {
    this.reallyCapacity = cap;
    objectArray = new Object[cap];
  }




  @Override
  public int getSize() {
    return top + 1;
  }

  @Override
  public boolean isEmpty() {
    return top < 0;
  }

  @Override
  public Object top() throws StackEmptyException {
    if (isEmpty()) {
      throw new StackEmptyException("the stack is empty now.");
    } else {
      return objectArray[top];
    }
  }

  @Override
  public void push(Object ele) {
    if (getSize() == reallyCapacity) {  //满了
      throw new StackFullException("the stack is full.");
    } else {
      top = top + 1;
      objectArray[top] = ele;
    }


  }

  @Override
  public Object pop() throws StackEmptyException {
    if (isEmpty()) {
      throw new StackEmptyException("the stack is empty now.");
    } else {
      Object object = objectArray[top];
      objectArray[top] = null;
      top = top - 1;
      return object;

    }

  }
}

package org.water.practice.gohigher.interfaces;

import org.water.practice.gohigher.exception.StackEmptyException;
import org.water.practice.gohigher.exception.StackFullException;

/**
 * Created by water on 8/27/17.
 */
public interface MyStack {

  int getSize();//返回栈中元素数目

  boolean isEmpty();//判断栈是否为空

  Object top() throws StackEmptyException;//取栈顶元素(但不删除)

  void push (Object ele);//入栈    // todo 栈满的异常?

  Object pop () throws StackEmptyException; //出栈



}

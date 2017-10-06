package org.water.practice.gohigher.algorithm.list;

/**
 * Created by water on 10/5/17.
 */
public class MyArrayList {


  private int size = 0;

  private Object[] objects = new Object[16]; //初始化.

  public int size(){
    return size;
  }

  public void add(Object obj){
    // 判断是否满了.
    if (size >= objects.length -1) {

      Object[] newObjects = new Object[objects.length + objects.length/2]; //每次扩容1.5倍
      //copy值.
      for (int i=0; i<objects.length; i++) {
        newObjects[i] = objects[i];
      }
      objects = newObjects;
    }

    objects[size] = obj;
    size++;
  }

  public Object get(int index){

    // 判断index是否合法.
    if (index<0 || index>=size){
      throw new IndexOutOfBoundsException();
    }
    return objects[index];

  }

  public void set (int index, Object obj){

    // 判断index是否合法.
    if (index<0 || index>=size){
      throw new IndexOutOfBoundsException();
    }
    objects[index] = obj;

  }

  public void clear(){

    size = 0;
  }

  public void removeAt(int index){
    // 判断index是否合法.
    if (index<0 || index>=size){
      throw new IndexOutOfBoundsException();
    }
    //后面的元素前移.

    for (int i = index; i<size-1; i++){
      objects[i]=objects[i+1];
    }
    size --;
  }


}

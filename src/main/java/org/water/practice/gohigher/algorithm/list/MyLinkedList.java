package org.water.practice.gohigher.algorithm.list;

/**
 * Created by water on 10/5/17.
 */
public class MyLinkedList {

  int size = 0;

  private Node head;
  private Node tail;

  public int size(){
    return size;
  }

  public void add(Object obj){

    if (head == null){
      head = new Node(obj);
      tail = head;
    } else {
      tail.next = new Node(obj);
      tail = tail.next;
    }
    size ++;

  }


  public Object get(int index){
    if(index<0||index>=size) {
      throw new IndexOutOfBoundsException();
    }
    Node tmp = head;
    for (int i=0; i<index; i++){
      tmp=tmp.next;
    }
    return tmp.value;

  }

  public void set(int index, Object obj){
    if(index<0||index>=size) {
      throw new IndexOutOfBoundsException();
    }
    Node tmp = head;
    for (int i=0; i<index-1; i++){
      tmp=tmp.next;
    }
    Node newNode = new Node(obj);
    newNode.next = tmp.next;
    tmp.next = newNode;
    size++;
  }

  public void clear(){
    head = null;
    tail = null;
    size = 0;
  }

  public void removeAt(int index){
    if(index<0||index>=size) {
      throw new IndexOutOfBoundsException();
    }
    Node tmp = head;
    for (int i=0; i<index; i++){
      tmp=tmp.next;
    }
    if (index == size -1){
      tmp.next = null;
    }else {
      tmp.next = tmp.next.next;
    }
    size--;
  }



}

class Node{

  public Object value;
  public Node next;

  public Node(Object value){
    this.value = value;
  }

}
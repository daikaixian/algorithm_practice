package org.water.practice.gohigher.algorithm.balancetree;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by water on 10/9/17.
 */
public class LinkedHashMapDemo {


  public static void main(String[] args) {

    LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap();

    linkedHashMap.put(1,"a");
    linkedHashMap.put(6,"a");
    linkedHashMap.put(5,"a");
    linkedHashMap.put(2,"a");
    linkedHashMap.put(4,"a");
    linkedHashMap.put(3,"a");

    // 不会改变其插入的顺序.
    for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()){
      System.out.println(entry.getKey());
    }

  }


}

package org.water.practice.gohigher.algorithm.balancetree;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by water on 10/9/17.
 */
public class TreeMapDemo {


  public static void main(String[] args) {

    TreeMap<Integer, String> treeMap = new TreeMap();

    treeMap.put(1, "数据");
    treeMap.put(2, "结构");
    treeMap.put(3, "算法");

    treeMap.put(4, "数据1");
    treeMap.put(5, "数据2");
    treeMap.put(6, "数据3");

    for (Map.Entry<Integer, String> entry: treeMap.entrySet()) {

      System.out.println(entry.getKey());
    }

    System.out.println("*********************");

    TreeMap<Integer, String> treeMap2 = new TreeMap();
    treeMap2.put(3, "算法");
    treeMap2.put(1, "数据");
    treeMap2.put(2, "结构");
    treeMap2.put(6, "数据3");
    treeMap2.put(4, "数据1");
    treeMap2.put(5, "数据2");


    //顺序应该是不变化的,这就是TreeMap 首先它是一个红黑树.
    for (Map.Entry<Integer, String> entry: treeMap2.entrySet()) {

      System.out.println(entry.getKey());
    }




  }



}

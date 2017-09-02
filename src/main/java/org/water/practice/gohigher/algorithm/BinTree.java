package org.water.practice.gohigher.algorithm;

import java.util.Iterator;

/**
 * Created by water on 9/2/17.
 *
 * 二叉树.
 *
 */
public interface BinTree {

  //返回树根
   BinTreePosition getRoot();

  //判断是否树空
   boolean isEmpty();

  //返回树的规模(即树根的后代数目)
  int getSize();


  int getHeight();


  Iterator elementsPreorder();


  //中序遍历
   Iterator elementsInorder();

  //后序遍历
   Iterator elementsPostorder();

  //层次遍历
   Iterator elementsLevelorder();



}

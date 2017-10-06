package org.water.practice.gohigher.designpattern.singleton;

/**
 * Created by water on 10/4/17.
 */
public class SingletonTest {

  private static SingletonTest singletonTest = new SingletonTest();

  public static SingletonTest getInstance() {

    return singletonTest;  //在类被加载的时候就已经初始化了.所以不用判断.

  }


}

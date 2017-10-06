package org.water.practice.gohigher.designpattern.singleton;

/**
 * Created by water on 10/4/17.
 */
public class Singleton2Test {

  private static Singleton2Test singleton2Test;

  private Singleton2Test(){ }
  public static Singleton2Test getInstance() {
    if (singleton2Test == null) {  //如果只检验一层,会有线程安全的问题.
      synchronized (Singleton2Test.class) {
        if(singleton2Test == null) {  // 懒汉式 双重校验锁.
          return new Singleton2Test();
        }
      }
    }
    return singleton2Test;

  }




}

package org.water.practice.gohigher.classloader;

/**
 * Created by water on 10/4/17.
 */
public class ClassLoaderTest1 {

  static {
    tmp = 3;
  }

  private static int tmp = 1;

  public static void main(String[] args) {
    System.out.println(tmp);
  }

}

package org.water.practice.gohigher.classloader;

/**
 * Created by water on 10/4/17.
 */
public class MyClassLoader extends ClassLoader {



  @Override
  protected Class<?> findClass(String name) throws ClassNotFoundException {
    return super.findClass(name);
  }
}

package org.water.practice.gohigher.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by water on 10/7/17.
 */
public class MyTP {

  int coreThreadSize = 3;
  BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(5); //队列有队列的大小.


  public void execute(Runnable job) {
    queue.add(job);

    // if current thread nums < coreSize;
    Thread thread = new MyOwnThread();
    thread.start();

  }


   class MyOwnThread extends Thread{

    @Override
    public void run() {
      try {
        Runnable runnable = queue.take();
        runnable.run(); //执行其run方法.

      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }
  }


  public static void main(String[] args) {
    MyTP tp = new MyTP();
    for(int i=0; i<10; i++) {
      Runnable job = new Runnable() {
        @Override
        public void run() {
          System.out.println(Thread.currentThread().getName() + ":" + "hello");
        }
      };

      tp.execute(job);
    }

  }



}



package org.water.practice.gohigher.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by water on 10/7/17.
 */
public class MyThreadPool {

  /**
   *阻塞队列（BlockingQueue）是一个支持两个附加操作的队列。
   * 这两个附加的操作是：在队列为空时，获取元素的线程会等待队列变为非空。
   * 当队列满时，存储元素的线程会等待队列可用。
   * 阻塞队列常用于生产者和消费者的场景，生产者是往队列里添加元素的线程，消费者是从队列里拿元素的线程。
   * 阻塞队列就是生产者存放元素的容器，而消费者也只从容器里拿元素。
   *
   * http://ifeve.com/java-blocking-queue/
   */


  public static void main(String[] args){
    //创建等待队列
    BlockingQueue<Runnable> bqueue = new ArrayBlockingQueue<Runnable>(20);
    //创建线程池，池中保存的线程数为3，允许的最大线程数为5
    ThreadPoolExecutor pool = new ThreadPoolExecutor(3,5,50, TimeUnit.MILLISECONDS,bqueue);
    //创建七个任务
    Runnable t1 = new MyThread();
    Runnable t2 = new MyThread();
    Runnable t3 = new MyThread();
    Runnable t4 = new MyThread();
    Runnable t5 = new MyThread();
    Runnable t6 = new MyThread();
    Runnable t7 = new MyThread();
    //每个任务会在一个线程上执行
    pool.execute(t1);
    pool.execute(t2);
    pool.execute(t3); // 前三个执行完了,才会再从队列里面拉出来执行新的任务.
    System.out.println("进去三个");
    pool.execute(t4);  // 其实还是异步的.
    pool.execute(t5);
    pool.execute(t6);
    System.out.println("再进去三个");
    pool.execute(t7);
    System.out.println("都进去.");
    //关闭线程池
    pool.shutdown();
  }
}



class MyThread implements Runnable{
  @Override
  public void run(){
    System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    try{
      Thread.sleep(2000);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
  }
}





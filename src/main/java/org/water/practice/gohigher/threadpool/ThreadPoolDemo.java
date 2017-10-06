package org.water.practice.gohigher.threadpool;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by water on 10/6/17.
 */
public class ThreadPoolDemo {

  private static ExecutorService cacheThreadPool = Executors.newCachedThreadPool(); //?  在需要的时候会增加线程,然后会使用空闲的老线程.
  // 而且如果一个线程60秒没有被用到之后,就会被销毁掉.


  private static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);  //固定数量
  private static ExecutorService singedThreadPool = Executors.newSingleThreadExecutor(); //单一的

  //todo  scheduled线程池

  private static ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1);

  public static void main(String[] args) {

    for (int i=0; i<10; i++) {



      cacheThreadPool.execute(new Runnable() {  //submit 会返回future对象, execute没有返回值.为void.
        @Override
        public void run() {

          getTime();
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

        }
      });
    }

    //结束线程池
    cacheThreadPool.shutdown();


   scheduledThreadPool.schedule(new Runnable() {
     @Override
     public void run() {
       System.out.println("fuck");
     }
   } , 5, TimeUnit.SECONDS);


    scheduledThreadPool.shutdown();
  }


  private static void getTime(){

    System.out.println(Thread.currentThread().getName() + ":" + new Date());
  }






}

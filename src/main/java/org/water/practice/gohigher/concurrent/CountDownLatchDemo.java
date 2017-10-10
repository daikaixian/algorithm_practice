package org.water.practice.gohigher.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by water on 10/10/17.
 *
 *
 * 比如一个房间需要8个玩家都进来了并且点了准备,才能开始,
 * 这个时候,可以考虑使用countDownLatch.
 */
public class CountDownLatchDemo {

  public static void main(String[] args) throws InterruptedException {

    CountDownLatch countDownLatch = new CountDownLatch(3);
    Thread thread1 = new MyCountDownLatchThread(countDownLatch);
    Thread thread2 = new MyCountDownLatchThread(countDownLatch);

    thread1.start();
    thread2.start();

    countDownLatch.await(10, TimeUnit.SECONDS);
    System.out.println("10秒到了,结束");
  }
}


class MyCountDownLatchThread extends Thread{

  private CountDownLatch countDownLatch;

  public MyCountDownLatchThread(CountDownLatch countDownLatch){
    this.countDownLatch = countDownLatch;
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + ":" + countDownLatch.getCount());
    countDownLatch.countDown();
  }
}

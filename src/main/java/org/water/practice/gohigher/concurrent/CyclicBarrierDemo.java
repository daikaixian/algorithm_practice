package org.water.practice.gohigher.concurrent;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by water on 10/10/17.
 */
public class CyclicBarrierDemo {

  public static void main(String[] args) throws InterruptedException {
    CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

    Thread t1 = new MyCyclicBarrierThread(cyclicBarrier);
    Thread t2 = new MyCyclicBarrierThread(cyclicBarrier);
    Thread t3 = new MyCyclicBarrierThread(cyclicBarrier);

    t1.start();

    t2.start();

    t3.start();

    while (true) {
      Thread.sleep(1000);

      System.out.println("到了几个?:" + cyclicBarrier.getNumberWaiting());
//      if (cyclicBarrier) {
//
//        System.out.println("到齐了");
//        break;
//      }

    }


  }






}

class MyCyclicBarrierThread extends Thread {

  private CyclicBarrier cyclicBarrier;

  public MyCyclicBarrierThread(CyclicBarrier cyclicBarrier) {

    this.cyclicBarrier = cyclicBarrier;
  }

  @Override
  public void run() {

    Random random = new Random();
    int a = random.nextInt(10000);
    try {
      Thread.sleep(a);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    //System.out.println(Thread.currentThread().getName() + ":" + cyclicBarrier.getNumberWaiting());
    try {
      cyclicBarrier.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (BrokenBarrierException e) {
      e.printStackTrace();
    }


  }
}

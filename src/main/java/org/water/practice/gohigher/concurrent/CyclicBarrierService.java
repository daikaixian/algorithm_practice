package org.water.practice.gohigher.concurrent;

import java.util.Map;
import java.util.concurrent.*;

/**
 * Created by water on 10/10/17.
 */
public class CyclicBarrierService implements Runnable {

  //这一步关键啊.这一步说,屏障被解除后,就执行当前runnable的run,相当于是回调函数啊.
  private CyclicBarrier cyclicBarrier = new CyclicBarrier(4, this);
  private ExecutorService executorService = Executors.newFixedThreadPool(4);
  private  ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

  @Override
  public void run() {
    System.out.println("难道会跑起来?");
    System.out.println("等屏障解除了,就跑起来了");
    int result = 0;
    for (Map.Entry<String, Integer> entry : concurrentHashMap.entrySet()) {
      result += entry.getValue();
    }

    System.out.println("最后的结果" + result);
  }

  public void caculate() {
    for (int i=0;i< 4;i++) {
      executorService.submit(new Runnable() {
        @Override
        public void run() {
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          concurrentHashMap.put(Thread.currentThread().getName(), 10);
          System.out.println(Thread.currentThread().getName() + "is waiting.");
          try {
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() + "is reborn.");

          } catch (InterruptedException e) {
            e.printStackTrace();
          } catch (BrokenBarrierException e) {
            e.printStackTrace();
          }
        }
      });

    }
    executorService.shutdown();
  }

  public static void main(String[] args) throws InterruptedException {
    new CyclicBarrierService().caculate();
  }

}

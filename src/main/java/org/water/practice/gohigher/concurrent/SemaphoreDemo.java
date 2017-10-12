package org.water.practice.gohigher.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by water on 10/11/17.
 */
public class SemaphoreDemo {



  public static void main(String[] args) {

    ExecutorService executorService = Executors.newFixedThreadPool(30);

    Semaphore semaphore = new Semaphore(10);

    for(int i =0; i<30; i++) {
      Thread thread = new MySemaPhoreThread(semaphore);
      executorService.submit(thread);
    }
  }

}

class MySemaPhoreThread extends Thread {
  private Semaphore semaphore;

  public MySemaPhoreThread(Semaphore semaphore) {
    this.semaphore = semaphore;
  }

  @Override
  public void run() {
    try {
      semaphore.acquire();      //重点
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(Thread.currentThread().getName() + ":占用一个坑.");
    semaphore.release();    //重点.


  }
}
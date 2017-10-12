package org.water.practice.gohigher.concurrent;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by water on 10/11/17.
 */
public class ExchangerDemo {

  public static void main(String[] args) {
    ExecutorService executor = Executors.newCachedThreadPool();
    final Exchanger exchanger = new Exchanger();
    executor.execute(new Runnable() {
      String data1 = "dai";

      @Override
      public void run() {
        doExchangeWork(data1, exchanger);
      }
    });

    executor.execute(new Runnable() {
      String data1 = "kaixian";

      @Override
      public void run() {
        doExchangeWork(data1, exchanger);
      }
    });
    executor.shutdown();
  }

  private static void doExchangeWork(String data1, Exchanger exchanger) {
    try {
      System.out.println(Thread.currentThread().getName() + "正在把数据 " + data1 + " 交换出去");
      Thread.sleep((long) (Math.random() * 1000));

      String data2 = (String) exchanger.exchange(data1);
      System.out.println(Thread.currentThread().getName() + "交换数据 到  " + data2);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }




}

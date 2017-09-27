package org.water.practice.gohigher.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by water on 9/27/17.
 */
public class CallableAndFuture implements Callable<String>{


  @Override
  public String call() throws Exception {
    Thread.sleep(10 * 1000);
    return "Hello World";
  }


  public static void main(String[] args) {

    ExecutorService threadPool = Executors.newSingleThreadExecutor();

    Future<String> future = threadPool.submit(new CallableAndFuture());

    try
    {
      System.out.println("waiting thread to finish");
      System.out.println(future.get()); // 等待线程结束,并获取返回结果
    }
    catch (Exception e) {
      e.printStackTrace(); }

  }




}

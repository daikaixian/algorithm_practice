package org.water.practice.gohigher.designpattern.observer;

/**
 * Created by water on 9/28/17.
 */
public class WeatherObserber2 implements Observer{

  @Override
  public void update(float temp) {
    System.out.println("WeatherObserver2 当前温度:" + temp + " ,注意增减衣物");
  }

}

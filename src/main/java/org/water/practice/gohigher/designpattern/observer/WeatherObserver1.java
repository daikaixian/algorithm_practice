package org.water.practice.gohigher.designpattern.observer;

/**
 * Created by water on 9/28/17.
 */
public class WeatherObserver1 implements Observer {
  @Override
  public void update(float temp) {
    System.out.println("WeatherObserver1 发现有气象发生了变化.");
  }


}

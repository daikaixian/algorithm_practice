package org.water.practice.gohigher.designpattern.observer;

/**
 * Created by water on 9/28/17.
 */
public class ObserverDPTest {


  public static void main(String[] args) {
   WeatherOffice weatherOffice = new WeatherOffice(22.5f);

    Observer observer1 = new WeatherObserver1(); // 一个网站订阅者

    Observer observer2 = new WeatherObserber2(); // 一个手机app订阅者

    weatherOffice.registerObserver(observer1);
    weatherOffice.registerObserver(observer2);

    weatherOffice.notifyObservers();
    weatherOffice.setTemprature(19.5f);


  }


}

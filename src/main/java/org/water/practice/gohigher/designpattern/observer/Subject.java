package org.water.practice.gohigher.designpattern.observer;

/**
 * Created by water on 9/28/17.
 */
public interface Subject {

  void registerObserver(Observer observer);

  void removeObserver(Observer o);

  void notifyObservers(); // 通知所有的观察者.





}

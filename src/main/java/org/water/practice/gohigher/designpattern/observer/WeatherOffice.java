package org.water.practice.gohigher.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by water on 9/28/17.
 */
public class WeatherOffice implements Subject {

  List<Observer> observerList;
  float temprature;

  public WeatherOffice(float temp) {
    this.temprature = temp;
    observerList = new ArrayList<>();
  }

  public void setTemprature(float temprature) {
    this.temprature = temprature;
    notifyObservers();
  }

  @Override
  public void registerObserver(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {

    observerList.remove(observer);
  }

  @Override
  public void notifyObservers() {

    for (Observer observer : observerList) {
      observer.update(temprature);
    }


  }
}

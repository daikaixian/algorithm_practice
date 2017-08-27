package org.water.practice.gohigher.exception;

/**
 * Created by water on 8/27/17.
 */
public class QueueFullException extends RuntimeException{

  public QueueFullException(String err) {
    super(err);
  }


}

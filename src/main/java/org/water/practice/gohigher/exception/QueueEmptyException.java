package org.water.practice.gohigher.exception;

/**
 * Created by water on 8/27/17.
 */
public class QueueEmptyException extends RuntimeException {

  public QueueEmptyException(String err) {
    super(err);
  }

}

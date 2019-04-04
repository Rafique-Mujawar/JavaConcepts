package com.samples.multithreading;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 */
class RunnableThread implements Runnable {

  @Override
  public void run() {
    System.out.println("RunnableThread is running...");
  }
}

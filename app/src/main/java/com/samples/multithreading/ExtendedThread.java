package com.samples.multithreading;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 */
class ExtendedThread extends Thread {

  @Override
  public void run() {
    System.out.println("ExtendedThread is running...");
  }
}

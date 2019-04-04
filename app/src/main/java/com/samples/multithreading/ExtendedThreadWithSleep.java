package com.samples.multithreading;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 */
class ExtendedThreadWithSleep extends Thread {

  @Override
  public void run() {
    System.out.println("ExtendedThreadWithSleep:Run");
    for (int i = 1; i < 5; i++) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println("InterruptedException");
      }
      System.out.print(getName()+":" + i);
    }
  }
}

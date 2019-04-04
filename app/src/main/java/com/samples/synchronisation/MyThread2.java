package com.samples.synchronisation;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 */
public class MyThread2 extends Thread {
  TableSyncMethod t;

  MyThread2(TableSyncMethod t) {
    this.t = t;
  }

  @Override
  public void run() {
    t.printTable(100);
  }
}
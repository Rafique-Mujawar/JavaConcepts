package com.samples.synchronisation;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 */
public class MyThread1 extends Thread {
  private TableSyncMethod t;
  private int multiplier;
  private boolean isCallSynchronisedMethod;

  MyThread1(TableSyncMethod t, int multiplier, boolean isCallSynchronisedMethod) {
    this.t = t;
    this.multiplier = multiplier;
    this.isCallSynchronisedMethod = isCallSynchronisedMethod;
  }

  @Override
  public void run() {
    if (isCallSynchronisedMethod) {
      t.printTableSync(multiplier);
    } else {
      t.printTable(multiplier);
    }
  }
}
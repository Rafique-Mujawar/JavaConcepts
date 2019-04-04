package com.samples.synchronisation;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 */
public class TableSyncBlock {
  //method not synchronized
  void printTable(int multiplier) {
    synchronized (this) {
      print(multiplier);
    }
  }

  private void print(int multiplier) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(multiplier * i);
      try {
        Thread.sleep(100);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

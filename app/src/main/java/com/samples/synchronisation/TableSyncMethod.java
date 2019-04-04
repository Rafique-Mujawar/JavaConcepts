package com.samples.synchronisation;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 */
public class TableSyncMethod {
  //method not synchronized
  void printTable(int multiplier) {
    print(multiplier);
  }

  public synchronized void printTableSync(int multiplier) {
    print(multiplier);
  }

  public static synchronized void printStaticSync(int multiplier) {
    print(multiplier);
  }

  private static void print(int multiplier) {
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

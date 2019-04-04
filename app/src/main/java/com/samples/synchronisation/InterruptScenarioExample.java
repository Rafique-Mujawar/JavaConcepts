package com.samples.synchronisation;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 * <p>
 * 1:calling the interrupt() in Sleep Or Wait state, thread breaks the state & throws
 * InterruptedException.
 * <p>
 * 2:calling the interrupt() not in Sleep Or Wait state, thread performs normal & only update
 * intrrupt flag to true.
 */
public class InterruptScenarioExample {

  public static void main(String[] args) {
    //interruptCausesStopScenario();
    //interruptCausesExceptionButStillWorks();
    interruptDoesNotHarmThreadWorking();
  }

  private static void interruptCausesStopScenario() {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Thread.sleep(100);
          System.out.println("task");
        } catch (InterruptedException e) {
          throw new RuntimeException("Thread interrupted..." + e);
        }
      }
    });
    thread.start();
    thread.interrupt();
  }

  private static void interruptCausesExceptionButStillWorks() {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Thread.sleep(1000);
          System.out.println("task");
        } catch (InterruptedException e) {
          System.out.println("Exception handled " + e);
        }
        System.out.println("thread is running...");
      }
    });
    thread.start();
    thread.interrupt();
  }

  private static void interruptDoesNotHarmThreadWorking() {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 1; i <= 5; i++) {
          System.out.println(i);
        }
      }
    });
    thread.start();
    thread.interrupt();
  }
}

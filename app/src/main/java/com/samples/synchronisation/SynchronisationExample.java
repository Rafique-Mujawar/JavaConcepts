package com.samples.synchronisation;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 * Synchronization : capability to control the access of multiple threads to any shared resource.
 * <p>
 * Why:
 * 1:To prevent thread interference.
 * 2:To prevent consistency problem.
 * <p>
 * types:
 * 1:Process Synchronization :
 * 2:Thread Synchronization
 * ___A)Mutual Exclusive"
 * ______a)by synchronized method : put lock on method
 * ______b)by synchronized block : if you want lock on only specific part of method to be locked.
 * ______c)by static synchronization: put lock on class & not on object
 * __B)Cooperation (Inter-thread communication in java)
 *
 * Deadlock:
 * When T1 want lock aquired by T2 , T2 wants lock aquired by T1. Both will be waiting forever.
 *
 * Inter-thread communication:
 * 1)wait() :Causes current thread to release the lock and wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
 *
 * 2)notify() :Wakes up one of threads that is waiting on this object's monitor.
 * 3)notifyAll() : Wakes up all threads that are waiting on this object's monitor.
 */
public class SynchronisationExample {

  public static void main(String[] args) {
    withoutSynchronisationMethodScenario();
    synchronisationMethodScenario();
    synchronisationBlockScenario();
    synchronisationMethodScenarioWithAnanymousClass();
    synchronisationStaticMethodScenario();
  }

  private static void synchronisationBlockScenario() {
    final TableSyncBlock obj = new TableSyncBlock();
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        obj.printTable(5);
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        obj.printTable(100);
      }
    });

    thread1.start();
    thread2.start();
  }

  private static void synchronisationStaticMethodScenario() {
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        TableSyncMethod.printStaticSync(5);
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        TableSyncMethod.printStaticSync(100);
      }
    });

    thread1.start();
    thread2.start();
  }

  private static void synchronisationMethodScenarioWithAnanymousClass() {
    final TableSyncMethod obj = new TableSyncMethod();//only one object
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        obj.printTableSync(5);
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        obj.printTableSync(100);
      }
    });

    thread1.start();
    thread2.start();
  }

  private static void withoutSynchronisationMethodScenario() {
    TableSyncMethod obj = new TableSyncMethod();//only one object
    MyThread1 t1 = new MyThread1(obj, 5, false);
    MyThread1 t2 = new MyThread1(obj, 100, false);
    t1.start();
    t2.start();
  }

  private static void synchronisationMethodScenario() {
    TableSyncMethod obj = new TableSyncMethod();//only one object
    MyThread1 t1 = new MyThread1(obj, 5, true);
    MyThread1 t2 = new MyThread1(obj, 100, true);
    t1.start();
    t2.start();
  }
}

package com.samples.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 * <p>
 * 1.Multiprocessing and multithreading, both are used to achieve multitasking.
 * 2.A thread is a lightweight sub-process, the smallest unit of processing.
 * 3.Threads uses a shared memory area.
 * 4.context-switching between the threads takes less time than process
 * 5.can perform many operations together, so it saves time.
 * 6.Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
 * <p>
 * What thread can have: Id, Name, Priority, isAlive, state, lock,
 * state: NEW, RUNNABLE, RUNNING, BLOCKED and TERMINATED
 * 2 Ways to create thread: 1)Extend Thread 2)Implement Runnable
 * Priority ranges from 1 to 10.
 * MIN_PRIORITY == 1
 * NORM_PRIORITY == 5 (default)
 * MAX_PRIORITY == 10
 */
public class MultiThreadExample {

  public static void main(String args[]) {
    //startingThreadTwice();
    //startingExtendedThread();
    //startingImplementedThread();
    //threadSleepScenario();
    //directRunCallScenario();
    //joinScenarioWithNoTime();
    //priorityScenario();
    //joinScenarioTimeBased();
    //daemonThreadScenario();
    //threadGroupExample();
    threadPoolExample();
  }

  private static void daemonThreadScenario() {
    DaemonThread t1 = new DaemonThread();
    DaemonThread t2 = new DaemonThread();
    t1.setDaemon(true);
    t2.start();
    t1.start();
  }

  private static void joinScenarioWithNoTime() {
    ExtendedThreadWithSleep t1 = new ExtendedThreadWithSleep();
    ExtendedThreadWithSleep t2 = new ExtendedThreadWithSleep();
    ExtendedThreadWithSleep t3 = new ExtendedThreadWithSleep();
    t1.setName("t1");
    t2.setName("t2");
    t3.setName("t3");
    t1.start();
    try {
      t1.join();
    } catch (Exception e) {
      System.out.println(e);
    }

    t2.start();
    t3.start();
  }

  private static void joinScenarioTimeBased() {
    ExtendedThreadWithSleep t1 = new ExtendedThreadWithSleep();
    ExtendedThreadWithSleep t2 = new ExtendedThreadWithSleep();
    ExtendedThreadWithSleep t3 = new ExtendedThreadWithSleep();
    t1.setName("t1");
    t2.setName("t2");
    t3.setName("t3");
    t1.start();
    try {
      t1.join(1500);
    } catch (Exception e) {
      System.out.println(e);
    }

    t2.start();
    try {
      t2.join(1000);
    } catch (Exception e) {
      System.out.println(e);
    }
    t3.start();
  }

  private static void directRunCallScenario() {
    ExtendedThreadWithSleep t1 = new ExtendedThreadWithSleep();
    ExtendedThreadWithSleep t2 = new ExtendedThreadWithSleep();
    t1.setName("t1");
    t2.setName("t2");
    t1.run();
    t2.run();
  }

  private static void threadSleepScenario() {
    ExtendedThreadWithSleep t1 = new ExtendedThreadWithSleep();
    ExtendedThreadWithSleep t2 = new ExtendedThreadWithSleep();
    t1.setName("t1");
    t2.setName("t2");
    t1.start();
    t2.start();
  }

  private static void startingImplementedThread() {
    RunnableThread runnableThread = new RunnableThread();
    Thread thread = new Thread(runnableThread);
    thread.setName("startingImplementedThread:");
    thread.start();
  }

  private static void startingExtendedThread() {
    ExtendedThread t1 = new ExtendedThread();
    t1.setName("startingExtendedThread:");
    t1.start();
  }

  private static void startingThreadTwice() {
    ExtendedThread t1 = new ExtendedThread();
    t1.setName("t1");
    t1.start();
    try {
      t1.start();
    } catch (IllegalThreadStateException e) {
      System.out.println("starting thread twice leads to IllegalThreadStateException");
    }
  }

  private static void priorityScenario() {
    ExtendedThreadWithSleep t1 = new ExtendedThreadWithSleep();
    ExtendedThreadWithSleep t2 = new ExtendedThreadWithSleep();
    t1.setName("t1");
    t2.setName("t2");
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
  }

  private static void threadPoolExample() {
    ExecutorService executor = Executors.newFixedThreadPool(5);
    for (int i = 0; i < 10; i++) {
      Runnable worker = new ThreadPoolWorkerThread("" + i);
      executor.execute(worker);//calling execute method of ExecutorService
      //NOTE: Only Runnable are added
    }
    executor.shutdown();
    while (!executor.isTerminated()) {

    }
    System.out.println("Finished all threads");
  }


  private static void threadGroupExample() {
    ThreadGroupRunnable runnable = new ThreadGroupRunnable();

    ThreadGroup threadGroup = new ThreadGroup("First ThreadGroup");
    Thread t1 = new Thread(threadGroup, runnable, "t1");
    t1.start();

    Thread t2 = new Thread(threadGroup, runnable, "t2");
    t2.start();

    Thread t3 = new Thread(threadGroup, runnable, "t3");
    t3.start();

    System.out.println(threadGroup.getName());
    threadGroup.list();
  }
}


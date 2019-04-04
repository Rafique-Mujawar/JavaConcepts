package com.samples.multithreading;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 * 1.Daemon thread: service provider thread that provides services to the user thread for
 * background supporting tasks.
 * 2.when all the user threads dies, JVM terminates this thread automatically.
 * 3.its life depends on user thread hence very low priority.
 * 4.daemon threads in Java e.g. gc, finalizer etc
 * 5After stating a thread if you try to make it daemon, it will throw
 * {@link IllegalThreadStateException}
 */
class DaemonThread extends Thread {

  @Override
  public void run() {
    if(Thread.currentThread().isDaemon()) {
      System.out.println("Daemon thread is running...");
    } else {
      System.out.println("User thread is running...");
    }
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

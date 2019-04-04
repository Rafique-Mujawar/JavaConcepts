package com.samples.multithreading;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 * 1:ThreadGroup: convenient way to group multiple threads in a single object
 * 2:ThreadGroup can have sub thread group
 * 3:ThreadGroup is possible
 * 4:thread can access info of its group, Not its parent group info.
 *
 */
public class ThreadGroupRunnable implements Runnable {
  /**
   * When an object implementing interface <code>Runnable</code> is used
   * to create a thread, starting the thread causes the object's
   * <code>run</code> method to be called in that separately executing
   * thread.
   * <p>
   * The general contract of the method <code>run</code> is that it may
   * take any action whatsoever.
   *
   * @see Thread#run()
   */
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
  }
}

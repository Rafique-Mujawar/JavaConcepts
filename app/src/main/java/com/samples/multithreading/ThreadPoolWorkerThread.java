package com.samples.multithreading;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 * <p>
 * Thread Pool:
 * 1:group of worker threads that are waiting for the job and reuse many times.
 * 2:fixed size threads
 * 3.Service provider pulls out one of thread and assigns work.
 * 4.After work is done, thread is contained in the thread pool again.
 * 5.Performance: save time of creation of thread.
 * 6.Android Asynctask uses thread pool
 * 7. Threads are already created, pas only runnable to threadpool
 */
public class ThreadPoolWorkerThread implements Runnable {
  private String message;

  public ThreadPoolWorkerThread(String s) {
    this.message = s;
  }

  public void run() {
    System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
    processmessage();//call processmessage method that sleeps the thread for 2 seconds
    System.out.println(Thread.currentThread().getName() + " (End)");//prints thread name
  }

  private void processmessage() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

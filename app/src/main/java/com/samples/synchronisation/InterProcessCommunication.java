package com.samples.synchronisation;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 */
public class InterProcessCommunication {
  private int amount = 100;

  synchronized void withdraw(int withdraw) {
    System.out.println("going to withdraw "+ withdraw);
    if (this.amount < withdraw) {
      System.out.println("Existing balance :"+amount+". waiting for deposit...");
      try {
        wait();
      } catch (Exception e) {
      }
    }
    this.amount -= withdraw;
    System.out.println("withdraw completed.Remaining ammount:"+amount);
  }

  synchronized void deposit(int deposit) {
    System.out.println("going to deposit Rs." + deposit);
    this.amount += deposit;
    System.out.println("deposit completed. Total ammount: " + amount);
    notify();
  }

  public static void main(String[] args) {
    final InterProcessCommunication customer = new InterProcessCommunication();

    new Thread(new Runnable() {
      @Override
      public void run() {
        customer.withdraw(150);
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        customer.deposit(100);
      }
    }).start();
  }
}

package com.samples.synchronisation;

/**
 * @author Rafique Mujawar
 * Date 11-04-2019
 */
public class SynchroniseMultiMethodsExample {

  synchronized static public void staticMethod1() {
    for (int i = 1; i <= 10000; i++) {
      if (0 == i % 2500) {
        System.out.println("method1:" + Thread.currentThread().getName() + ":" + i);
      }
    }
  }

  synchronized static public void staticMethod2() {
    for (int i = 1; i <= 10000; i++) {
      if (0 == i % 2200) {
        System.out.println("method2:" + Thread.currentThread().getName() + ":" + i);
      }
    }
  }


  synchronized public void method1() {
    for (int i = 1; i <= 10000; i++) {
      if (0 == i % 2000) {
        System.out.println("method1:" + Thread.currentThread().getName() + ":" + i);
      }
    }
  }

  synchronized public void method2() {
    for (int i = 1; i <= 10000; i++) {
      if (0 == i % 1800) {
        System.out.println("method2:" + Thread.currentThread().getName() + ":" + i);
      }
    }
  }

  synchronized public void method3() {
    for (int i = 1; i <= 10000; i++) {
      if (0 == i % 1600) {
        System.out.println("method3:" + Thread.currentThread().getName() + ":" + i);
      }
    }
  }

  public static void main(String[] args) {
    //callSameMethodFromAllThreads();
    //System.out.println("***********************************************");
    //callDifferentMethodOFDiffObject();
    //System.out.println("***********************************************");
    //callDifferentMethodsFromDiffThreads();
    staticMethodChecks();
  }

  private static void callSameMethodFromAllThreads() {
    final SynchroniseMultiMethodsExample example = new SynchroniseMultiMethodsExample();

    final Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        example.method1();
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        example.method1();
      }
    });

    Thread thread3 = new Thread(new Runnable() {
      @Override
      public void run() {
        example.method1();
      }
    });

    thread1.start();
    thread2.start();
    thread3.start();
  }

  private static void callDifferentMethodsFromDiffThreads() {
    final SynchroniseMultiMethodsExample example = new SynchroniseMultiMethodsExample();

    final Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        example.method1();
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        example.method2();
      }
    });

    Thread thread3 = new Thread(new Runnable() {
      @Override
      public void run() {
        example.method3();
      }
    });

    thread1.start();
    thread2.start();
    thread3.start();
  }

  private static void callDifferentMethodOFDiffObject() {

    final SynchroniseMultiMethodsExample example = new SynchroniseMultiMethodsExample();
    final SynchroniseMultiMethodsExample example1 = new SynchroniseMultiMethodsExample();
    final SynchroniseMultiMethodsExample example2 = new SynchroniseMultiMethodsExample();

    final Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        example.method1();
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        example1.method1();
      }
    });

    Thread thread3 = new Thread(new Runnable() {
      @Override
      public void run() {
        example2.method1();
      }
    });

    thread1.start();
    thread2.start();
    thread3.start();
  }

  private static void staticMethodChecks() {

    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        SynchroniseMultiMethodsExample.staticMethod1();
      }
    });


    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        SynchroniseMultiMethodsExample.staticMethod2();
      }
    });

    System.out.println("Start");
    thread.start();
    thread1.start();
    System.out.println("END");
  }
}

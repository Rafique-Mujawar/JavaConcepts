package com.samples.extra;

/**
 * @author Rafique Mujawar
 *         Date 13-06-2018
 */

public class Hello {
  int a;
  static int b;
  int c;
  {
    c = 10;
    System.out.print("initialised:"+c);
  }
  public Hello getInstance(){
    return new Hello();
  }
}

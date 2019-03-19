package com.samples.extra;

/**
 * @author Rafique Mujawar
 *         Date 13-06-2018
 */

public class Customer extends Hello{
  int cid;
  long phone;
  String name;

  void show(){
    System.out.println(cid);
    System.out.println(phone);
    System.out.println(name);
  }

  @Override
  public Hello getInstance() {
    return new Hello();
  }
}

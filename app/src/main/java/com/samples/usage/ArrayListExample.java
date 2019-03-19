package com.samples.usage;

import java.util.ArrayList;

/**
 * @author Rafique Mujawar
 * Date 14-02-2019
 */
public class ArrayListExample {
  private static final String TAG = ArrayListExample.class.getName();

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    boolean isremoved = list.remove(null);
    System.out.println("isremoved:" + isremoved + " size:" + list.size());
  }
}
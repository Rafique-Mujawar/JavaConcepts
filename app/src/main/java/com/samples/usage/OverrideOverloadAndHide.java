package com.samples.usage;

/**
 * @author Rafique Mujawar
 * Date 06-07-2018
 * 1.Main Method can be overloaded but system will call one with signle argument "String[] args"
 */
public class OverrideOverloadAndHide {

  public static void main(String[] args) {

  }

  public static void main(String args) {

  }

  public static void main(String arg, String[] args) {

  }
}

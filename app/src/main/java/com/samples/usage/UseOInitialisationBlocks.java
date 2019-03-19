package com.samples.usage;

/**
 * Instance initialization blocks are useful if you want to have some code run regardless of which
 * constructor is used or if you want to do some instance initialization for anonymous classes.The
 * instance initialization block is actually copied by the Java compiler into every constructor the
 * class has. So every time the code in instance initialization block is executed exactly before
 * the code in constructor
 *
 * The code in static initialization block will be executed at class load time (and yes, that
 * means only once per class load), before any instances of the class are constructed and before any
 * static methods are called.
 *
 * <B>Order of execution:</B>
 * 1:static initialization blocks of super classes
 * 2:static initialization blocks of the class
 * 3:instance initialization blocks of super classes
 * 4:constructors of super classes
 * 5:instance initialization blocks of the class
 * 6:constructor of the class.
 *
 * @author Rafique Mujawar
 * Date 06-07-2018
 */
public class UseOInitialisationBlocks extends InitialisationParent{
  static {
    System.out.println("inside Child Static block");
  }

  {
    System.out.println("inside Child initialisation block");
  }

  public UseOInitialisationBlocks() {
    System.out.println("inside Child constructor");
  }

  public static void main(String[] args){
    new UseOInitialisationBlocks();
    new UseOInitialisationBlocks();
  }
}

class InitialisationParent {
  static {
    System.out.println("inside Parent Static block");
  }
  {
    System.out.println("inside Parent initialisation block");
  }

  InitialisationParent() {
    System.out.println("inside Parent constructor");
  }
}
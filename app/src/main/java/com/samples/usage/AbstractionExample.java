package com.samples.usage;

/**
 * A class that is declared with abstract keyword, is known as abstract class in java.
 * It can have abstract and non-abstract methods.
 * Abstraction is a process of hiding the implementation details and showing only functionality
 * to the user.
 * Abstract class (0 to 100%) of abstraction.
 * Abstract class needs to be extended and its method implemented.
 * Abstract class can not be instantiated.
 * A method that is declared as abstract and does not have implementation is known as abstract method.
 * An abstract class can have data member, abstract method, method body, constructor and even main() method.
 * If there is any abstract method in a class, that class must be abstract.
 * If you are extending any abstract class that have abstract method,
 * you must either provide the implementation of the method or make this class abstract.
 * The abstract class can also be used to provide some implementation of the interface.
 * In such case, the end user may not be forced to override all the methods of the interface.
 *
 * @author Rafique Mujawar
 * Date 06-07-2018
 */
public abstract class AbstractionExample {

  public static void main(String[] args) {
    Shape shape = new Shape() {
      @Override
      void draw() {
        System.out.println("");
      }
    };
    shape = new Rectangle();
    shape.draw();
    shape = new Circle();
    shape.draw();
  }
}

abstract class Shape {
  abstract void draw();
}

class Rectangle extends Shape {
  void draw() {
    System.out.println("drawing rectangle");
  }
}

class Circle extends Shape {
  void draw() {
    System.out.println("drawing circle");
  }
}
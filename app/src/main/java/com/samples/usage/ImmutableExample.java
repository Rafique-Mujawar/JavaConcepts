package com.samples.usage;

/**
 * @author Rafique Mujawar
 * Date 07-04-2019
 * <p>
 * 1:String, Boolean, Byte, Short, Integer, Long, Float, Double are  immutable classes. ie. All
 * wrapper classes are immutable
 * <p>
 * 2:Immutable class : creating final class that have final data members
 * Wrapper class in java provides the mechanism to convert primitive into object and object into primitive.
 * All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class Number.
 *
 * autoboxing : automatic conversion of primitive into object
 * unboxing : automatic conversion of object into primitive
 */
public class ImmutableExample {

  public static void main(String[] args) {

    ImmutableEmployee employee = new ImmutableEmployee("Axnanal");
    System.out.println(employee.getPancardNumber());
  }
}


final class ImmutableEmployee {
  final String pancardNumber;

  public ImmutableEmployee(String pancardNumber) {
    this.pancardNumber = pancardNumber;
  }

  public String getPancardNumber() {
    return pancardNumber;
  }

}
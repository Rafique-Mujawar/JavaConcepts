package com.samples.usage;

import java.io.Serializable;

/**
 * @author Rafique Mujawar
 * Date 05-07-2018
 */
public class Student implements Cloneable, Serializable{
  public String name;
  public int rollNo;

  //TODO: Default Constructor
  //TODO: No Return Type But It returns the object of current class
  //TODO: If class does not have any constructor.Compiler Adds this constructor
  //TODO: Initialises the sate of object
  //TODO: Can be implicitly called
  public Student() {
  }

  //TODO: Parameterised Constructor
  //constructor is never inherited.
  public Student(String name, int rollNo) {
    this.name = name;
    this.rollNo = rollNo;
  }

  //TODO: This is method. Not constructor
  public void Student(){
    System.out.println("This sis method. looks same as constructor");
  }
  public void setupData(String name, int rollNo){
    this.name = name;
    this.rollNo = rollNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //one of the getter
  public int getRollNo() {
    return rollNo;
  }

  //one of the setter
  public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

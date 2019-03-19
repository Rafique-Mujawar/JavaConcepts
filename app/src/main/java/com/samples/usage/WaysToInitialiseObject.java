package com.samples.usage;

/**
 * This class demonstrates 3 ways of initialising object
 * 1: via constructor
 * 2: via reference
 * 3: via method
 *
 * @author Rafique Mujawar
 * Date 05-07-2018
 */
public class WaysToInitialiseObject {

  public static void main(String[] args) {

    //1: Via constructor
    Student student = new Student("Rafique", 1212);

    //2: via reference
    Student student1 = new Student();
    student1.name = "Shahbaaz";
    student1.rollNo = 1210;

    //3: via method
    Student student2 = new Student();
    student2.setupData("Ramiz", 1010);

    //3:OR
    student2.setName("Ramiz");
    student2.setRollNo(1010);
  }
}

package com.samples.usage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * This class demonstrates 5 ways of creating object
 * 1: Using new keyword
 * 2: Using newInstance() method of Class class
 * 3: Using newInstance() method of Constructor class
 * 4: Using Clone method
 * 5: Using Deserialization method
 *
 * @author Rafique Mujawar
 * Date 05-07-2018
 */
public class WaysOfCreatingObject {

  public static void main(String[] args) {

    //1: common way to create object is to use "new" keyword:
    Student student1 = new Student("Rafique", 1313);
    System.out.println("main: first:" + student1.getName() + " " + student1.getRollNo());

    //2: using newInstance method of Class
    try {
      Student student2 = (Student) Class.forName("com.samples.usage.Student").newInstance();
      System.out.println("main: 2nd:" + student2.getName() + " " + student2.getRollNo());
    } catch (InstantiationException e) {
      System.out.println("main: InstantiationException:" + e.getMessage());
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      System.out.println("main: IllegalAccessException:" + e.getMessage());
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      System.out.println("main: ClassNotFoundException:" + e.getMessage());
      e.printStackTrace();
    }

    //3: Using Clone method
    try {
      Student student3 = (Student) student1.clone();
      System.out.println("main: student3:" + student3.getName() + " " + student3.getRollNo());
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      System.out.println("main3: CloneNotSupportedException:" + e.getMessage());
    }

    //4: Using newInstance() method of Constructor class
    try {
      Constructor<Student> constructor = Student.class.getConstructor();
      try {
        Student student4 = constructor.newInstance();
        System.out.println("main: 4th type:" + student4.getName() + " " + student4.getRollNo());
      } catch (InstantiationException e) {
        System.out.println("main4: InstantiationException:" + e.getMessage());
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        System.out.println("main4: IllegalAccessException:" + e.getMessage());
        e.printStackTrace();
      } catch (InvocationTargetException e) {
        System.out.println("main4: InvocationTargetException:" + e.getMessage());
        e.printStackTrace();
      }
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
      System.out.println("main4: NoSuchMethodException:" + e.getMessage());
    }


    //5: Using Deserialisation method:
    try {
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
      out.writeObject(student1);
      out.close();
    } catch (IOException e) {
      System.out.println("main5: IOException:" + e);
      e.printStackTrace();
    }

    //Deserialization

    try {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
      Student student5 = (Student) in.readObject();
      in.close();
      System.out.println("Student 5: " + student5.getName() + " " + student5.getRollNo());
    } catch (IOException e) {
      System.out.println("main5: IOException:" + e);
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      System.out.println("main5: ClassNotFoundException:" + e);
      e.printStackTrace();
    }
  }
}

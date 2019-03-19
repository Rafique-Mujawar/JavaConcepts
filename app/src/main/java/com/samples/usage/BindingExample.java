package com.samples.usage;

/**
 * Connecting a method call to the method body is known as binding.
 * 2 Types: 1)Early Binding OR static binding & 2)Late Binding OR Dynamic binding
 * When type of the object is determined at compiled time(by the compiler), it is known as static binding.
 * When type of the object is determined at run-time, it is known as dynamic binding.
 *
 * An object of subclass type is also a type of parent class.
 * @author Rafique Mujawar
 * Date 06-07-2018
 */
public class BindingExample {

  public static void main(String[] args){

    Dog dog = new Dog(); // Static binding
    dog.eat();
    Animal animal = new Dog(); // Dynamic binding
    animal.eat();
  }
}


class Animal{
  void eat(){System.out.println("animal is eating...");}
}

class Dog extends Animal{
  void eat(){System.out.println("dog is eating...");}

  public static void main(String args[]){
    Animal a=new Dog();
    a.eat();
  }
}
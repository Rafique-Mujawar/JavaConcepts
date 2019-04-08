package com.samples.usage;

/**
 * This class briefs about inheritance in java
 * Mechanism in which one object acquires all the properties and behaviors of parent object.
 * Reuse methods and fields of parent class i.e. For Code Re usability
 * Represents the IS-A relationship
 * For Method Overriding (so runtime polymorphism can be achieved)
 * 3 Types:  1)single, 2)multilevel and 3)hierarchical
 * Every class is implicitly a subclass of Object.
 * Multiple inheritance is not supported in java through class, To reduce the complexity and simplify.
 * but supported through interfaces (diamond of death).
 * A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
 * Constructors are not members, so they are not inherited by subclasses,
 * but the constructor of the superclass can be invoked from the subclass.
 * Constructor can not be inherited:  Constructors are special and have same name as class name.
 * So if constructors were inherited in child class then child class would contain
 * a parent class constructor which is against the constraint that constructor should have same
 * name as class name.
 *
 * @author Rafique Mujawar
 * Date 05-07-2018
 */
public class InheritanceExample {
}


//TODO: This is Parent class also called as super class or base class
class Parent {
  String var1;
  int var2;

  public Parent() {
  }

  public String readValues() {
    return var1 + " " + var2;
  }
}

/**
 * What You Can Do in a Subclass
 * A subclass inherits all of the public and protected members of its parent,
 * no matter what package the subclass is in. If the subclass is in the same package as its parent,
 * it also inherits the package-private members of the parent. You can use the inherited members
 * as is, replace them, hide them, or supplement them with new members:
 * <p>
 * The inherited fields can be used directly, just like any other fields.
 * You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
 * You can declare new fields in the subclass that are not in the superclass.
 * The inherited methods can be used directly as they are.
 * You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
 * You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
 * You can declare new methods in the subclass that are not in the superclass.
 * You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.
 * </P>
 */
class Single extends Parent {
  String var3;

  @Override
  public String readValues() {
    return super.readValues() + " " + var3;
  }

  public String readMyValuesOnly() {
    return var3;
  }
}


/**
 * TODO: Example of Multilevel Inheritance, this class extends {@link Single} which in turn
 * extends
 * Private Members in a Superclass
 A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods for accessing its private fields, these can also be used by the subclass.
 A nested class has access to all the private members of its enclosing class—both fields and methods. Therefore, a public or protected nested class inherited by a subclass has indirect access to all of the private members of the superclass.
 * {@link Parent} class
 */
class MultiLevel extends Single {
  int var4;
}

/**
 * TODO: Example of hierarchical, check {@link Single} and this both are extending {@link Parent}
 * class
 */
class Child extends Parent {

  String var2;

  public Child(String var2) {
    super();
    this.var2 = var2;
  }
}
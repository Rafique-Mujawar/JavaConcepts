package com.samples.usage;

/**
 * One object depends on other object to use functionality of other object.this dependency is
 * called association.
 * Composition:We refer association between two objects as Composition,
 * when one class owns other class and other class can not meaningfully exist, when it's owner destroyed,
 * for example, Human class is a composition of several body parts including Hand, Leg and Heart.
 * While in the case of Aggregation, including object can exists without being part of the main object
 * e.g. a Player which is part of a Team, can exist without a team and can become part of other teams as well
 *
 * @author Rafique Mujawar
 * Date 05-07-2018
 */
public class AssociationExample {
}

//Example of composition
class CompositionCar {
  //final will make sure engine is initialized
  private final Engine engine;

  public CompositionCar() {
    engine = new Engine();
  }
}

class Engine {
  private String type;
}

//Aggregation example
class AggregationOrganization {
  private Person employees;
}

class Person {
  private String name;
}
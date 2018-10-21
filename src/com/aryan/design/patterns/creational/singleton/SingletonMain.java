package com.aryan.design.patterns.creational.singleton;


import static junit.framework.Assert.assertEquals;

public class SingletonMain {


  public static void main(String[] args) {
    EagerInitialisationSingleton eagerInitialisationSingleton1 = EagerInitialisationSingleton
        .getInstance();
    EagerInitialisationSingleton eagerInitialisationSingleton2 = EagerInitialisationSingleton
        .getInstance();
    System.out.println(eagerInitialisationSingleton1.getName());
    System.out.println(eagerInitialisationSingleton2.getName());

    assertEquals(eagerInitialisationSingleton1, eagerInitialisationSingleton2);
    // similaryly other classes can be checked.
  }


}


package com.aryan.design.patterns.creational.singleton;

public class LazySingleton {

  private LazySingleton() {

  }

  private static LazySingleton instance;

  // Thread unsafe initialization. Multiple thread can access this function at one point in time.
  public static LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }
}

package com.aryan.design.patterns.creational.singleton;

public class ThreadSafeSingleton {

  private ThreadSafeSingleton() {
  }

  private static ThreadSafeSingleton instance;


  // thread safe singleton lazy initialization. Only one thread can execute this method at a time.
  // incurs additional cost each time a thread  want to  get instance.
  public static synchronized ThreadSafeSingleton getInstance() {
    if (instance == null) {
      instance = new ThreadSafeSingleton();
    }
    return instance;
  }

  // Solution 2 using double checking locking principle

  public static ThreadSafeSingleton getInstance1() {
    if (instance == null) {
      synchronized (ThreadSafeSingleton.class) {
        if (instance == null) {
          instance = new ThreadSafeSingleton();
        }
      }
    }
    return instance;
  }
}

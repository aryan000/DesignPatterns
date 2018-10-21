package com.aryan.design.patterns.creational.singleton;

import lombok.Getter;

public class EagerInitialisationSingleton {

  @Getter
  private static EagerInitialisationSingleton instance = new EagerInitialisationSingleton();

  @Getter
  private String name ="SingleTonClass";

  private EagerInitialisationSingleton() {

  }


}

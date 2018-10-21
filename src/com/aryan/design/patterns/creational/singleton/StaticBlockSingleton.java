package com.aryan.design.patterns.creational.singleton;

import lombok.Getter;

public class StaticBlockSingleton {

  private StaticBlockSingleton() {
  }

  @Getter
  private static StaticBlockSingleton instance;

  static {
    try {
      instance = new StaticBlockSingleton();
    } catch (Exception e) {
      throw new RuntimeException("Exception in creating this singleton instance");
    }
  }



}

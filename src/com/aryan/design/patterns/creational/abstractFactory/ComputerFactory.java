package com.aryan.design.patterns.creational.abstractFactory;

public class ComputerFactory {


  public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory) {
    return computerAbstractFactory.createComputer();
  }
}

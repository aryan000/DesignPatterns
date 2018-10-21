package com.aryan.design.patterns.creational.abstractFactory;

public class ComputerFactoryMain {

  public static void main(String[] args) {
    Computer laptop = ComputerFactory.getComputer(new LaptopFactory("16GB", "2.2GHZ", "500GB"));
    Computer pc = ComputerFactory.getComputer(new PCFactory("8GB", "2.1GHZ", "500GB"));
    Computer server = ComputerFactory.getComputer(new ServerFactory("32GB", "2.8GHZ", "512GB"));

    System.out.println("laptop configuration is : " + laptop);
    System.out.println("pc configuration is : " + pc);
    System.out.println("server configuration is : " + server);
  }
}

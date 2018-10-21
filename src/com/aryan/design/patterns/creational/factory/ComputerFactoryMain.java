package com.aryan.design.patterns.creational.factory;

import com.aryan.design.patterns.creational.factory.ComputerFactory.COMPUTER_TYPE;

public class ComputerFactoryMain {

  public static void main(String[] args) {
    Computer laptop = ComputerFactory.getComputer(COMPUTER_TYPE.LAPTOP);
    Computer pc = ComputerFactory.getComputer(COMPUTER_TYPE.PC);
    Computer server = ComputerFactory.getComputer(COMPUTER_TYPE.SERVER);

    System.out.println("laptop configuration is : " + laptop);
    System.out.println("pc configuration is : " + pc);
    System.out.println("server configuration is : " + server);
  }
}

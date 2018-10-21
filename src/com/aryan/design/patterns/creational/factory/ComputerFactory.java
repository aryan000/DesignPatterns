package com.aryan.design.patterns.creational.factory;

public class ComputerFactory {

    public static enum COMPUTER_TYPE {
    PC,
    LAPTOP,
    SERVER;
  }

  public static Computer getComputer(COMPUTER_TYPE computer_type){
    if(computer_type.equals(COMPUTER_TYPE.LAPTOP)){
      return new Laptop("8gb","2.4GHz","1TB");
    } else if(computer_type.equals(COMPUTER_TYPE.PC)){
      return new PC("4gb","2.1Ghz","500gb");
    } else if(computer_type.equals(COMPUTER_TYPE.SERVER)){
      return new Server("16gb","2.4Ghz","256GB");
    } else return null;
  }
}

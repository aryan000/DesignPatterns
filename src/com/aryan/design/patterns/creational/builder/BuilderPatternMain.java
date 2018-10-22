package com.aryan.design.patterns.creational.builder;

public class BuilderPatternMain {

  public static void main(String[] args) {
    Computer computer = new Computer.ComputerBuilder("1TB", "4GB").setBluetoothEnabled(true)
        .build();
    System.out.println(computer);

    try {
      ComputerLombokBuilder computer1 = ComputerLombokBuilder.builder().hdd("1TB")
          .isBluetoothEnabled(true).build();
    } catch (Exception e) {
      if (e instanceof NullPointerException) {
        System.out.println(
            "Null pointer is expected as you have not provided ram for the computerlombok builder");
      } else {
        System.out.println(e);
      }
    }

    ComputerLombokBuilder computer2 = ComputerLombokBuilder.builder().hdd("1TB").ram("8GB")
        .isGraphicEnabled(true).build();

    System.out.println(computer2);

    // custom builder like lombok.

    CustomComputer customComputer = CustomComputer.builder().setHdd("500GB").setRam("3GB")
        .setGraphicEnabled(true).build();

    System.out.println(customComputer);


  }
}

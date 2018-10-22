package com.aryan.design.patterns.creational.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Computer {


  // required
  private String hdd;
  private String ram;

  // optional
  private boolean isGraphicEnabled;
  private boolean isBluetoothEnabled;

  public Computer(ComputerBuilder computerBuilder) {
    this.hdd = computerBuilder.hdd;
    this.ram = computerBuilder.ram;
    this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    this.isGraphicEnabled = computerBuilder.isGraphicEnabled;
  }

  public static class ComputerBuilder{
    // required
    private String hdd;
    private String ram;

    public ComputerBuilder setGraphicEnabled(boolean graphicEnabled) {
      this.isGraphicEnabled = graphicEnabled;
      return this;
    }

    // optional
    private boolean isGraphicEnabled;

    public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
      this.isBluetoothEnabled = bluetoothEnabled;
      return this;
    }

    private boolean isBluetoothEnabled;

    // Public constructor with all the required attributes.
    public ComputerBuilder(String hdd, String ram) {
      this.hdd = hdd;
      this.ram = ram;
    }

    public Computer build(){
      return new Computer(this);
    }

  }
}

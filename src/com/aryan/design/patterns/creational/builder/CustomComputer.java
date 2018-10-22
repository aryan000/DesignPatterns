package com.aryan.design.patterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class CustomComputer {

  // required
  private String hdd;
  private String ram;

  // optional
  private boolean isGraphicEnabled;
  private boolean isBluetoothEnabled;


  public static CustomComputerBuilder builder() {
    return new CustomComputerBuilder();
  }

  public CustomComputer(CustomComputerBuilder customComputerBuilder) {
    this.hdd = customComputerBuilder.hdd;
    this.isBluetoothEnabled = customComputerBuilder.isBluetoothEnabled;
    this.ram = customComputerBuilder.ram;
    this.isGraphicEnabled = customComputerBuilder.isGraphicEnabled;
  }


  @NoArgsConstructor
  static class CustomComputerBuilder {


    public CustomComputerBuilder setHdd(String hdd) {
      this.hdd = hdd;
      return this;
    }

    // required
    private String hdd;

    public CustomComputerBuilder setRam(String ram) {
      this.ram = ram;
      return this;
    }

    private String ram;

    public CustomComputerBuilder setGraphicEnabled(boolean graphicEnabled) {
      this.isGraphicEnabled = graphicEnabled;
      return this;
    }

    // optional
    private boolean isGraphicEnabled;

    public CustomComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
      this.isBluetoothEnabled = bluetoothEnabled;
      return this;
    }

    private boolean isBluetoothEnabled;

    public CustomComputer build() {
      return new CustomComputer(this);
    }
  }
}

package com.aryan.design.patterns.creational.factory;

import lombok.Data;

@Data
public class Server implements Computer {

  // Overriding Computer functions with lombok Getter annotation.
  private String ram;
  private String cpu;
  private String hdd;

  Server(String ram, String cpu, String hdd) {
    this.ram = ram;
    this.cpu = cpu;
    this.hdd = hdd;
  }
}

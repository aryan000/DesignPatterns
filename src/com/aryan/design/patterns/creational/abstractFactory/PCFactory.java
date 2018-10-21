package com.aryan.design.patterns.creational.abstractFactory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PCFactory implements ComputerAbstractFactory {

  // Overriding Computer functions with lombok Getter annotation.
  private String ram;
  private String cpu;
  private String hdd;

  @Override
  public Computer createComputer() {
    return new PC(ram,cpu,hdd);
  }
}

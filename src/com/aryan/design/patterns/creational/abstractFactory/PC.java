package com.aryan.design.patterns.creational.abstractFactory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PC implements Computer {

  // Overriding Computer functions with lombok Getter annotation.
  private String ram;
  private String cpu;
  private String hdd;


}

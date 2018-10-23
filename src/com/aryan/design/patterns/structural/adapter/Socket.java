package com.aryan.design.patterns.structural.adapter;

import lombok.Data;

@Data
public class Socket {

  // socket always return 120 volts.
  public Volts getVolts() {
    return new Volts(120);
  }
}

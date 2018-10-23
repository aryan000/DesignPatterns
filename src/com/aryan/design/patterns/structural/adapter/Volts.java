package com.aryan.design.patterns.structural.adapter;

import lombok.Data;

@Data
public class Volts {
  private int volts;

  public Volts(int volts) {
    this.volts = volts;
  }
}

package com.aryan.design.patterns.structural.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

  @Override
  public Volts get120Volts() {
    return convertVolts(getVolts(), 1);
  }

  @Override
  public Volts get10Volts() {
    return convertVolts(getVolts(), 12);
  }

  @Override
  public Volts get3Volts() {
    return convertVolts(getVolts(), 40);
  }

  private Volts convertVolts(Volts volts, int factor) {
    return new Volts(volts.getVolts() / factor);
  }
}

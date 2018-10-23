package com.aryan.design.patterns.structural.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

  private Socket socket = new Socket();

  @Override
  public Volts get120Volts() {
    return convertVolts(socket.getVolts(), 1);
  }

  @Override
  public Volts get10Volts() {
    return convertVolts(socket.getVolts(), 12);
  }

  @Override
  public Volts get3Volts() {
    return convertVolts(socket.getVolts(), 40);
  }

  private Volts convertVolts(Volts volts, int factor) {
    return new Volts(volts.getVolts() / factor);
  }
}

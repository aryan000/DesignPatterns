package com.aryan.design.patterns.structural.adapter;

public class AdapterMain {

  public static void main(String[] args) {

    // using class based adapter

    SocketAdapter socketAdapter = new SocketClassAdapterImpl();
    Volts laptop = socketAdapter.get10Volts();
    Volts mobile = socketAdapter.get3Volts();
    Volts press = socketAdapter.get120Volts();

    System.out.println("volts required for laptop is ; " + laptop);
    System.out.println("volts required for mobile is ; " + mobile);
    System.out.println("volts required for press is ; " + press);

    // using Object based adapter

    SocketAdapter socketObjectAdapter = new SocketObjectAdapterImpl();
    Volts laptop1 = socketObjectAdapter.get10Volts();
    Volts mobile1 = socketObjectAdapter.get3Volts();
    Volts press1 = socketObjectAdapter.get120Volts();

    System.out.println("volts required for laptop is ; " + laptop1);
    System.out.println("volts required for mobile is ; " + mobile1);
    System.out.println("volts required for press is ; " + press1);
  }
}

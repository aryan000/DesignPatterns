package com.aryan.design.patterns.creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Builder
@ToString
@Getter
public class ComputerLombokBuilder {

  // required
  @NonNull private String hdd;
  @NonNull private String ram;

  // optional
  private boolean isGraphicEnabled;
  private boolean isBluetoothEnabled;
}

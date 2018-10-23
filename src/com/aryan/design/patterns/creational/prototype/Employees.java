package com.aryan.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class Employees implements Cloneable {

  @Getter
  private List<String> empList;

  public Employees(List<String> empList) {
    this.empList = empList;
  }

  public Employees() {
    empList = new ArrayList<String>();
  }

  public void addData(String employeeName) {
    empList.add(employeeName);
  }

  @Override
  public Employees clone() throws CloneNotSupportedException {
    List<String> temp = new ArrayList<String>();
    temp.addAll(this.empList);
    return new Employees(temp);
  }

}

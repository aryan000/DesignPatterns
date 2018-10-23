package com.aryan.design.patterns.creational.prototype;

import java.util.List;

public class PrototypePatternMain {

  public static void main(String[] args) throws CloneNotSupportedException {
    Employees employees = new Employees();
    employees.addData("Aryan");
    employees.addData("Rahul");
    employees.addData("Rohan");

    Employees employees1 = employees.clone();
    Employees employees2 = employees.clone();

    List<String> list2 = employees1.getEmpList();
    list2.add("maria");

    List<String> list3 = employees2.getEmpList();
    list3.remove("Rahul");

    System.out.println("list1 is : " + employees.getEmpList());
    System.out.println("list2 is : " + list2);
    System.out.println("list3 is : " + list3);


  }
}

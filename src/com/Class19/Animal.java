package com.Class19;

public class Animal {
    
    
//  Create a class call Animal have properies like breed, weight, age, name and methods line canBark,isWild
//
//  make the name variable static
//
//  Create another class called Application
//  from this application class create 3 diffrent instances/objects of it and print the properties and functions/methods

  String breed = "Husky";
  int weight = 100;
  int age = 15;
  static String name = "George";//static oldugu icin diger sayfada veri olarak kullanamayiz
  
  boolean canBark() {
      return true;
      
  }
  
  boolean isWild() {
      return false;
  }
  
  
  
}

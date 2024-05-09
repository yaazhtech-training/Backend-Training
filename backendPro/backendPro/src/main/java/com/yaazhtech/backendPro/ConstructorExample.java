package com.yaazhtech.backendPro;

import org.springframework.scheduling.SchedulingAwareRunnable;

public class ConstructorExample {
    // Create a Main class
        int x;  // Create a class attribute

        // Create a class constructor for the Main class
        public ConstructorExample() {
            x = 5;  // Set the initial value for the class attribute x
        }

        public static void main(String[] args) {
            ConstructorExample myObj = new ConstructorExample(); // Create an object of class Main (This will call the constructor)
            System.out.println(myObj.x); // Print the value of x

    }
}

//Parameterized
/*
public class Main {
  int modelYear;
  // dataype-int, variable name=modelYear, Value-1972
  String modelName;
  byte ans=110;
  short sh=32700;
  
    public Main(int year, String name) {
    modelYear = year; //1969
    modelName = name; //Mustang
  }

  public static void main(String[] args) {
    Main myCar = new Main(1972 , "Anitha");//
    System.out.println(myCar.modelYear + " " + myCar.modelName);

  }
}

 */


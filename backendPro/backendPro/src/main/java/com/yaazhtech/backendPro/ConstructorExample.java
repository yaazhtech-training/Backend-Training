package com.yaazhtech.backendPro;

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

public class Main {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");//
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

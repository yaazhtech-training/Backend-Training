package com.yaazhtech.backendPro;

import org.springframework.boot.autoconfigure.SpringBootApplication;
    @SpringBootApplication
    abstract class Shape  {
       abstract int area(); //method declaration

   }
class Square extends Shape {
    int area()
    { //method implementation
        //Square's area logic
        int side=5;
        return side * side;
    }
}

class Rectangle extends Shape  {
    @Override
    int area() {
        int length = 5;
        int width=4;
        //Rectangle's area Logic
        return length * width;
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        System.out.println("Area of square: " + square.area());
        System.out.println("Area of rectangle: " + rectangle.area()); //calling method
    }
}



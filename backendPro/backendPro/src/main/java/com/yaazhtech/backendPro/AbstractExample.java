package com.yaazhtech.backendPro;

import org.springframework.boot.autoconfigure.SpringBootApplication;
    @SpringBootApplication
    abstract class Shape  {
       abstract int area(); //method declaration

   }
class Square extends Shape  {
    private int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    int area() { //method implementation
        return side * side;
    }
}

class Rectangle extends Shape  {
    private int length; //data varaiable
    private int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    int area() {
        return length * width;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Square square = new Square(5); //25.0
        Rectangle rectangle = new Rectangle(4, 6); //24.0

        System.out.println("Area of square: " + square.area());
        System.out.println("Area of rectangle: " + rectangle.area()); //calling method
    }
}



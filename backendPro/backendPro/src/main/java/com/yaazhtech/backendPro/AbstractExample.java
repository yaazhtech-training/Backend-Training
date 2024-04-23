package com.yaazhtech.backendPro;

import org.springframework.boot.autoconfigure.SpringBootApplication;
    @SpringBootApplication
    abstract class Shape  {
       abstract double area();

   }
class Square extends Shape  {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

class Rectangle extends Shape  {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area of square: " + square.area());
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}



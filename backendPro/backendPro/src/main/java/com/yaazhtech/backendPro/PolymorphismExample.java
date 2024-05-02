package com.yaazhtech.backendPro;

class Operation {
    public int performOperation(int num1, int num2) {
        return 0; // Default implementation, overridden by subclasses
    }
}

class Addition extends Operation {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class Subtraction extends Operation {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 - num2;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Operation op1 = new Addition();
        Operation op2 = new Subtraction();

        int num1 = 10;
        int num2 = 5;

        System.out.println("Result of addition: " + op1.performOperation(num1, num2));
        System.out.println("Result of subtraction: " + op2.performOperation(num1, num2));
    }
}

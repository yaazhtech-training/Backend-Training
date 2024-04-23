package com.yaazhtech.backendPro;

import lombok.Getter;
import lombok.Setter;

public class EncapsulationExample {
    @Setter
    private int num1;
    @Setter
    private int num2;
    @Getter
    private int result;

    public void add() {
        result = num1 + num2;
    }
    public static void main(String[] args) {
        EncapsulationExample addition = new EncapsulationExample();
        addition.setNum1(5);
        addition.setNum2(3);
        addition.add();
        System.out.println("Result of addition: " + addition.getResult());
    }
}

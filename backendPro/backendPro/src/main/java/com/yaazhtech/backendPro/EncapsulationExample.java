package com.yaazhtech.backendPro;

import lombok.Getter;
import lombok.Setter;

 class EncapsulationEx {
    @Setter
    private int num1;
    @Setter
    private int num2;
    @Getter
    private int result;

    public void add() {
        result = num1 + num2;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        EncapsulationEx addition = new EncapsulationEx();
        addition.setNum1(5);
        addition.setNum2(3);
        //addition.num1=5; //it will show error as private access
       // addition.num2=3; //it will show error as private access
        addition.add();
        System.out.println("Result of addition: " + addition.getResult());
    }
}

package com.yaazhtech.backendPro;

public class polymorphism {
    public static void main(String[] args) {
        method obj1 = new method();
        obj1.display(9);
        obj1.display(7);
    }
}
class method{
    void display(){
        System.out.println();
    }
    void display(int a){
        System.out.println(a);
    }
}
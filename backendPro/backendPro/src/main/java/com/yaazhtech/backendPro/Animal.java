package com.yaazhtech.backendPro;

abstract class animal1 {
    abstract void makesound();
}
class Dog extends animal1 {
    void makesound() {
        System.out.println("Dog BARKS");
    }
}
class Cat extends animal1 {
    void makesound() {
        System.out.println("Cat MEOWS");
    }
}
public class Animal{
    public static void main(String [] args){
        Dog dog = new Dog();
        dog.makesound();
        Cat cat = new Cat();
        cat.makesound();
    }
}
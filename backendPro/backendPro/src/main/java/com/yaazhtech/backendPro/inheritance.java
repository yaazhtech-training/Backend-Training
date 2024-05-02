package com.yaazhtech.backendPro;

 public class inheritance {
    int nolegs =4;
    public static void eat(){
        System.out.println("i am eating");
    }
    public static void walk(){
        System.out.println("i am walking");
    }
}
class Cow extends inheritance{


}

class call{
    public static void main(String[] args){
        inheritance a = new inheritance ();
        System.out.println(a.nolegs);
        a.eat();
        a.walk();

    }
}

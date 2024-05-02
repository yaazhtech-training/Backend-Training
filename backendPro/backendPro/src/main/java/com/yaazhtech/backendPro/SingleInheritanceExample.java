package com.yaazhtech.backendPro;
import java.io.*;
import java.lang.*;
import java.util.*;

 class A  {
    // Java program to illustrate the
// concept of single inheritance
    // Parent class
        public void print_name()
        {
            System.out.println("Anitha");
        }
    }
    class B extends A  {
        public void print_for()
        { System.out.println("for"); }
    }

    class C extends B {
        public void print_c() {
            System.out.println("class C");
        }
    }

    // Driver class
    public class SingleInheritanceExample {
        // Main function
        public static void main(String[] args) {
            B g = new B();
            g.print_name();
            g.print_for();
            g.print_name();
            C c=new C();
            c.print_for();
            c.print_c();
        }
    }

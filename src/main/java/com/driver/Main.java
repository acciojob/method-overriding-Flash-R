package com.driver;

public class Main {
    public static void main(String[] args) {

        A a = new A();
        a.meth();

        B b = new B();
        b.meth();
    }
  
}

class A {
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    @Override
    public String meth() {
        return "Invoking method from class B";
    }
}
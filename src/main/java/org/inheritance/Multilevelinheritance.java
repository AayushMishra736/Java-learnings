package org.inheritance;

class A {
    void a(){
        System.out.println("This is method a.");
    }
}

class B extends A{
    void b(){
        System.out.println("This is method b.");
    }
}
class C extends B{
    void c(){
        System.out.println("This is medthod c.");
    }
}

public class Multilevelinheritance {
    public static void main(String[] args) {
    C c = new C();
    c.a();
    c.b();
    c.c();
    }
}

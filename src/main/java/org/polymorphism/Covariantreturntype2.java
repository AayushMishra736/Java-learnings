package org.polymorphism;

class A1{
    A1 foo(){
        return this;
    }
    void print(){
        System.out.println("This is return type from A1");
    }
}

class B1 extends A1{
    A1 foo(){
        return this;
    }
    void print(){
        System.out.println("This is return type from B1.");
    }
}

class C1 extends B1{
    @Override
    A1 foo() {
        return this;
    }
    void print(){
        System.out.println("This is return type from C1.");
    }

}

public class Covariantreturntype2 {

    public static void main(String[] args) {
        A1 a = new A1();
        a.foo().print();

        B1 b = new B1();
        ((B1)b.foo()).print();
        
        C1 c = new C1();
        ((C1)c.foo()).print();


    }
}

package org.polymorphism;

class A{
    A get(){
        return this;
    }
}

class B extends A{
    @Override
    B get(){
        return this;
    }
    void message(){
        System.out.println("return type may vary accordingly.");
    }
    public static void main(String[] args) {
    new B().get().message();
    }
}
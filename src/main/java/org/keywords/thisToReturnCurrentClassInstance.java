package org.keywords;

class P{
    void method(){
        System.out.println("Calling method from P class.   " + this);
    }
}

public class thisToReturnCurrentClassInstance {
    public static void main(String[] args) {
        P p = new P();
        p.method();
    }
}

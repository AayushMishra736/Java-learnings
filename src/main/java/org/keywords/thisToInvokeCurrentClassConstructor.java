package org.keywords;

class C {
    int Y;

    public C() {
        this(1);
        System.out.println("This is calling from no arg constructor.");
    }

    public C(int x) {
        Y = x;
        System.out.println("This is calling from one arg constructor.");
    }
}

public class thisToInvokeCurrentClassConstructor {
    public static void main(String[] args) {
    C c = new C();
    }
}

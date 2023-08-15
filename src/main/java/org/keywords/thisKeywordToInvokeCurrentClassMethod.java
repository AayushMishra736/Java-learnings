package org.keywords;


class A{
    void m(){
        System.out.println("This is method m");
    }
    void n(){
        System.out.println("This is n method trying to call m");
        this.m();
    }
}

public class thisKeywordToInvokeCurrentClassMethod {
    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}

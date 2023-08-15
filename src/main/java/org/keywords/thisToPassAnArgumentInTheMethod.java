package org.keywords;

class D {

    void firstMethod(D obj){
        System.out.println("Method invoked");
    }

    void secondMethod(){
        firstMethod(this);
    }
}


public class thisToPassAnArgumentInTheMethod {
    public static void main(String[] args) {
        D d = new D();
        d.secondMethod();
    }
}

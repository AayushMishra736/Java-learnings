package org.keywords;

class E{
    F obj;
    public E(F obj){
        this.obj = obj;
    }

    void display(){
        System.out.println(obj.data);
    }
}

class F{
    int data = 10;

    public F(){
        E e = new E(this);
        e.display();
    }
}

public class thisToPassAnArgumentInTheConstructorCall {
    public static void main(String[] args) {
        F f = new F();
    }
}

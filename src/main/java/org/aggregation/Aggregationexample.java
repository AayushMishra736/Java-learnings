package org.aggregation;

class Operation{
    int square(int v){
        return  v * v;
    }
}

class Circle{
    Operation op;
    void area(int r){
        op = new Operation();
        double result = 2 * 3.14 * op.square(r);
        System.out.println("Area of circle is : " + result);
    }
}

public class Aggregationexample {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(10);
    }
}

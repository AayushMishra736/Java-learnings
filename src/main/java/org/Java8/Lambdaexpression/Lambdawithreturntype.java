package org.Java8.Lambdaexpression;

interface Addable {
    int add(int a, int b);
}

public class Lambdawithreturntype {
    public static void main(String[] args) {
        Addable a = (first, second) -> {
            return first + second;
        };
        System.out.println(a.add(10, 20));
    }
}

package org.Java8.Lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class Lambdawithforeachloop {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        list.forEach(n -> System.out.println(n));
    }
}

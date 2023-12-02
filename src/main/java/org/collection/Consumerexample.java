package org.collection;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Consumerexample {
    public static void main(String[] args) {

        Consumer<String> stringConsumer = (str) -> System.out.println(str);
        stringConsumer.accept("Hi This is java");


        Supplier<Double> randomNumberSupplier = () -> Math.random();
        double randomNumberSupplierRes = randomNumberSupplier.get();
        

    }
}

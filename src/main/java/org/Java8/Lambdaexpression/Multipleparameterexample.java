package org.Java8.Lambdaexpression;

interface Eatable{
    void eat(String f, String q);
}

public class Multipleparameterexample {
    public static void main(String[] args) {
        Eatable e = (Sandwich,good)->{
            System.out.println("I want to eat " + Sandwich + " of " + good + " quality.");
        };
        e.eat("Sandwich","Good");
    }
}

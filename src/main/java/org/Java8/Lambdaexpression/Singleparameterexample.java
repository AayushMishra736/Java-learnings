package org.Java8.Lambdaexpression;

interface Sayable{
    void say(String s);
}

public class Singleparameterexample {
    public static void main(String[] args) {
        Sayable s = (name)->{
            System.out.println("What you want to say " + name);
        };
        s.say("Nothing");
    }
}

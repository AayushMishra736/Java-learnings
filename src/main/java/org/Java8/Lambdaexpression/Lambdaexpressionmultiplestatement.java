package org.Java8.Lambdaexpression;

interface Printable{
    String say(String str);
}

public class Lambdaexpressionmultiplestatement {
    public static void main(String[] args) {

        Printable p = (print)->{
            String str1 = "I want to print ";
            return str1 + "the return statement";
        };

        p.say(" for the multiple time.");

    }
}

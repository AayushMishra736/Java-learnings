package datastructure.basicprograms;

public class Swaptownumberusingthirdvariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping two values number is a " + a + " b " + b);
    }
}

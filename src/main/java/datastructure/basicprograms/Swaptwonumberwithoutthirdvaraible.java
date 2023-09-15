package datastructure.basicprograms;

public class Swaptwonumberwithoutthirdvaraible {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swiping the value of a " + a + " and b is " + b);
    }
}

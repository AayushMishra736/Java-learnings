package org.exception;

public class nestedTry {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            try {
                try {
                    a[10] = 7;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("This is finally block...");
        }
    }
}

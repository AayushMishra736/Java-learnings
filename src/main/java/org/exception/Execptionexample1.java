package org.exception;

public class Execptionexample1 {
    public static void main(String[] args) {
        int a[] = new int[10];
        try {
            a[11] = 0;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Execption " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException " + e);
        }
        catch (Exception e){
            System.out.println("Exception " + e);
        }
    }
}

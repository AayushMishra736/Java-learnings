package org.exception;

public class Execptionexample2 {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[7] = 11;
        }
        catch (Exception e){
           System.err.println(e);
        }
        //it will throw compile time error.

//        catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
    }
}

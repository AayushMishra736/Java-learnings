package org.exception.throwexception;

public class Execptionpropagation {
    void m(){
        int data = 50/0;
    }
    void n(){
        m();
    }
    void o(){
        n();
    }

    public static void main(String[] args) {
        Execptionpropagation exp = new Execptionpropagation();
        try{
            exp.o();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

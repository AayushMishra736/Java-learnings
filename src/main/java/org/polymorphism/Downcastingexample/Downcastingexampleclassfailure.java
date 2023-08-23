package org.polymorphism.Downcastingexample;

class A{


}
public class Downcastingexampleclassfailure extends A {

    public static void main(String[] args) {
        //Downcastingexampleclassfailure ins = new A();//Downcastingexampleclassfailure
        Downcastingexampleclassfailure ins = (Downcastingexampleclassfailure) new A();
        System.out.println(ins instanceof A);//Compliation done but it will give classCastException is thrown at runTime

    }

}

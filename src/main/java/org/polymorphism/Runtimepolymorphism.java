package org.polymorphism;

class Bank{
    int getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

class ICICI extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 10;
    }
}
public class Runtimepolymorphism {

    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println(b.getRateOfInterest());

        b = new ICICI();
        System.out.println(b.getRateOfInterest());

        b = new PNB();
        System.out.println(b.getRateOfInterest());

    }
}

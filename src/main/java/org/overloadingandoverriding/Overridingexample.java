package org.overloadingandoverriding;

class Bank{
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

class CBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}

class ICICI extends Bank{
    int getRateOfInterest(){
        return 6;
    }
}

public class Overridingexample {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        CBI cbi = new CBI();
        ICICI icici = new ICICI();
        System.out.println("SBI bank " + sbi.getRateOfInterest());
        System.out.println("CBI bank " + cbi.getRateOfInterest());
        System.out.println("icici bank " + icici.getRateOfInterest());
    }
}

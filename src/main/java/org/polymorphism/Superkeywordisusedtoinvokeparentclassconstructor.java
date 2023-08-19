package org.polymorphism;

class Parentconstructor {
    int value;
    String data;

    public Parentconstructor(int value, String data) {
        this.value = value;
        this.data = data;
        System.out.println("This is parent class constructor " +  this.value + " " + this.data);
    }

}

class childconstructor {
    int newvalue;
    String newData;

    public childconstructor(int newvalue,String newData) {
        super();
        this.newData = newData;
        this.newvalue = newvalue;
        System.out.println("This is from child class constructor " +  this.newData + this.newvalue);
    }
}

public class Superkeywordisusedtoinvokeparentclassconstructor {
    public static void main(String[] args) {
        childconstructor c = new childconstructor(1,"John");
    }
}

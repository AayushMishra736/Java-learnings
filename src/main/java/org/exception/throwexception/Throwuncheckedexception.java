package org.exception.throwexception;

public class Throwuncheckedexception {
    public static void main(String[] args) {
        agevalidate(10);
    }

    private static void agevalidate(int data) {
        if(data < 18){
            throw new RuntimeException("Not eligible to vote");
        }
        else{
            System.out.println("Eligible to vote.");
        }
    }
}

package org.exception.userdefinedexception;


class Userdefinedexception extends Exception{
    void userDefinedException(){
        System.out.println("This is custom exception");
    }
}

public class Example1 {
    public static void main(String[] args) {
        try{
           throw new Userdefinedexception();
        }
        catch(Userdefinedexception e){
         e.userDefinedException();
        }
    }
}

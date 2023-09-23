package org.exception.execptionHnadlingWthMethodOverriding;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Superclass {
    void method(){
        System.out.println("Example when super class does not declare an execption and child class declare checked execption.");
    }
}
// If the super class does not declare an execption and child class declare a checked execption it will throw
// compile time error
public class Superclassdoesnotdeclareanexecptionsubclassdeclaredcheckedexecption extends Superclass{
    // gives compile time error
//    void method() throws FileNotFoundException{
//           FileReader file = new FileReader("D:\\Practice\\Collections\\Javastarttoend\\src\\main\\java\\org\\exception\\throwexception\\student.txt");
//    }

    public static void main(String[] args) throws IOException {
    Superclassdoesnotdeclareanexecptionsubclassdeclaredcheckedexecption se = new Superclassdoesnotdeclareanexecptionsubclassdeclaredcheckedexecption();
    se.method();
    }
}

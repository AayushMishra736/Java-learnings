package org.exception.throwexception;

class Manualuserdefinedexecption extends Exception {
    public void userDefinedExecption(String str) {
        System.out.println("Throwing user defined execption --> " + str);
    }
}

public class Userdefinedexecption {
    public static void main(String[] args) {
        try {
            throw new Manualuserdefinedexecption();
        } catch (Manualuserdefinedexecption e) {
            e.userDefinedExecption("trying to throw an execption.");
        }
    }
}

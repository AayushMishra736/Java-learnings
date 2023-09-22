package org.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throwexception {
    public static void main(String[] args) throws FileNotFoundException {
    validate(20);
    //validate(16);
    String current = System.getProperty("user.dir");
    File file = new File(current  + "Student.txt");
    FileReader fileReader = new FileReader(current  + "Student.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    throw new FileNotFoundException();
    }

    public static void validate(int a){
        if(a < 18){
            throw new RuntimeException("Age is not valide to vote");
        }
        else{
            System.out.println("You can vote..");
        }
    }

}

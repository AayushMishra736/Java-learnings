package org.exception.throwexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throwingcheckedexception {

    public static void main(String[] args){
        try {
            FileReader file = new FileReader("D:\\Practice\\Collections\\Javastarttoend\\src\\main\\java\\org\\exception\\throwexception\\student.txt");
            BufferedReader br = new BufferedReader(file);
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
            throw new FileNotFoundException();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found at given location");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

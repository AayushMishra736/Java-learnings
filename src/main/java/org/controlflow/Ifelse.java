package org.controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ifelse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter city name : ");
        String city = reader.readLine();

        if(city.equalsIgnoreCase("Hyderabad")){
            System.out.println("You are in hyderabad!!");
        }
        else if(city.equalsIgnoreCase("Bangalore")){
            System.out.println("You are in bangalore");
        } else if (city.equalsIgnoreCase("Delhi")) {
            System.out.println("You are in NCR");
        }
    }

}

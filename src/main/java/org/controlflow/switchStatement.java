package org.controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchStatement {
    public static void main(String[] args) throws IOException {
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("End of week");
        }

    }
}

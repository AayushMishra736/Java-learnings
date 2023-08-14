package org.controlflow;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter college name : ");
        String value = sc.next();
        System.out.println("Enter year of placement : ");
        int year = sc.nextInt();
        System.out.println("Enter branch name : ");
        String branch = sc.next();
        switch (value) {
            case "IIT":
                System.out.println("IIT");
                break;
            case "BITS":
                System.out.println("BITS");
                switch (year) {
                    case 2019:
                        System.out.println("Year is 2019");
                        break;
                    case 2018:
                        System.out.println("Year is 2018");
                        switch (branch) {
                            case "ME":
                                System.out.println("ME");
                                break;
                            case "CS":
                                System.out.println("CS");
                                break;
                            default:
                                System.out.println("Civil");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Year is 2017");
                        break;
                }
                break;
            default:
                System.out.println("MAINIT");
        }
    }
}

package datastructure.basicprograms;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorialofgivennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int d = 1;
        for(int i = 1;i <= b;i++){
            d = d * i;
        }
        System.out.println(d);
    }
}

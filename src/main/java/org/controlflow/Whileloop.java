package org.controlflow;

public class Whileloop {
    //reverse a number
    public static void main(String[] args) {
      int n = 123;
      int result = 0;
      while(n != 0){
          int temp = n % 10;
          result = result * 10 + temp;
          n = n /10;
      }
        System.out.println(result);
    }
}

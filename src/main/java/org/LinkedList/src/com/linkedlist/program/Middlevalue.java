package org.LinkedList.src.com.linkedlist.program;

import java.util.LinkedList;
import java.util.Scanner;

public class Middlevalue {

	public static void main(String[] args) {
    LinkedList<Integer> linklist = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the capacity of linkedlist : ");
    int capacity = sc.nextInt();
    System.out.println("Enter the digits to fill : ");
    for(int i = 0;i < capacity ;i++) {
    	linklist.add(sc.nextInt());
      }
    System.out.println("LinkedList : " + linklist);
    
    if(linklist.size() % 2 == 0) {
    	int value = linklist.size() / 2;
    	System.out.println("Middle Value is " + linklist.get(value));
    }
    else {
    	int value = linklist.size() / 2 ;
    	System.out.println("Middle Value is " + linklist.get(value));
    }
    
    
	}

}

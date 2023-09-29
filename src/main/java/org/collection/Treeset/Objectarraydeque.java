package org.collection.Treeset;

import java.util.ArrayDeque;
import java.util.Iterator;

class Student {

    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class Objectarraydeque {
    public static void main(String[] args) {
        Student s1 = new Student(101, "student1", 23);
        Student s2 = new Student(102, "student2", 18);
        Student s3 = new Student(103, "student3", 21);
        Student s4 = new Student(104, "student4", 22);
        Student s5 = new Student(105, "student5", 20);

        ArrayDeque<Student> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(s1);
        arrayDeque.add(s2);
        arrayDeque.add(s3);
        arrayDeque.add(s4);
        arrayDeque.add(s5);

        Iterator<Student> itr = arrayDeque.iterator();

        while(itr.hasNext()){
            Student s = (Student) itr.next();
            System.out.println(s.id + " " + s.age + " " + s.name);
        }

        System.out.println("--------------------------------for loop--------------------------------");

        for(Student s : arrayDeque){
            System.out.println(s.id + " " + s.age + " " + s.name);
        }
    }
}

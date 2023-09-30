package org.collection.Collectionclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;
    String lastName;
    int age;

    public Student(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int compareTo(Student s) {
        if (s.age == age){
            return 0;
        } else if (age < s.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class Comparablereverseorder {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(101,"John1","last1",23));
        list.add(new Student(102,"John2","last2",21));
        list.add(new Student(103,"John3","last3",22));
        list.add(new Student(104,"John4","last4",18));
        list.add(new Student(105,"John5","last5",20));
        for(Student s : list){
            System.out.println(s.id + " " + s.age + " " + s.name + " " +s.lastName);
        }
        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.id + " " + s.age + " " + s.name + " " +s.lastName);
        }

    }
}

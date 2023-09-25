package org.collection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Student{
    int id;
    String name;
    int age;

    public Student(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class Arraylistexample3 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Tony",23);
        Student s2 = new Student(2,"Thor",24);
        Student s3 = new Student(3,"Captain",25);
        Student s4 = new Student(4,"Tony",26);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Iterator itr = list.iterator();

        while (itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println("Data is : " + st.id + st.age + st.name);
        }



    }
}

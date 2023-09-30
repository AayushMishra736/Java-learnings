package org.collection.Collectionclass.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int student_Id;
    String student_name;
    String student_address;
    int percentage;

    public Student(int student_Id, String student_name, String student_address, int percentage) {
        this.student_Id = student_Id;
        this.student_name = student_name;
        this.student_address = student_address;
        this.percentage = percentage;
    }
}

class Agecomparator implements Comparator<Student> {

    public int compare(Student s1,Student s2){
        if(s1.percentage == s2.percentage){
            return 0;
        }
        else if(s1.percentage > s2.percentage){
            return 1;
        }
        else {
            return -1;
        }

    }

}

public class Comparatoroperatorexample {
    public static void main(String[] args) {
        List<Student> liat = new ArrayList<>();
        liat.add(new Student(101,"JOHN1","address1",23));
        liat.add(new Student(102,"JOHN2","address2",21));
        liat.add(new Student(103,"JOHN3","address3",22));
        liat.add(new Student(104,"JOHN4","address4",20));

        for(Student s : liat){
            System.out.println(s.student_Id + " " + s.student_name + " " +s.student_address + " " + s.percentage);
        }

        Collections.sort(liat,new Agecomparator());

        for(Student s : liat){
            System.out.println(s.student_Id + " " +s.student_name + " " + s.student_address + " " +s.percentage);
        }

    }
}

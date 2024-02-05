package Interviewpractice;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    public Student(int id,String name,int age){
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int compareTo(Student st) {
        if (st.age > age) {
            return 1;
        } else if (st.age < age) {
            return -1;
        } else {
            return 0;
        }

    }

}


public class Example1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"John",23));
        list.add(new Student(1,"Tony",45));
        list.add(new Student(1,"Doremon",53));
        list.add(new Student(1,"Sinchan",13));

        Collections.sort(list);

        for(Student st: list){
            System.out.println(st.id + " " + st.name + " " + st.age);
        }
    }
}

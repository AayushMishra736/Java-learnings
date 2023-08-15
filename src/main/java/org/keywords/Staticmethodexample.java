package org.keywords;

class Student{
    int id;
    String name;
    static String college = "BITS";

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    static void change(){
        college = "IIT";
        System.out.println(college);
    }

}


public class Staticmethodexample {
    public static void main(String[] args) {
        System.out.println(Student.college);
        Student.change();
        Student s1 = new Student(101,"Abhay");
        Student s2 = new Student(102,"Aayush");
        System.out.println(s1.id + " " + s1.name + " " + s1.college);
    }
}

package org.Java8.ObjectCloneing;

class Course1 implements Cloneable {
    String subject1;
    String subject2;
    String subject3;

    public Course1(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class Student1 implements Cloneable {
    int id;
    String name;
    Course1 course1;

    public Student1(int id, String name, Course1 course1) {
        this.id = id;
        this.name = name;
        this.course1 = course1;
    }

    protected Object clone() throws CloneNotSupportedException {
        Student1 student1 = (Student1) super.clone();
        student1.course1 = (Course1) course1.clone();
        return student1;
    }
}

public class Deepcopyexample {
    public static void main(String[] args) {
        Course1 course1 = new Course1("Physics", "Maths", "Chemistrey");
        Student1 student1 = new Student1(111, "John", course1);
        Student1 student2 = null;
        try {
            student2 = (Student1) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(student1.course1.subject1);
    }
}

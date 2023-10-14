package org.Java8.ObjectCloneing;

class Course {
    String subject1;
    String subject2;
    String subject3;

    public Course(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

}

class Student implements Cloneable {
    int id;
    String name;
    Course course;

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

public class Shallowcopy {
    public static void main(String[] args) {
        Course course = new Course("Physics", "Maths", "Chemistry");
        Student s1 = new Student(101, "John", course);
        Student s2 = null;
        try {
            s2 = (Student) s1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(s1.course.subject1);
        s1.course.subject2 = "Economics";
        System.out.println(s1.course.subject2);
    }
}

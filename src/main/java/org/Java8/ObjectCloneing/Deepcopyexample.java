package org.Java8.ObjectCloneing;

class Subject implements Cloneable {
    String subject1;
    String subject2;
    String subject3;

    public Subject(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class School implements Cloneable {
    int id;
    String name;
    Subject subject;

    public School(int id, String name, Subject subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    protected Object clone() throws CloneNotSupportedException {
        School school = (School) super.clone();
        school.subject = (Subject) subject.clone();
        return school;
    }
}

public class Deepcopyexample {
    public static void main(String[] args) {
        Subject subject = new Subject("Phy", "Maths", "Chemistry");
        School sc = new School(101, "John", subject);
        School sc2 = null;
        try {
            sc2 = (School) sc.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(sc2.subject.subject1);
        sc2.subject.subject2 = "Economics";
        System.out.println(sc2.subject.subject2);
    }
}

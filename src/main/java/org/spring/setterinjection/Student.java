package org.spring.setterinjection;

public class Student {

    public String name;
    public Studentaddress studentaddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Studentaddress getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(Studentaddress studentaddress) {
        this.studentaddress = studentaddress;
    }
}

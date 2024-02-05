package org.Java8Que4stions;

import java.util.ArrayList;
import java.util.List;

class Employee{
    int id;
    String gender;

    public Employee(int i, String male) {
        this.id = id;
        this.gender = male;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee() {
    }
}

public class Example4 {
    public static void main(String[] args) {
        List<Employee> listOfMan  = new ArrayList<>();
        listOfMan.add(new Employee(1,"Male"));
    }
}

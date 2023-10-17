package org.Java8.PracticeQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString()
    {
        return "Employee Name: "+name+" age: "+age;
    }
}
public class Example2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 30));
        employeeList.add(new Employee("Alice", 25));
        employeeList.add(new Employee("Bob", 35));
        employeeList.add(new Employee("Eva", 28));
        employeeList.add(new Employee("David", 40));
        employeeList.add(new Employee("Grace", 32));
        employeeList.add(new Employee("Michael", 27));
        employeeList.add(new Employee("Sophia", 29));
        employeeList.add(new Employee("William", 33));
        employeeList.add(new Employee("Olivia", 26));
        employeeList.add(new Employee("James", 38));
        employeeList.add(new Employee("Emily", 31));
        employeeList.add(new Employee("John", 29));
        employeeList.add(new Employee("Mia", 34));
        employeeList.add(new Employee("Jacob", 24));
        employeeList.add(new Employee("Ava", 36));
        employeeList.add(new Employee("Liam", 23));
        employeeList.add(new Employee("Charlotte", 37));

        System.out.println("Employee age greater than 20.");
        List<String> listOfEmployee = employeeList.stream().filter(employee -> employee.getAge() > 20).map(Employee::getName).collect(Collectors.toList());
        System.out.println(listOfEmployee);

        Long countOfAge20 = employeeList.stream().filter(n -> n.getAge() == 25).collect(Collectors.counting());

        long intOfAge20 = employeeList.stream().filter(n -> n.getAge() >= 35).count();

        System.out.println(intOfAge20);

        System.out.println(countOfAge20);

        List<Employee> listName = employeeList.stream().filter(n -> n.getName().contains("John")).collect(Collectors.toList());

        System.out.println(listName);


    }
}

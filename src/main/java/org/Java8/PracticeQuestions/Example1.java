package org.Java8.PracticeQuestions;


import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int id;
    String subject;
    double percentage;

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return name + "-" + id + "-" + subject + "-" + percentage;
    }
}

public class Example1 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", 101, "Maths", 89));
        studentList.add(new Student("Alice", 102, "History", 75));
        studentList.add(new Student("Bob", 103, "English", 92));
        studentList.add(new Student("Sarah", 104, "Physics", 88));
        studentList.add(new Student("Michael", 105, "Chemistry", 76));
        studentList.add(new Student("Emily", 106, "Biology", 94));
        studentList.add(new Student("David", 107, "Computer Science", 91));
        studentList.add(new Student("Olivia", 108, "Art", 55));
        studentList.add(new Student("Daniel", 109, "Geography", 79));
        studentList.add(new Student("Sophia", 110, "Music", 34));
        studentList.add(new Student("William", 111, "Physical Education", 93));
        studentList.add(new Student("Emma", 112, "Economics", 81));
        studentList.add(new Student("Liam", 113, "Psychology", 90));
        studentList.add(new Student("Ava", 114, "Sociology", 87));
        studentList.add(new Student("James", 115, "Political Science", 86));
        studentList.add(new Student("Cena", 101, "Maths", 89));

        Map<Boolean,List<Student>> listWhoScoredMoreThan60 = studentList.stream().collect(Collectors.partitioningBy(student -> student.getPercentage()>60));
        List<Student> finalListWhoScoredMoreThan60 = listWhoScoredMoreThan60.get(true);
        System.out.println("finalListWhoScoredMoreThan60 " + finalListWhoScoredMoreThan60);

        List<Student> listOfEmployeeHavingIGreaterThan107 = studentList.stream().filter(student -> student.getId() > 107).collect(Collectors.toList());
        System.out.println("listOfEmployeeHavingIGreaterThan107 : " + listOfEmployeeHavingIGreaterThan107);

        Long count = studentList.stream().filter(student -> student.getPercentage() > 90).count();

        System.out.println("Total count of student having marks more that 90 : " + count);

        List<Student> studentNameWhoesName = studentList.stream().filter(student -> student.getName().equalsIgnoreCase("DAVID")).collect(Collectors.toList());

        System.out.println("Student whoes name is david : " + studentNameWhoesName);

        //Long studentWithMaxPercentage = Long.valueOf(String.valueOf(studentList.stream().mapToInt(value -> (int) value.getPercentage()).max()));

        //System.out.println(" studentWithMaxPercentage " + studentWithMaxPercentage);

//        List<Double> sortOnTheBasisOfAge = studentList.stream().sorted().map(Student::getPercentage).collect(Collectors.toList());
//
//        System.out.println("sortOnTheBasisOfAge : " + sortOnTheBasisOfAge);

        Optional<Student> studentName = studentList.stream().filter(a -> a.getName().equals("James")).findAny();

        System.out.println("StudentName whoes name is james : " + studentName);

        Double studentWithMaxPercentage = studentList.stream().map(Student::getPercentage).max(Double::compare).orElse((double) 0);

        System.out.println("studentWithMaxPercentage " + studentWithMaxPercentage);

        List<Student> sortedData = studentList.stream().sorted(Comparator.comparingDouble(stu -> stu.getPercentage())).collect(Collectors.toList());

        System.out.println("sortedData " + sortedData);
    }
}

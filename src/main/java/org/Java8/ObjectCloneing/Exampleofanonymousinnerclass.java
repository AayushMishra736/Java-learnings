package org.Java8.ObjectCloneing;

import java.util.Comparator;

class Student1 {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class Exampleofanonymousinnerclass {
    public static void main(String[] args) {
        Comparator<Student1> comp = new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.getId() - o2.getId();
            }
        };
        Comparator<Student1> student1Comparator = (Student1 o1, Student1 o2) -> o1.getId() - o2.getId();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running.....");
            }
        };

        runnable.run();

        Runnable runnable1 = () -> {
            System.out.println("Second thread is running....");
        };

        runnable1.run();

    }
}

package org.collection.Map.Hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

class Student {
    int id;
    String firstName;
    String lastName;
    int age;

    public Student(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}

public class Linkedhashmapobjectexample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "firstName1", "lastName1", 22);
        Student s2 = new Student(102, "firstName2", "lastName2", 24);
        Student s3 = new Student(103, "firstName3", "lastName3", 23);
        Student s4 = new Student(104, "firstName4", "lastName4", 21);
        Student s5 = new Student(105, "firstName5", "lastName5", 20);
        Student s6 = new Student(106, "firstName6", "lastName6", 25);

        LinkedHashMap<Integer, Student> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, s1);
        linkedHashMap.put(2, s2);
        linkedHashMap.put(3, s3);
        linkedHashMap.put(4, s4);
        linkedHashMap.put(5, s5);

        for (Map.Entry<Integer, Student> map : linkedHashMap.entrySet()) {
            int key = map.getKey();
            Student value = map.getValue();
            System.out.println("Key :" + key + "  " + "Value :" + value.id + " " + value.firstName + " " + value.lastName + " " + value.age);
        }
    }
}

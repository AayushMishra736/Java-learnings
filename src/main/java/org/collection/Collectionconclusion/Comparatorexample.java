package org.collection.Collectionconclusion;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    int id;
    int age;
    String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class IdComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.id > s2.id) {
            return 1;
        } else if (s1.id == s2.id) {
            return 0;
        } else
            return -1;
    }
}
class Agecomparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        }
        return -1;
    }

}

public class Comparatorexample {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList();
        al.add(new Student(101, 23, "Vijay"));
        al.add(new Student(106, 27, "Ajay"));
        al.add(new Student(105, 21, "Jai"));

        Collections.sort(al, new Agecomparator());

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.id + " : " + st.name + " : " + st.age);
        }

        Collections.sort(al, new IdComparator());
        Iterator itr2 = al.iterator();
        while(itr2.hasNext()){
            Student s2 = (Student) itr2.next();
            System.out.println(s2.id + " : " + s2.age + " : " + s2.name);
        }

        List<Student> ageSortedList = al.stream().sorted(Comparator.comparingInt(student -> student.getAge())).collect(Collectors.toList());
        for (Student st:ageSortedList){
            System.out.println(st.id + " : " + st.age + " : " + st.name);
        }
    }
}

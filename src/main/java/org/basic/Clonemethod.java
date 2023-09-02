package org.basic;

class Student implements Cloneable{
    int value;
    String data;

    public Student(int value, String data){
     this.value = value;
     this.data = data;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

public class Clonemethod
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Student std = new Student(101,"String data");
        Student obj = (Student) std.clone();
        System.out.println(obj.data + " " + obj.value);
    }
}

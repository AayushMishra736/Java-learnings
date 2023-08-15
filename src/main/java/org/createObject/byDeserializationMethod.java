package org.createObject;

import java.io.*;

class Student implements Serializable{
    int id;
    String name;

    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }

}


public class byDeserializationMethod {
    public static void main(String[] args) {
        try{
            Student student = new Student(101,"John");
            FileOutputStream file = new FileOutputStream("Student.txt");
            ObjectOutputStream objectOutputStream =new ObjectOutputStream(file);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            file.close();
            System.out.println(student.id + " " + student.name);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            FileInputStream fileInputStream = new FileInputStream("Student.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student deserializeObject = (Student) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(deserializeObject.id + " " + deserializeObject.name);
        } catch (IOException  | ClassNotFoundException e) {
           e.printStackTrace();
        }
    }
}

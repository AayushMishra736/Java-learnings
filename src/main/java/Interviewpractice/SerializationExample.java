package Interviewpractice;

import java.io.*;

class Studentss {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Studentss(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Studentss s1 = new Studentss(1, "Johny");
        FileOutputStream fileOutputStream = new FileOutputStream("Studentss.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(s1);
        objectOutputStream.flush();
        objectOutputStream.close();

        System.out.println("Serlization completed....");

        FileInputStream fileInputStream = new FileInputStream("Studentss.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Studentss s = (Studentss) objectInputStream.readObject();
        System.out.println(s.id + " : " + s.name);
        objectInputStream.close();
    }
}

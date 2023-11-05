package designpattern.singleton.breaksingletondesignpattern;

import java.io.*;

class Singletonserilization implements Serializable {
    public static Singletonserilization instance = new Singletonserilization();
    public Singletonserilization(){

    }

}


public class Serializationcausesingletonbreak {
    public static void main(String[] args) {
    try{
        Singletonserilization instance1 = Singletonserilization.instance;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("file.txt"));
        objectOutputStream.writeObject(instance1);
        objectOutputStream.close();

        ObjectInput in  = new ObjectInputStream(new FileInputStream("file.txt"));

        Singletonserilization instance2 = (Singletonserilization)in.readObject();
        in.close();

        System.out.println(" instance2 hashcode " + instance2.hashCode());
        System.out.println(" instance1 hashcode " + instance1.hashCode());
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
}

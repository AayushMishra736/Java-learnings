package org.collection.Arraylist;

import java.io.*;
import java.util.ArrayList;

public class Arraylistexmplae5 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        try{
         FileOutputStream fos = new FileOutputStream("file");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(al);
         oos.close();
         fos.close();

         FileInputStream fis = new FileInputStream("file");
         ObjectInputStream ois = new ObjectInputStream(fis);
         ArrayList list = (ArrayList)ois.readObject();
         System.out.println(list);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

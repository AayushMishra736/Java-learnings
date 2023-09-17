package org.string;

public class Stringbufferexample {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Why");
        s.append(" this");
        s.append(" is so ");
        s.insert(s.length(),"funny.");
        System.out.println(s);
        s.replace(0,3,"Do");
        System.out.println(s);
        s.delete(3,7);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        System.out.println(s.capacity());
        String s1 = "Java";
        long time1 = System.currentTimeMillis();
        for(int  i = 0; i <10000;i++){
         s1 = s1 + "tpoint";
        }
        System.out.println("Time taken in operation of string : " + (System.currentTimeMillis() - time1));
        StringBuffer s2 = new StringBuffer("Java");
        long time2 = System.currentTimeMillis();
        for(int i = 0;i < 10000;i++){
            s2.append("tpoint");
        }
        System.out.println("Time taken in operation of StringBuffer : " + (System.currentTimeMillis() - time2));
        StringBuilder s3 = new StringBuilder("Java");
        long time3 = System.currentTimeMillis();
        System.out.println("Time taken in operation of StringBuilder : " + (System.currentTimeMillis() - time3));
    }
}

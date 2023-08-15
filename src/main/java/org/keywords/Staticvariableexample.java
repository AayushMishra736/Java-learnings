package org.keywords;

public class Staticvariableexample {
    static int count = 0;

    public Staticvariableexample(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Staticvariableexample s1 = new Staticvariableexample();
        Staticvariableexample s2 = new Staticvariableexample();
        Staticvariableexample s3 = new Staticvariableexample();
    }


}

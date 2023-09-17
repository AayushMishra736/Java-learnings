package org.string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stringcompare {
    public static void main(String[] args) {
        String s1="Sachin";
        String s2="Sachin";
        String s3="Ratan";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s2));

        StringBuilder s4 = new StringBuilder("Aayush");
        s4.append(" Mishra");
        System.out.println(s4);

        System.out.println(String.format("%s%s",s1,s3));

        System.out.println((String.join(" ",s1,s3)));

        StringJoiner s5 = new StringJoiner(",");
        s5.add("John");
        s5.add("Snow");
        System.out.println(s5);

        List<String> list = Arrays.asList("Winter","is","coming.");
        String s6 = list.stream().collect(Collectors.joining(" "));
        System.out.println(s6);

        System.out.println(s6.substring(5));

        System.out.println(s6.substring(1,8));

        List<String> finalList = Arrays.asList("The","Quick","Brown","Fox","Jump","Over","The","Lazy","Dog");
        String s7 = finalList.stream().collect(Collectors.joining(" "));
        System.out.println(s7);

        String arr[] = s7.split("//");

        System.out.println(Arrays.toString(arr));

    }
}
